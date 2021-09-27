package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is your age? "); //ask the user for their age
        Scanner ageInput = new Scanner(System.in); //scan their age
        while (!ageInput.hasNextDouble()) { //to check if the user is inputting a numeric value
            System.out.println("\nPlease input a numeric value for your age. ");
            ageInput = new Scanner(System.in);
        }
        double age = ageInput.nextDouble();

        System.out.println("\nWhat is your resting heart rate? "); //ask the user for their resting heart rate
        Scanner restingHRInput = new Scanner(System.in); //scan their resting heart rate
        while (!restingHRInput.hasNextDouble()) { //to check if the user is inputting a numeric value
            System.out.println("\nPlease input a numeric value for your resting heart rate. ");
            restingHRInput = new Scanner(System.in);
        }
        double restingHR = restingHRInput.nextDouble();

        System.out.println("\nResting Pulse: " + String.format("%3.0f", restingHR) + "     Age: " + String.format("%3.0f", age));
        System.out.println("\nIntensity   | Rate");
        System.out.print("------------|---------\n");

        for(int i = 0; i < 9; i++) {
            int intensity = (55 + (5 * i)) / 100;
            double targetHeartRate = (((220 - age) - restingHR) * (double)(intensity)) + restingHR;
            System.out.println(intensity + "%         | " + String.format("%4.0f", targetHeartRate) + " bpm");
        }

    }
}
