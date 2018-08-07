package com.thuan.mealplan.weight;

public class WeightPresenterImpl implements WeightPresenter {

    private WeightView weightView;

    public WeightPresenterImpl(WeightView weightView) {
        this.weightView = weightView;
    }

    @Override
    public void navigateToNavigationActivity() {
        if(weightView != null) {
            weightView.navigateToNavigationActivity();
        }
    }

    @Override
    public void dismiss() {
        if(weightView != null) {
            weightView.dismiss();
        }
    }
}
