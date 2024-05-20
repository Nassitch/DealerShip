package com.FleetManager;
import com.Error.VehicleNotFoundException;
import com.Vehicle.Vehicle;
import java.util.ArrayList;

public class FleetManager {

    private ArrayList<Vehicle> vehicles;

    public FleetManager() {
        vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicles;
    }

    public void removeVehicle(Vehicle vehicle) throws VehicleNotFoundException {
        if (!vehicles.remove(vehicle)) {
            throw new VehicleNotFoundException("Vehicle not found in the fleet.");
        }
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.displayInfo());
        }
    }

    public Vehicle findVehicleByModel(String model) throws VehicleNotFoundException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(model)) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Vehicle with model " + model + " not found.");
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
