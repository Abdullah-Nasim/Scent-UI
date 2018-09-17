package com.scent.scentui.activities.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.viewholders.CategoryViewHolder;
import com.scent.scentui.models.Category;

import java.util.ArrayList;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private ArrayList<Category> mDataSet;
    private Context mContext;

    private int currentSelected;

    public CategoriesRecyclerAdapter(ArrayList<Category> mDataSet, Context mContext) {
        this.mDataSet = mDataSet;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false));     }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {

        holder.categoryTV.setText(mDataSet.get(position).name);

        if(mDataSet.get(position).isSelected){
            currentSelected = holder.getAdapterPosition();
            holder.iconIV.setImageDrawable(mDataSet.get(position).activeDrawable);
            holder.categoryTV.setTextColor(ContextCompat.getColor(mContext, R.color.colorPrimaryDark));
        }else{
            holder.iconIV.setImageDrawable(mDataSet.get(position).inActiveDrawable);
            holder.categoryTV.setTextColor(ContextCompat.getColor(mContext, R.color.colorLightGrey));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mDataSet.get(holder.getAdapterPosition()).isSelected){
                    mDataSet.get(currentSelected).isSelected = false;
                    notifyItemChanged(currentSelected);
                    currentSelected = holder.getAdapterPosition();
                    mDataSet.get(currentSelected).isSelected = true;
                    notifyItemChanged(currentSelected);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
