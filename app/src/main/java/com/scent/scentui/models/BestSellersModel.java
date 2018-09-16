package com.scent.scentui.models;

import java.util.ArrayList;

public class BestSellersModel {

    ArrayList<BestSeller> bestSellers;

    public class BestSeller{
        public String name;
        public String productName;
        public int oldPrice;
        public int newPrice;
    }

}
