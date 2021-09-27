package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.Scanner;

class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double balance, double dailyRate, double income) {
        double numMonths; //number of months to pay off card
        double constant = 1.0 / 30.0;
        numMonths = -constant * (Math.log(1 + (balance / income) * (1 - Math.pow((1 + dailyRate), 30))) / Math.log(1 + dailyRate));
        return Math.ceil(numMonths);
    }
}

public class App {
    public static void main( String[] args ) {
        double numMonths; //number of months to pay off card

        System.out.println("\nWhat is your balance? "); //ask the user for their balance
        Scanner balanceInput = new Scanner(System.in); //scan their balance
        double balance = balanceInput.nextDouble();

        System.out.println("\nWhat is the APR on the card (as a percent; e.g. 12)? "); //ask the user for their APR
        Scanner aprInput = new Scanner(System.in); //scan their APR
        double apr = aprInput.nextDouble();

        double dailyRate = (apr / 100) / 365;

        System.out.println("\nWhat is the monthly payment you can make? "); //ask the user's income
        Scanner incomeInput = new Scanner(System.in); //scan their income
        double income = incomeInput.nextDouble();

        //calculate the number of months it will take the user to pay of their card
        numMonths = PaymentCalculator.calculateMonthsUntilPaidOff(balance, dailyRate, income);

        //tell the user the number of months it will take to pay of their card
        //numMonths rounded up to the next integer value
        System.out.println("\nIt will take you " + (int)numMonths + " months to pay off this card.");
    }
}

