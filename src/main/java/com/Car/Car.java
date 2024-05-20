package com.Car;

import com.Vehicle.Vehicle;
import com.VehicleActions.VehicleActions;

public class Car extends Vehicle implements VehicleActions {

    private int numberOfDoors;

    public Car(String brand, String model, int releaseYear, int numberOfDoors) {
        super(brand, model, releaseYear);
        this.numberOfDoors = numberOfDoors;
    }

    public boolean start() {
        return true;
    }

    public boolean stop() {
        return true;
    }

    public void displayCarInfo() {
        System.out.println(displayInfo() + "\nNumber of doors : " + getNumberOfDoors());
    }

    public void accelerate() {
        System.out.println(getBrand() + " is accelerating.");
    }

    public void brake() {
        System.out.println(getBrand() + " is braking.");
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}
