package com.thuan.mealplan.birthday;

public class BirthDayPresenterImpl implements BirthDayPresenter {

    private BirthDayView view;

    public BirthDayPresenterImpl(BirthDayView view) {
        this.view = view;
    }

    @Override
    public void navigateToHeightActivity() {
        if(view != null) {
            view.navigateToHeightActivity();
        }
    }
}
