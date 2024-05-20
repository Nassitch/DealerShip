package com.Vehicle;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int releaseYear;

    public Vehicle(String brand, String model, int releaseYear) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    protected abstract boolean start();

    protected abstract boolean stop();

    public String displayInfo() {
        return "Details :" + "\nBrand : " + getBrand() + "\nModel : " + getModel() + "\nRelease year :" + getReleaseYear();
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }
}
