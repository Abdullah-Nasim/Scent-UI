package com.scent.scentui.activities.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.scent.scentui.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.icon_image_view)
    public ImageView iconIV;

    @BindView(R.id.category_text_view)
    public TextView categoryTV;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
