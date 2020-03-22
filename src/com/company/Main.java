package com.company;

import com.company.action_processor.ActionProcessor;
import com.company.action_processor.impl.ActionProcessorImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        /*

        ParkingController parkingController = new ParkingControllerImpl();
        parkingController.createParkingLotController(6);
        parkingController.parkVehicleController(new Vehicle("DL-101-HH-234", "red"));
        parkingController.parkVehicleController(new Vehicle("DL-101-HH-123", "black"));

        parkingController.getParkingLotStatusController();

        System.out.println("--------------------XX------------------");

        parkingController.unParkVehicleController(1);

        parkingController.getParkingLotStatusController();

        System.out.println("--------------------XX------------------");

        parkingController.parkVehicleController(new Vehicle("1234", "kala"));
        parkingController.parkVehicleController(new Vehicle("5678", "kala"));

        parkingController.getParkingLotStatusController();

        System.out.println("--------------------XX------------------");

        parkingController.unParkVehicleController(2);

        parkingController.getParkingLotStatusController();

        System.out.println("--------------------XX------------------");

        parkingController.getRegistrationNosFromColorController("kala");

        System.out.println("--------------------XX------------------");

        parkingController.getSlotNoFromRegistrationNoController("56781");

        */

        BufferedReader bufferReader = null;
        String input = null;

        ActionProcessor actionProcessor = new ActionProcessorImpl();

        switch (args.length) {
            case 0: {
                while (true) {
                    try {
                        bufferReader = new BufferedReader(new InputStreamReader(System.in));
                        input = bufferReader.readLine().trim();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        else {
                            if (actionProcessor.validate(input)) {
                                try {
                                    actionProcessor.execute(input.trim());
                                }
                                catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            else {

                            }
                        }
                    }
                    catch (Exception e) {
//                        throw new ParkingException(ErrorCode.INVALID_REQUEST.getMessage(), e);
                    }
                }
                break;
            }
            case 1: {
                break;
            }
            default: {

            }
        }

        try {
            bufferReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferReader.readLine().trim();

            System.out.println(input);
        } catch (Exception e) {
            System.out.println("Exception Aagyi");
        }



    }
}
