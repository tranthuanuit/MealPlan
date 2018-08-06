package com.thuan.mealplan.height;

public class HeightPresenterImpl implements HeightPresenter {
    private HeightView heightView;

    public HeightPresenterImpl(HeightView heightView) {
        this.heightView = heightView;
    }

    @Override
    public void navigateToWeightActivity() {
        if(heightView != null) {
            heightView.navigateToWeight();
        }
    }

    @Override
    public void dismiss() {
        if(heightView != null) {
            heightView.dismiss();
        }
    }

    @Override
    public void mappingView() {
        if(heightView != null) {
            heightView.mappingView();
        }
    }

    @Override
    public void setupListener() {
        if(heightView != null) {
            heightView.setupListener();
        }
    }
}
