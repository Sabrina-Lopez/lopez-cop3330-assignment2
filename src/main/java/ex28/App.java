package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int sumResult = 0; //result of the summation

        for(int i = 0; i < 5; i++) {
            System.out.println("\nEnter a number: "); //ask the user for a number
            Scanner numberInput = new Scanner(System.in); //scan their number
            int number = numberInput.nextInt();

            sumResult = sumResult + number;
        }

        System.out.println("\nThe total is " + sumResult + ".");

    }
}

/* Flowchart:

                                                                               (if "i" = 5) --> end the for loop -> print out the summation
                                                                                     |
    ask user for number -> scan the number -> add the number to the summation -> increment "i" --(if "i" < 5)--
    ^                                                                                                         |
    |                                                                                                         |
    -----------------------------------------------------------------------------------------------------------

 */
