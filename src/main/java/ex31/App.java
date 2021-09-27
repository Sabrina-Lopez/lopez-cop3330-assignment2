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

        //initial tablet format setup
        System.out.println("\nResting Pulse: " + String.format("%3.0f", restingHR) + "     Age: " + String.format("%3.0f", age));
        System.out.println("\nIntensity   | Rate");
        System.out.print("------------|---------\n");

        double baseIntensity = 0.55;

        //input of the intensities and the target heart rate calculations into the chart
        for(int i = 0; i < 9; i++) {
            double intensity = (baseIntensity + (0.05 * i)); //intensity calculation
            double targetHeartRate = (((220 - age) - restingHR) * (intensity)) + restingHR; //target heart rate calculation
            System.out.println(String.format("%2.0f", (intensity * 100)) + "%         | " + String.format("%4.0f", targetHeartRate) + " bpm");
        }

    }
}
