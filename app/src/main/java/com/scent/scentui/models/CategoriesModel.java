package com.scent.scentui.models;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class CategoriesModel {

    ArrayList<Category> categories;

    public class Category{
        public String name;
        public Drawable activeDrawable;
        public Drawable inActiveDrawable;
    }

}
