package com.scent.scentui.activities.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.viewholders.ItemViewHolder;
import com.scent.scentui.models.Item;

import java.util.ArrayList;

public class ItemsRecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<Item> mDataSet;

    ItemsRecyclerAdapter(ArrayList<Item> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.itemIV.setImageDrawable(mDataSet.get(position).image);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
