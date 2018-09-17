package com.scent.scentui.models;

import android.graphics.drawable.Drawable;


public class Category{
    public String name;
    public Drawable activeDrawable;
    public Drawable inActiveDrawable;
    public boolean isSelected;

    public Category(String name, Drawable activeDrawable, Drawable inActiveDrawable, boolean isSelected) {
        this.name = name;
        this.activeDrawable = activeDrawable;
        this.inActiveDrawable = inActiveDrawable;
        this.isSelected = isSelected;
    }
}
