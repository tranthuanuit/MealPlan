package com.thuan.mealplan.birthday;

public class BirthDayPresenterImpl implements BirthDayPresenter {

    private BirthDayView mainView;

    public BirthDayPresenterImpl(BirthDayView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void mappingView() {
        if(mainView != null) {
            mainView.mappingView();
        }
    }

    @Override
    public void setupListener() {
        if(mainView != null) {
            mainView.setupListener();
        }
    }

    @Override
    public void navigateToHeightActivity() {
        if(mainView != null) {
            mainView.navigateToHeightActivity();
        }
    }
}
