package com.alex.Interfaces;

public class CarImpl implements CarInterface, CarDriftInterface{
    public String carName;
    public String masterName;

    public CarImpl(String carName, String masterName) {
        this.carName = carName;
        this.masterName = masterName;
    }

    @Override
    public String getCarName() {
        return this.carName;
    }

    @Override
    public String getMasterName() {
        return this.masterName;
    }

    @Override
    public void run(String direction) {
        System.out.println("run to " + direction);
    }

    @Override
    public void dirfiting() {
        System.out.println("now the car is drifiting ...");
    }
}
