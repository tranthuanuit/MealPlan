package com.thuan.mealplan.weight;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.thuan.mealplan.R;
import com.thuan.mealplan.Toolbar;
import com.thuan.mealplan.base.BaseActivity;
import com.thuan.mealplan.change.ChangeActivity;

public class WeightActivity extends BaseActivity implements WeightView {

    private WeightPresenter presenter;
    private Toolbar toolbar;
    private Button btnContinue;

    @Override
    public void mappingView() {
        presenter = new WeightPresenterImpl(this);
        toolbar = findViewById(R.id.toolBar);
        btnContinue = findViewById(R.id.btnContinue);
    }

    @Override
    public void setupListener() {
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.navigateToNavigationActivity();
            }
        });
        toolbar.setOnClickBack(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.dismiss();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_weight;
    }

    @Override
    public void navigateToNavigationActivity() {
        Intent intent = new Intent(WeightActivity.this, ChangeActivity.class);
        startActivity(intent);
    }

    @Override
    public void dismiss() {
        finish();
    }
}
