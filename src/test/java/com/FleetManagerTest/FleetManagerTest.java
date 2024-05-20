package com.FleetManagerTest;

import com.Car.Car;
import com.Error.VehicleNotFoundException;
import com.FleetManager.FleetManager;
import com.Motorcycle.Motorcycle;
import com.Vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FleetManagerTest {

    private FleetManager fleetManager;
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        fleetManager = new FleetManager();
        car = new Car("Toyota", "Corolla", 2020, 5);
        motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, false);
    }

    @Test
    public void testAddVehicle() {
        fleetManager.addVehicle(car);
        assertTrue(fleetManager.getVehicles().contains(car), " The car should be added to the fleet.");
    }

    @Test
    public void testRemoveVehicle() throws VehicleNotFoundException {
        fleetManager.addVehicle(car);
        fleetManager.removeVehicle(car);
        assertFalse(fleetManager.getVehicles().contains(car), " The car should be removed from the fleet.");
    }

    @Test
    public void testRemoveVehicleNotFound() {
        assertThrows(VehicleNotFoundException.class, () -> {
            fleetManager.removeVehicle(car);
        }, "Removing a non-existent car should throw VehicleNotFoundException.");
    }

    @Test
    public void testFindVehicleByModel() throws VehicleNotFoundException {
        fleetManager.addVehicle(car);
        Vehicle foundVehicle = fleetManager.findVehicleByModel("Corolla");
        assertEquals(car, foundVehicle, "The found vehicle should be the same as the added car.");
    }

    @Test
    public void testFindVehicleByModelNotFound() {
        assertThrows(VehicleNotFoundException.class, () -> {
            fleetManager.findVehicleByModel("NonExistentModel");
        }, "Finding a non-existent model should throw VehicleNotFoundException");
    }
}
