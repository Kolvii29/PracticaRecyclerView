package com.kelvin.recyclerview.data;

import com.kelvin.recyclerview.R;
import com.kelvin.recyclerview.domain.Car;
import com.kelvin.recyclerview.domain.FeatureCar;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositoryCars {

    private RepositoryCars() {
        //Utility class
    }

    public static List<Car> getListCar() {
        List<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Ford Mustang", 100.000f, new FeatureCar(R.color.classicCar, R.drawable.img_vehicle_classic_car)));
        carArrayList.add(new Car("Citroen C4", 20.000f, new FeatureCar(R.color.classicCar, R.drawable.img_vehicle_classic_car)));
        carArrayList.add(new Car("Ionic Electric", 35.000f, new FeatureCar(R.color.electricCar, R.drawable.img_vehicle_electric_car)));
        carArrayList.add(new Car("Bus Mercedes", 1000.000f, new FeatureCar(R.color.busCar, R.drawable.img_vehicle_bus)));
        carArrayList.add(new Car("Ford BMV", 105640.000f, new FeatureCar(R.color.busCar, R.drawable.img_vehicle_bus)));
        carArrayList.add(new Car("Space Mountain", 25034450.000f, new FeatureCar(R.color.ovniCar, R.drawable.img_vehicle_flying_car)));
        carArrayList.add(new Car("Porsche GT3", 155000.000f, new FeatureCar(R.color.ovniCar, R.drawable.img_vehicle_flying_car)));
        carArrayList.add(new Car("Yamaha MT09", 200.000f, new FeatureCar(R.color.ovniCar, R.drawable.img_vehicle_flying_car)));
        return carArrayList;

    }
}
