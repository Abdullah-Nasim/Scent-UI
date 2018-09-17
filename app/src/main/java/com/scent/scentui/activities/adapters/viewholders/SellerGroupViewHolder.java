package com.scent.scentui.activities.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.scent.scentui.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SellerGroupViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.parent_linear_layout)
    public LinearLayout parentLL;

    public SellerGroupViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
