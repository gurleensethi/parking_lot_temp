package com.company.service;

import com.company.model.Vehicle;

import java.util.HashMap;
import java.util.List;

public interface ParkingService {

    public void createParkingLot(int capacity);

    public boolean parkVehicle(Vehicle vehicleToBeParked);

    public boolean unParkVehicle(int slotNumber);

    public HashMap<Integer, Vehicle> getParkingLotStatus();

    public List<String> getRegistrationNosFromColor(String colour);

    public Integer getSlotNoFromRegistrationNo(String registrationNo);

    public List<Integer> getSlotNumbersFromColor(String colour);

}
