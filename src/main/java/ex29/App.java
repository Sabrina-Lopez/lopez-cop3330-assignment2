package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;
import java.util.regex.*;

public class App {
    public static void main( String[] args ) {
        String returnRate;
        int returnRateInt = 0;
        boolean isValidInput = false;

        while (!isValidInput)
        {
            System.out.println("\nWhat is your rate of return? ");
            Scanner returnRateInput = new Scanner(System.in); //scan the rate of return
            returnRate = returnRateInput.nextLine();

            if (Pattern.matches("[0-9]+", returnRate) && Integer.parseInt(returnRate) != 0)
            {
                isValidInput = true;
                returnRateInt = Integer.parseInt(returnRate);
            }
            else
            {
                System.out.println("\nSorry. That's not a valid input.");
            }
        }

        int years = 72 / returnRateInt; //calculate the amount of years it will take to double the investment

        //tell the user the amount of years it will take to double the investment
        System.out.println("\nIt will take " + years + " years to double your initial investment.");

    }
}
