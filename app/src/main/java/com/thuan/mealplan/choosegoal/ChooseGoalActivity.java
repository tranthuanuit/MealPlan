package com.thuan.mealplan.choosegoal;

import com.thuan.mealplan.R;
import com.thuan.mealplan.base.BaseActivity;

public class ChooseGoalActivity extends BaseActivity implements ChooseGoalView {
    private ChooseGoalPresenter presenter;
    @Override
    public void mappingView() {
        presenter = new ChooseGoalPresenterImpl(this);
    }

    @Override
    public void setupListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_choose_goal;
    }
}
