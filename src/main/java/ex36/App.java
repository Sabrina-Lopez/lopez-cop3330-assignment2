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
        int numNumbers = 0;
        double totalOfNumbers = 0.0;
        int maximum = 0;
        int minimum = 0;
        double average;
        double standardDeviation = 0;

        while(!(currentNumber.equals("done"))) {
            System.out.println("\nEnter a number: "); //ask the user for a number
            Scanner currentNameInput = new Scanner(System.in); //scan the number
            currentNumber = currentNameInput.next();
            if(!(currentNumber.equals("done"))) {
                numbersArrayList.add(currentNumber);
                numNumbers++;
            }
        }

        int[] numbersArray = new int[numNumbers + 1];

        System.out.print("\nNumbers: ");
        for(int i = 0; i < numNumbers; i++) {
            numbersArray[i] = Integer.parseInt(numbersArrayList.get(i));
            System.out.print(numbersArray[i] + ", ");
            totalOfNumbers += numbersArray[i];
        }


        average = totalOfNumbers / numNumbers;

        for(int i = 0; i < numNumbers - 1; i++) {
            maximum = Math.max(numbersArray[i], numbersArray[i + 1]);
            minimum = Math.min(numbersArray[i], numbersArray[i + 1]);
        }

        for(int i = 0; i < numNumbers; i++) {
            standardDeviation = standardDeviation + Math.pow((numbersArray[i] - average), 2);
        }

        double squareRoot = standardDeviation / numNumbers;
        double deviationResult = Math.sqrt(squareRoot);

        System.out.println("\nThe average is " + String.format("%.1f", average));
        System.out.println("The minimum is " + minimum);
        System.out.println("The maximum is " + maximum);
        System.out.println("The standard deviation is " + String.format("%.2f", deviationResult));

    }
}

