package com.Motorcycle;
import com.Vehicle.Vehicle;
import com.VehicleActions.VehicleActions;

public class Motorcycle extends Vehicle implements VehicleActions {

    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int releaseYear, boolean hasSidecar) {
        super(brand, model, releaseYear);
        this.hasSidecar = hasSidecar;
    }

    public boolean start() {
        return true;
    }

    public boolean stop() {
        return true;
    }

    public void displayMotorcycleInfo() {
        System.out.println(displayInfo() + "\nSide-car : " + getHasSidecar());
    }

    public void accelerate() {
        System.out.println(getBrand() + " is accelerating.");
    }

    public void brake() {
        System.out.println(getBrand() + " is braking.");
    }

    public boolean getHasSidecar() {
        return this.hasSidecar;
    }
}
