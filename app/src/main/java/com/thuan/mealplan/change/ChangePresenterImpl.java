package com.thuan.mealplan.change;

public class ChangePresenterImpl implements ChangePresenter {
    private ChangeView view;

    public ChangePresenterImpl(ChangeView view) {
        this.view = view;
    }

    @Override
    public void navigateToChooseGoal() {
        if(view != null) {
            view.navigateToAskGoal();
        }
    }
}
