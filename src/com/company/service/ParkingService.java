package com.company.service;

import com.company.model.Vehicle;

import java.util.List;

public interface ParkingService {

    public void createParkingLot(int capacity);

    public Boolean parkVehicle(Vehicle vehicle);

    public Boolean unParkVehicle(int slotNumber);

    public void getParkingLotStatus();

    public List<String> getRegistrationNosFromColor(String colour);

    public Integer getSlotNoFromRegistrationNo(String registrationNo);

    public List<Integer> getSlotNumbersFromColor(String colour);

}
