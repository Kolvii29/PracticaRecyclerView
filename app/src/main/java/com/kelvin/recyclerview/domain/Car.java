package com.kelvin.recyclerview.domain;

public class Car {
    private final String nameCar;
    private final float priceCar;
    private final FeatureCar featureCar;

    public Car(String nameCar, float priceCar, FeatureCar featureCar) {
        this.nameCar = nameCar;
        this.priceCar = priceCar;
        this.featureCar = featureCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public float getPriceCar() {
        return priceCar;
    }

    public FeatureCar getFeatureCar() {
        return featureCar;
    }
}

