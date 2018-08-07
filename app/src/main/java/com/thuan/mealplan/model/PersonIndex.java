package com.thuan.mealplan.model;

import java.util.Date;

public class PersonIndex {
    private Date birthDay;
    private Double height;
    private Double weight;

    public PersonIndex() { }

    public PersonIndex(Date birthDay, Double height, Double weight) {
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
