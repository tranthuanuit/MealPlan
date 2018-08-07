package com.thuan.mealplan.change;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.thuan.mealplan.R;
import com.thuan.mealplan.base.BaseActivity;
import com.thuan.mealplan.choosegoal.ChooseGoalActivity;

public class ChangeActivity extends BaseActivity implements ChangeView {
    private ChangePresenter presenter;
    private Button btnSetGoal;

    @Override
    public void mappingView() {
        presenter = new ChangePresenterImpl(this);
        btnSetGoal = findViewById(R.id.btnSetGoal);
    }

    @Override
    public void setupListener() {
        btnSetGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.navigateToChooseGoal();
            }
        });
    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_change;
    }

    @Override
    public void navigateToAskGoal() {
        Intent intent = new Intent(ChangeActivity.this, ChooseGoalActivity.class);
        startActivity(intent);
    }
}
