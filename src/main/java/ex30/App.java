package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

public class App {
    public static void main( String[] args ) {
        int currNum;

        for(int i = 1; i < 13; i++) { //loop to go through the 12 values
            System.out.println("\n"); //move to next row of the multiplication table
            currNum = 0; //reset to 0
            for (int j = 0; j < 12; j++) { //loop go to through the 12 multiples of each value
                currNum = currNum + i; //increment to next multiple
                System.out.printf("%-5d", currNum); //print the next number in the multiplication table
            }
        }

    }
}
