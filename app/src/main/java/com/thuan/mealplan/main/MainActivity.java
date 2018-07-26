package com.thuan.mealplan.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thuan.mealplan.R;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenterImpl(this);
    }

    @Override
    public void mappingView() {
        presenter.mappingView();
    }

    @Override
    public void setupListener() {
        presenter.setupListener();
    }

    @Override
    public void navigateToOtherView() {

    }
}
