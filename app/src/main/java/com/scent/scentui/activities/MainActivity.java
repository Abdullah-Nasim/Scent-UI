package com.scent.scentui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;

import com.scent.scentui.R;
import com.scent.scentui.activities.adapters.CategoriesRecyclerAdapter;
import com.scent.scentui.activities.adapters.MainRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.categories_recycler)
    RecyclerView categoriesRecycler;

    @BindView(R.id.main_recycler)
    RecyclerView mainRecycler;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter = new MainPresenter(this);

        initViews();
    }

    private void initViews() {
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ((SimpleItemAnimator) categoriesRecycler.getItemAnimator()).setSupportsChangeAnimations(false);
        mainRecycler.setLayoutManager(new LinearLayoutManager(this));
        categoriesRecycler.setAdapter(new CategoriesRecyclerAdapter(mainPresenter.getCategories(), this));
        mainRecycler.setAdapter(new MainRecyclerAdapter(mainPresenter.getMainList(), MainActivity.this));
    }
}
