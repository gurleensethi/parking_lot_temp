package com.company.model;

import java.util.Map;
import java.util.TreeSet;

public class ParkingLot {

    private Integer capacity;
    private Map<Integer, Vehicle> parkingMap;
    private TreeSet emptySlots;

    public ParkingLot(Integer capacity) {
        this.capacity = capacity;
        this.parkingMap = null;

        for (int i=1;i<=capacity;i++) {
            emptySlots.add(i);
        }
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Map<Integer, Vehicle> getParkingMap() {
        return parkingMap;
    }

    public void setParkingMap(Integer slotNumber, Vehicle vehicleParked) {
        parkingMap.put(slotNumber, vehicleParked);
    }
}
