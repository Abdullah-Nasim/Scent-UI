package com.scent.scentui.models;

public class BestSellerGroup {

    public Seller1 seller1;
    public Seller2 seller2;
    public Seller3 seller3;

    public BestSellerGroup(Seller1 seller1, Seller2 seller2, Seller3 seller3) {
        this.seller1 = seller1;
        this.seller2 = seller2;
        this.seller3 = seller3;
    }

    public static class Seller1{
        public String name;
        public String productName;
        public int oldPrice;
        public int newPrice;

        public Seller1(String name, String productName, int oldPrice, int newPrice) {
            this.name = name;
            this.productName = productName;
            this.oldPrice = oldPrice;
            this.newPrice = newPrice;
        }
    }
    public static class Seller2{
        public String name;
        public String productName;
        public int oldPrice;
        public int newPrice;

        public Seller2(String name, String productName, int oldPrice, int newPrice) {
            this.name = name;
            this.productName = productName;
            this.oldPrice = oldPrice;
            this.newPrice = newPrice;
        }
    }
    public static class Seller3{
        public String name;
        public String productName;
        public int oldPrice;
        public int newPrice;

        public Seller3(String name, String productName, int oldPrice, int newPrice) {
            this.name = name;
            this.productName = productName;
            this.oldPrice = oldPrice;
            this.newPrice = newPrice;
        }
    }
}
