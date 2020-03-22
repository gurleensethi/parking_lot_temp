package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader bufferReader = null;
        String input = null;

        try {
            bufferReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferReader.readLine().trim();

            System.out.println(input);
        } catch (Exception e) {
            System.out.println("Exception Aagyi");
        }
    }
}
