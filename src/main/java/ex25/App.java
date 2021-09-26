package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nEnter a password, and I'll check the password's strength. "); //inform the user that they'll need to input a password
        System.out.println("\nEnter a password: "); //ask the user to input a password
        Scanner passwordInput = new Scanner(System.in); //scan the first string
        String password = passwordInput.next();

        int passwordStrength = passwordValidator(password); //check for the strength of the password

        switch (passwordStrength) {
            case 1:
                System.out.println("\nThe password \"" + password + "\" is a very weak password. "); //tell the user the password is very weak
                break;
            case 2:
                System.out.println("\nThe password \"" + password + "\" is a weak password. "); //tell the user the password is weak
                break;
            case 3:
                System.out.println("\nThe password \"" + password + "\" is a strong password. "); //tell the user the password is strong
                break;
            case 4:
                System.out.println("\nThe password \"" + password + "\" is a very strong password. "); //tell the user the password is very strong
                break;
        }

    }

    public static int passwordValidator(String password) {
        //declare password strength levels
        int veryWeakPassword = 1;
        int weakPassword = 2;
        int strongPassword = 3;
        int veryStrongPassword = 4;

        //number and special character counters
        int numPasswordNumbers = 0;
        int numSpecialCharacters = 0;

        //string with all special characters
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        int passwordLength = password.length();

        if(passwordLength < 8) { //if password has less than 8 characters
            if(password.matches("[0-9]+")) { //if password is numeric
                return veryWeakPassword;
            }
            else if(password.matches("[a-zA-Z]+")) { //if password is alphabetic
                return weakPassword;
            }
            else { //if the password is simply less than 8 characters
                return weakPassword;
            }
        }
        else { //if password has 8 or more characters
            char[] passwordArray = password.toCharArray(); //convert the password into a character array

            for (int i = 0; i < passwordLength; i++) {
                if(Character.isDigit(passwordArray[i])) { //if character in index is numeric
                    numPasswordNumbers++;
                }
                if(specialCharactersString.contains(Character.toString(passwordArray[i]))) { //if character in index is a special character
                    numSpecialCharacters++;
                }
            }
            if((numPasswordNumbers > 1) && (numSpecialCharacters > 0)) { //if the password has letters, numbers, and special characters
                return veryStrongPassword;
            }
            else if(numPasswordNumbers >= 1) { //if the password has letters and at least one number
                return strongPassword;
            }
            else if((numPasswordNumbers == 0) && (numSpecialCharacters > 0)) { //if the password has letters and special characters but no numbers
                return strongPassword;
            }
            else { //if the password is simply 8 characters of more
                return strongPassword;
            }
        }
    }
}
