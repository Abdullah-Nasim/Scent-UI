package com.scent.scentui.activities.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.viewholders.BannerViewHolder;
import com.scent.scentui.activities.adapters.viewholders.MainViewHolder;
import com.scent.scentui.models.Main;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Main> mDataSet;
    private Context mContext;

    private static int BANNER_VIEW_TYPE = 0;
    private static int BESTSELLERS_VIEW_TYPE = 1;
    private static int MAIN_VIEW_TYPE = 2;

    public MainRecyclerAdapter(ArrayList<Main> mDataSet, Context mContext) {
        this.mDataSet = mDataSet;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == BANNER_VIEW_TYPE){
            return new BannerViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.banner_item, parent, false));
        }else if(viewType == BESTSELLERS_VIEW_TYPE){
            return new MainViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.main_item, parent, false));
        }else if(viewType == MAIN_VIEW_TYPE){
            return new MainViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.main_item, parent, false));
        }else{
            return new MainViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.main_item, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof MainViewHolder){

            MainViewHolder mainViewHolder = (MainViewHolder) holder;

            if(getItemViewType(position) == BESTSELLERS_VIEW_TYPE){

                if(mDataSet.get(position).isExpanded){
                    mainViewHolder.recyclerView.setVisibility(View.VISIBLE);
                    mainViewHolder.expandIV.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_up));
                }else{
                    mainViewHolder.recyclerView.setVisibility(View.GONE);
                    mainViewHolder.expandIV.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_down));
                }

                mainViewHolder.titleTV.setText(mDataSet.get(position).title);
                PagerSnapHelper snapHelper = new PagerSnapHelper();
                mainViewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
                mainViewHolder.recyclerView.setAdapter(new BestSellerGroupRecyclerAdapter(mDataSet.get(holder.getAdapterPosition()).bestSellerGroups));
                if(mainViewHolder.recyclerView.getOnFlingListener() == null)
                    snapHelper.attachToRecyclerView(mainViewHolder.recyclerView);

            }else{

                mainViewHolder.titleTV.setText(mDataSet.get(position).title);
                mainViewHolder.recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
                mainViewHolder.recyclerView.setAdapter(new ItemsRecyclerAdapter(mDataSet.get(position).items));

                if(mDataSet.get(position).isExpanded){
                    mainViewHolder.recyclerView.setVisibility(View.VISIBLE);
                    mainViewHolder.expandIV.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_up));
                }else{
                    mainViewHolder.recyclerView.setVisibility(View.GONE);
                    mainViewHolder.expandIV.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_down));
                }
            }

            mainViewHolder.expandIV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mDataSet.get(holder.getAdapterPosition()).isExpanded){
                        mDataSet.get(holder.getAdapterPosition()).isExpanded = false;
                        notifyItemChanged(holder.getAdapterPosition());
                    }else{
                        mDataSet.get(holder.getAdapterPosition()).isExpanded = true;
                        notifyItemChanged(holder.getAdapterPosition());
                    }
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(mDataSet.get(position).isBanner){
            return BANNER_VIEW_TYPE;
        }else if(position == 1){
            return BESTSELLERS_VIEW_TYPE;
        }else{
            return MAIN_VIEW_TYPE;
        }
    }
}
