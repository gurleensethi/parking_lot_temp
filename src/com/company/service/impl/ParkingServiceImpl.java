package com.company.service.impl;

import com.company.model.ParkingLot;
import com.company.model.Vehicle;
import com.company.service.ParkingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    ParkingLot parkingLot = null;

    @Override
    public void createParkingLot(int capacity) {
        parkingLot = new ParkingLot(capacity);
    }

    @Override
    public boolean parkVehicle(Vehicle vehicleToBeParked) {
        int nearestFreeSlotNo = parkingLot.getNearestFreeSlot();
        if (nearestFreeSlotNo == -1) {
            return false;
        }
        parkingLot.setParkingMapEntry(nearestFreeSlotNo, vehicleToBeParked);
        parkingLot.fillSlot(nearestFreeSlotNo);

        return true;
    }

    @Override
    public boolean unParkVehicle(int slotNumber) {
        if (slotNumber < 1 || slotNumber > parkingLot.getCapacity()) {
            return false;
        }
        if (parkingLot.getVehicle(slotNumber) == null) {
            return false;
        }
        parkingLot.setParkingMapEntry(slotNumber, null);
        parkingLot.vacateSlot(slotNumber);
        return true;
    }

    @Override
    public HashMap<Integer, Vehicle> getParkingLotStatus() {
        return parkingLot.getParkingMap();
    }

    @Override
    public List<String> getRegistrationNosFromColor(String colour) {
        List<String> regNosList = new ArrayList<>();

        HashMap<Integer, Vehicle> parkingMap = parkingLot.getParkingMap();
        for (int i=1;i<=parkingLot.getCapacity();i++) {
            Vehicle veh = parkingMap.get(i);
            if (null != veh) {
                if (veh.getColour().equals(colour.toLowerCase())) {
                    regNosList.add(veh.getRegistrationNumber());
                }
            }
        }

        return regNosList;
    }

    @Override
    public Integer getSlotNoFromRegistrationNo(String registrationNo) {
        HashMap<Integer, Vehicle> parkingMap = parkingLot.getParkingMap();
        for (int i=1;i<=parkingLot.getCapacity();i++) {
            Vehicle veh = parkingMap.get(i);
            if (null != veh) {
                if (veh.getRegistrationNumber().equals(registrationNo)) {
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public List<Integer> getSlotNumbersFromColor(String colour) {
        List<Integer> slotNoList = new ArrayList<>();

        HashMap<Integer, Vehicle> parkingMap = parkingLot.getParkingMap();
        for (int i=1;i<=parkingLot.getCapacity();i++) {
            Vehicle veh = parkingMap.get(i);
            if (null != veh) {
                if (veh.getColour().equals(colour.toLowerCase())) {
                    slotNoList.add(i);
                }
            }
        }

        return slotNoList;
    }
}
