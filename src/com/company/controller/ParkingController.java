package com.company.controller;

import com.company.model.Vehicle;

import java.util.HashMap;
import java.util.List;

public interface ParkingController {

    public void createParkingLotController(int capacity);

    public boolean parkVehicleController(Vehicle vehicleToBeParked);

    public boolean unParkVehicleController(int slotNumber);

    public void getParkingLotStatusController();

    public List<String> getRegistrationNosFromColorController(String colour);

    public Integer getSlotNoFromRegistrationNoController(String registrationNo);

    public List<Integer> getSlotNumbersFromColorController(String colour);

}
