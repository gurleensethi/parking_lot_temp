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
        parkingMap.forEach((slotNumber, vehicleParked) -> {
            System.out.println(slotNumber + "\t" + vehicleParked.getRegistrationNumber() + "\t" + vehicleParked.getColour());
        });
    }

    @Override
    public void getRegistrationNosFromColorController(String colour) {
        List<String> regNoList = parkingService.getRegistrationNosFromColor(colour);
        for (int i=0;i<regNoList.size();i++) {
            System.out.print(regNoList.get(i) + "\t");
        }
        System.out.print("\n");
    }

    @Override
    public void getSlotNoFromRegistrationNoController(String registrationNo) {
        System.out.println("Slot Number: " + parkingService.getSlotNoFromRegistrationNo(registrationNo));
    }

    @Override
    public void getSlotNumbersFromColorController(String colour) {
    }
}
