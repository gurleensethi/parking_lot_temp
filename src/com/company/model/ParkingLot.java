package com.company.model;

import java.util.HashMap;
import java.util.TreeSet;

public class ParkingLot {

    private Integer capacity;
    private HashMap<Integer, Vehicle> parkingMap;
    private TreeSet<Integer> emptySlots;

    public ParkingLot(Integer capacity) {
        this.capacity = capacity;
        this.parkingMap = new HashMap<>();

        for (int i=1;i<=capacity;i++) {
            emptySlots.add(i);
        }
    }

    public Integer getCapacity() {
        return capacity;
    }

    public HashMap<Integer, Vehicle> getParkingMap() {
        return parkingMap;
    }

    public Vehicle getVehicle(int slotNumber) {
        return parkingMap.get(slotNumber);
    }

    public void setParkingMapEntry(Integer slotNumber, Vehicle vehicleParked) {
        parkingMap.put(slotNumber, vehicleParked);
    }

    public int getNearestFreeSlot() {
        if (emptySlots.isEmpty()) {
            return -1;
        }
        return emptySlots.first();
    }

    public void fillSlot(int slotNumber) {
        emptySlots.remove(slotNumber);
    }

    public void vacateSlot(int slotNumber) {
        emptySlots.add(slotNumber);
    }
}
