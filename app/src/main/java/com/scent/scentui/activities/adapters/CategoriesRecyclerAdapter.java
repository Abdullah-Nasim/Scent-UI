package com.scent.scentui.activities.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.viewholders.CategoryViewHolder;
import com.scent.scentui.models.Category;

import java.util.ArrayList;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private ArrayList<Category> mDataSet;

    public CategoriesRecyclerAdapter(ArrayList<Category> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false));     }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.iconIV.setImageDrawable(mDataSet.get(position).activeDrawable);
        holder.categoryTV.setText(mDataSet.get(position).name);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
