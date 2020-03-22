package com.company.service.impl;

import com.company.model.Vehicle;
import com.company.service.ParkingService;

import java.util.List;

public class ParkingServiceImpl implements ParkingService {



    @Override
    public void createParkingLot(int capacity) {

    }

    @Override
    public Boolean parkVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Boolean unParkVehicle(int slotNumber) {
        return null;
    }

    @Override
    public void getParkingLotStatus() {

    }

    @Override
    public List<String> getRegistrationNosFromColor(String colour) {
        return null;
    }

    @Override
    public Integer getSlotNoFromRegistrationNo(String registrationNo) {
        return null;
    }

    @Override
    public List<Integer> getSlotNumbersFromColor(String colour) {
        return null;
    }
}
