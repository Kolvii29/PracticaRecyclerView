package com.kelvin.recyclerview.domain;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;

public class FeatureCar {
    private final @ColorRes int colorRes;
    private final @DrawableRes int imgCar;

    public FeatureCar(@ColorRes int colorRes, @DrawableRes int imgCar) {
        this.colorRes = colorRes;
        this.imgCar = imgCar;
    }

    public int getColorRes() {
        return colorRes;
    }

    public int getImgCar() {
        return imgCar;
    }
}

