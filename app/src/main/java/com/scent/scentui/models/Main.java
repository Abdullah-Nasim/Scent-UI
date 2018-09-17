package com.scent.scentui.models;

import java.util.ArrayList;

public class Main {
    public String title;
    public ArrayList<BestSellerGroup> bestSellerGroups;
    public ArrayList<Item> items;
    public boolean isBanner;
    public boolean isExpanded;

    public Main(String title, ArrayList<BestSellerGroup> bestSellerGroups, ArrayList<Item> items, boolean isBanner, boolean isExpanded) {
        this.title = title;
        this.bestSellerGroups = bestSellerGroups;
        this.items = items;
        this.isBanner = isBanner;
        this.isExpanded = isExpanded;
    }
}
