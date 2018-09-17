package com.scent.scentui.activities.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.scent.scentui.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.title_text_view)
    public TextView titleTV;

    @BindView(R.id.down_up_image_view)
    public ImageView expandIV;

    @BindView(R.id.recycler)
    public RecyclerView recyclerView;

    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
