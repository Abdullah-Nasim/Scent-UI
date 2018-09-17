package com.scent.scentui.activities;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.scent.scentui.R;
import com.scent.scentui.models.BestSellerGroup;
import com.scent.scentui.models.Category;
import com.scent.scentui.models.Item;
import com.scent.scentui.models.Main;

import java.util.ArrayList;

class MainPresenter {

    private ArrayList<Category> categories;
    private ArrayList<BestSellerGroup> bestSellerGroups;
    private ArrayList<Item> items;
    private Context mContext;

    MainPresenter(Context mContext) {
        categories = new ArrayList<>();
        bestSellerGroups = new ArrayList<>();
        items = new ArrayList<>();
        this.mContext = mContext;
    }

    ArrayList<Category> getCategories(){
        categories.add(new Category("Combs", ContextCompat.getDrawable(mContext, R.drawable.ic_comb),  ContextCompat.getDrawable(mContext, R.drawable.ic_comb_grey), true));
        categories.add(new Category("Perfumes", ContextCompat.getDrawable(mContext, R.drawable.ic_perfume),  ContextCompat.getDrawable(mContext, R.drawable.ic_perfume_grey), false));
        categories.add(new Category("Powders", ContextCompat.getDrawable(mContext, R.drawable.ic_powder),  ContextCompat.getDrawable(mContext, R.drawable.ic_powder_grey), false));

        categories.add(new Category("Comb", ContextCompat.getDrawable(mContext, R.drawable.ic_comb),  ContextCompat.getDrawable(mContext, R.drawable.ic_comb_grey), false));
        categories.add(new Category("Perfumes", ContextCompat.getDrawable(mContext, R.drawable.ic_perfume),  ContextCompat.getDrawable(mContext, R.drawable.ic_perfume_grey), false));
        categories.add(new Category("Powders", ContextCompat.getDrawable(mContext, R.drawable.ic_powder),  ContextCompat.getDrawable(mContext, R.drawable.ic_powder_grey), false));

        categories.add(new Category("Comb", ContextCompat.getDrawable(mContext, R.drawable.ic_comb),  ContextCompat.getDrawable(mContext, R.drawable.ic_comb_grey), false));
        categories.add(new Category("Perfumes", ContextCompat.getDrawable(mContext, R.drawable.ic_perfume),  ContextCompat.getDrawable(mContext, R.drawable.ic_perfume_grey), false));
        categories.add(new Category("Powders", ContextCompat.getDrawable(mContext, R.drawable.ic_powder),  ContextCompat.getDrawable(mContext, R.drawable.ic_powder_grey), false));
        return categories;
    }


    private void setUpBestSellerGroups(){
        bestSellerGroups.add(new BestSellerGroup(new BestSellerGroup.Seller1("", "",0,0), new BestSellerGroup.Seller2("", "",0,0), new BestSellerGroup.Seller3("", "",0,0)));
        bestSellerGroups.add(new BestSellerGroup(new BestSellerGroup.Seller1("", "",0,0), new BestSellerGroup.Seller2("", "",0,0), new BestSellerGroup.Seller3("", "",0,0)));
        bestSellerGroups.add(new BestSellerGroup(new BestSellerGroup.Seller1("", "",0,0), new BestSellerGroup.Seller2("", "",0,0), new BestSellerGroup.Seller3("", "",0,0)));
    }

    private void setUpItems(){
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
        items.add(new Item("", ContextCompat.getDrawable(mContext, R.drawable.lip)));
    }

    ArrayList<Main> getMainList(){
        setUpBestSellerGroups();
        setUpItems();
        ArrayList<Main> mainList = new ArrayList<>();
        mainList.add(new Main("Banner", null, null, true));
        mainList.add(new Main("Bestseller", bestSellerGroups, null, false));
        mainList.add(new Main("Lips", null, items, false));
        mainList.add(new Main("Face", null, items, false));
        mainList.add(new Main("Nails", null, items, false));
        return mainList;
    }
}
