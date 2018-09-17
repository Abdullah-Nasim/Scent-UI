package com.scent.scentui.activities.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.viewholders.SellerGroupViewHolder;
import com.scent.scentui.models.BestSellerGroup;

import java.util.ArrayList;

public class BestSellerGroupRecyclerAdapter extends RecyclerView.Adapter<SellerGroupViewHolder> {

    private ArrayList<BestSellerGroup> mDataSet;

    public BestSellerGroupRecyclerAdapter(ArrayList<BestSellerGroup> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @NonNull
    @Override
    public SellerGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SellerGroupViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.seller_group_item, parent, false));     }

    @Override
    public void onBindViewHolder(@NonNull SellerGroupViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
