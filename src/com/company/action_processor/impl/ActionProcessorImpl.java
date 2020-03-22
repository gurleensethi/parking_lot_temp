package com.company.action_processor.impl;

import com.company.action_processor.ActionProcessor;
import com.company.constants.Constants;
import com.company.controller.ParkingController;
import com.company.controller.impl.ParkingControllerImpl;

import java.util.HashMap;
import java.util.Map;

public class ActionProcessorImpl implements ActionProcessor {

    private Map<String, Integer> validCommandsMap = null;
    private ParkingController parkingController = null;

    public ActionProcessorImpl() {
        validCommandsMap = new HashMap<>();
        validCommandsMap.put(Constants.STATUS, 1);
        validCommandsMap.put(Constants.CREATE_PARKING_LOT, 2);
        validCommandsMap.put(Constants.LEAVE, 2);
        validCommandsMap.put(Constants.REG_NUMBER_FOR_CARS_WITH_COLOR, 2);
        validCommandsMap.put(Constants.SLOTS_NUMBER_FOR_CARS_WITH_COLOR, 2);
        validCommandsMap.put(Constants.SLOTS_NUMBER_FOR_REG_NUMBER, 2);
        validCommandsMap.put(Constants.PARK, 2);

        parkingController = new ParkingControllerImpl();
    }

    @Override
    public boolean validate(String input) {

        String[] inputStrArr = input.split(" ");
        int n = inputStrArr.length;

        try {
            if (validCommandsMap.get(inputStrArr[0]) != n) {
                return false;
            }
        } catch (Exception exc) {
            System.out.println("Exception in validating request" + exc.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        String[] inputStrArr = input.split(" ");
        String commandString = inputStrArr[0];

        switch (commandString) {
            case Constants.STATUS:
                parkingController.getParkingLotStatusController();
                break;
            case Constants.CREATE_PARKING_LOT:
                break;
            case Constants.LEAVE:
                break;
            case Constants.REG_NUMBER_FOR_CARS_WITH_COLOR:
                break;
            case Constants.SLOTS_NUMBER_FOR_CARS_WITH_COLOR:
                break;
            case Constants.SLOTS_NUMBER_FOR_REG_NUMBER:
                break;
            case Constants.PARK:
                break;
            default:
                break;
        }
    }
}
