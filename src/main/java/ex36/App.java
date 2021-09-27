package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;

public class App {
    public static void main( String[] args ) {
        String currentNumber = "0";
        ArrayList<String> numbersArrayList = new ArrayList<>(15);
        int numNumbers = 0; //number of numbers that the user inputs
        double totalOfNumbers = 0.0; //the summation of the numbers
        int maximum = 0; //the maximum of the numbers
        int minimum = 0; //the minimum of the numbers
        double average; //the average of the numbers
        double standardDeviation = 0; //the standard deviation of the numbers

        while(!(currentNumber.equals("done"))) { //if the user is not done putting numbers into the program yet
            System.out.println("\nEnter a number: "); //ask the user for a number
            Scanner currentNameInput = new Scanner(System.in); //scan the number
            currentNumber = currentNameInput.next();
            if(!(currentNumber.equals("done"))) { //prevent the "done" from being inputted into the arraylist
                numbersArrayList.add(currentNumber);
                numNumbers++;
            }
        }

        int[] numbersArray = new int[numNumbers + 1]; //integer array initialization

        //printing out the numbers for the user while filling the integer array and adding the converted integers of the integer array
        System.out.print("\nNumbers: ");
        for(int i = 0; i < numNumbers; i++) {
            numbersArray[i] = Integer.parseInt(numbersArrayList.get(i));
            System.out.print(numbersArray[i] + ", ");
            totalOfNumbers += numbersArray[i];
        }

        //calculate the average of the numbers
        average = totalOfNumbers / numNumbers;

        //find the maximum and minimum of the numbers
        for(int i = 0; i < numNumbers - 1; i++) {
            maximum = Math.max(numbersArray[i], numbersArray[i + 1]);
            minimum = Math.min(numbersArray[i], numbersArray[i + 1]);
        }

        //calculate the standard deviation
        for(int i = 0; i < numNumbers; i++) {
            standardDeviation = standardDeviation + Math.pow((numbersArray[i] - average), 2);
        }
        double squareRoot = standardDeviation / numNumbers;
        double deviationResult = Math.sqrt(squareRoot);

        //telling the user all the calculation results
        System.out.println("\nThe average is " + String.format("%.1f", average));
        System.out.println("The minimum is " + minimum);
        System.out.println("The maximum is " + maximum);
        System.out.println("The standard deviation is " + String.format("%.2f", deviationResult));

    }
}

