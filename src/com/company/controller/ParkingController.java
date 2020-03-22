package com.company.controller;

import com.company.model.Vehicle;

import java.util.HashMap;
import java.util.List;

public interface ParkingController {

    public void createParkingLotController(int capacity);

    public boolean parkVehicleController(Vehicle vehicleToBeParked);

    public boolean unParkVehicleController(int slotNumber);

    public void getParkingLotStatusController();

    public void getRegistrationNosFromColorController(String colour);

    public void getSlotNoFromRegistrationNoController(String registrationNo);

    public void getSlotNumbersFromColorController(String colour);

}
