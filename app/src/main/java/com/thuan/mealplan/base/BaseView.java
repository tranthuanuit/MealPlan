package com.thuan.mealplan.base;

public interface BaseView {
    abstract void mappingView();
    abstract void setupListener();
    abstract void initData();
    abstract int getLayoutResource();
}
