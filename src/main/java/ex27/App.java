package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nEnter the first name: "); //ask the user for their first name
        Scanner firstNameInput = new Scanner(System.in); //scan their first name
        String firstName = firstNameInput.nextLine();

        System.out.println("\nEnter the last name: "); //ask the user for their last name
        Scanner lastNameInput = new Scanner(System.in); //scan their last name
        String lastName = lastNameInput.nextLine();

        System.out.println("\nEnter the employee ID: "); //ask the user for their employee ID
        Scanner employeeIDInput = new Scanner(System.in); //scan their employee ID
        String employeeID = employeeIDInput.nextLine();

        System.out.println("\nEnter the ZIP code: "); //ask the user for their ZIP code
        Scanner zipCodeInput = new Scanner(System.in); //scan their ZIP code
        String zipCode = zipCodeInput.nextLine();

        validateInput(firstName, lastName, zipCode, employeeID); //validate the input

    }

    public static void validateInput (String firstName, String lastName, String zipCode, String employeeID){
        int firstNameLength = firstName.length(); //the length of the first name
        int lastNameLength = lastName.length(); //the length of the last name
        int employeeIDLength = employeeID.length(); //the length of the employeeID string
        int zipCodeLength = zipCode.length(); //the length of the zip code string
        int errorCounter = 0; //to count the number of errors from the user's input

        if(firstNameLength == 0){ //if there is no first name inputted
            System.out.println("\nThe last name must be at least 2 characters long. ");
            System.out.println("\nThe first name must be filled in. ");
            errorCounter = errorCounter + 2; //errors will be added for every error message the user receives
        }
        else if(firstNameLength == 1) { //if the first name is not long enough to be valid
            System.out.println("\nThe first name must be at least 2 characters long. ");
            errorCounter++;
        }

        if(lastNameLength == 0){ //if there is no last name inputted
            System.out.println("\nThe last name must be at least 2 characters long. ");
            System.out.println("\nThe last name must be filled in. ");
            errorCounter = errorCounter + 2;
        }
        else if(lastNameLength == 1) { //if the last name is not long enough to be valid
            System.out.println("\nThe last name must be at least 2 characters long. ");
            errorCounter++;
        }

        if(employeeIDLength != 7) { //if the employee ID isn't 7 characters
            System.out.println("\nThe employee ID must be in the format of AA-1234. ");
            errorCounter++;
        }
        else { //if the employee ID is 7 characters

            char[] employeeIDArray = employeeID.toCharArray(); //convert employeeID string to character array

            //check to see if the characters are in the correct format
            for (int i = 0; i < 7; i++) {//if the first two characters aren't alphabetic
                if (!(Character.isAlphabetic(employeeIDArray[0])) || !(Character.isAlphabetic(employeeIDArray[1]))) {
                    System.out.println("\nThe employee ID must be in the format of AA-1234. ");
                    errorCounter++;
                    break;
                }
                if (employeeIDArray[2] != '-') { //if the third character isn't a hyphen
                    System.out.println("\nThe employee ID must be in the format of AA-1234. ");
                    errorCounter++;
                    break;
                }

                //if the last four characters aren't numerical
                if (!(Character.isDigit(employeeIDArray[3])) || !(Character.isDigit(employeeIDArray[4])) || !(Character.isDigit(employeeIDArray[5])) || !(Character.isDigit(employeeIDArray[6]))) {
                    System.out.println("\nThe employee ID must be in the format of AA-1234. ");
                    errorCounter++;
                    break;
                }
            }
        }

        if(zipCodeLength != 5) { //if the zip code isn't 5 characters
            System.out.println("\nThe zipcode must be a 5 digit number. ");
            errorCounter++;
        }
        else {
            char[] zipCodeArray = zipCode.toCharArray(); //convert zip code string into character array

            //check to see if all the characters are numbers
            for (int i = 0; i < 5; i++) {
               if (!(Character.isDigit(zipCodeArray[i]))) { //if a character is not a number
                   System.out.println("\nThe zipcode must be a 5 digit number. ");
                   errorCounter++;
                   break;
               }
            }
        }

        if(errorCounter == 0) { //if the user has no errors in their inputs
            System.out.println("\nThere were no errors found. ");
        }

    }
}
