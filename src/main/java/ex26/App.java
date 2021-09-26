package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is your balance? "); //ask the user for their balance
        Scanner balanceInput = new Scanner(System.in); //scan their balance
        String balance = balanceInput.next();

        System.out.println("\nWhat is the APR on the card (as a percent; e.g. 12)? "); //ask the user for their APR
        Scanner aprInput = new Scanner(System.in); //scan their APR
        String apr = aprInput.next();

        System.out.println("\nWhat is the monthly payment you can make? "); //ask the user's income
        Scanner incomeInput = new Scanner(System.in); //scan their income
        String income = incomeInput.next();

    }
}
