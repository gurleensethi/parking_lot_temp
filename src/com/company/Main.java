package com.company;

import com.company.controller.ParkingController;
import com.company.controller.impl.ParkingControllerImpl;
import com.company.model.Vehicle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        ParkingController parkingController = new ParkingControllerImpl();
        parkingController.createParkingLotController(6);
        parkingController.parkVehicleController(new Vehicle("DL-101-HH-234", "red"));

//        BufferedReader bufferReader = null;
//        String input = null;
//
//        switch (args.length) {
//            case 0: {
//                while (true) {
//
//                }
//                break;
//            }
//            case 1: {
//                break;
//            }
//            default: {
//
//            }
//        }
//
//        try {
//            bufferReader = new BufferedReader(new InputStreamReader(System.in));
//            input = bufferReader.readLine().trim();
//
//            System.out.println(input);
//        } catch (Exception e) {
//            System.out.println("Exception Aagyi");
//        }



    }
}
