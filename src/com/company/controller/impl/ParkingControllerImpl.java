package com.company.controller.impl;

import com.company.controller.ParkingController;
import com.company.model.Vehicle;
import com.company.service.ParkingService;
import com.company.service.impl.ParkingServiceImpl;

import java.util.HashMap;
import java.util.List;

public class ParkingControllerImpl implements ParkingController {

    ParkingService parkingService = null;

    @Override
    public void createParkingLotController(int capacity) {
        parkingService = new ParkingServiceImpl();
        parkingService.createParkingLot(capacity);
    }

    @Override
    public boolean parkVehicleController(Vehicle vehicleToBeParked) {
        return parkingService.parkVehicle(vehicleToBeParked);
    }

    @Override
    public boolean unParkVehicleController(int slotNumber) {
        return parkingService.unParkVehicle(slotNumber);
    }

    @Override
    public void getParkingLotStatusController() {
        HashMap<Integer, Vehicle> parkingMap = parkingService.getParkingLotStatus();
//        for (int i=0;)
    }

    @Override
    public List<String> getRegistrationNosFromColorController(String colour) {
        return null;
    }

    @Override
    public Integer getSlotNoFromRegistrationNoController(String registrationNo) {
        return null;
    }

    @Override
    public List<Integer> getSlotNumbersFromColorController(String colour) {
        return null;
    }
}
