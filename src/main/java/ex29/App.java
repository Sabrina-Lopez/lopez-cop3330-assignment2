package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int returnRate;

        System.out.println("\nWhat is the rate of return? "); //ask the user for the rate of return
        Scanner returnRateInput = new Scanner(System.in); //scan the rate of return

        while((!returnRateInput.hasNextInt()) || (returnRateInput.nextInt() == 0)) {
            System.out.println("\nSorry. That's not a valid input. "); //inform the user that their input was invalid
            System.out.println("\nWhat is the rate of return? ");
            returnRateInput = new Scanner(System.in);
        }

        returnRate = returnRateInput.nextInt();


        int years = 72 / returnRate; //calculate the amount of years it will take to double the investment

        //tell the user the amount of years it will take to double the investment
        System.out.println("\nIt will take " + years + " years to double your initial investment.");

    }
}
