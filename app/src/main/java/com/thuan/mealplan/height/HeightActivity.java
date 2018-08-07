
package com.thuan.mealplan.height;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.thuan.mealplan.R;
import com.thuan.mealplan.Toolbar;
import com.thuan.mealplan.base.BaseActivity;
import com.thuan.mealplan.weight.WeightActivity;

public class HeightActivity extends BaseActivity implements HeightView {

    private HeightPresenter presenter;
    private ImageView imgHeightIcon;
    private TextView tvHeightTitle;
    private RecyclerView rcHeightList;
    private Toolbar toolbar;
    private Button btnContinue;
    private TextView tvTitleContent;

    @Override
    public void navigateToWeight() {
        Intent intent = new Intent(HeightActivity.this, WeightActivity.class);
        startActivity(intent);
    }

    @Override
    public void dismiss() {
        finish();
    }

    @Override
    public void mappingView() {
        presenter = new HeightPresenterImpl(this);
        toolbar = findViewById(R.id.toolBar);
        btnContinue = findViewById(R.id.btnContinue);
        imgHeightIcon = findViewById(R.id.imgHeihgtIcon);
        tvHeightTitle = findViewById(R.id.heightTitle);
        rcHeightList = findViewById(R.id.heightRecycleView);
        tvTitleContent = findViewById(R.id.tvTitleContent);
//        toolbar.setTitle("");
    }

    @Override
    public void setupListener() {
        toolbar.setOnClickBack(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               presenter.dismiss();
            }
        });
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.navigateToWeightActivity();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_height;
    }
}
