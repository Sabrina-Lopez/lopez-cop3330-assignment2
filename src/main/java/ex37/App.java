package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is the minimum length? "); //ask the user for the minimum length they want the password
        Scanner passwordMinLengthInput = new Scanner(System.in); //scan the minimum length
        int passwordMinLength = passwordMinLengthInput.nextInt();

        System.out.println("\nHow many special characters? "); //ask the user for the number of special characters they want in their password
        Scanner numSpecialCharactersInput = new Scanner(System.in); //scan the number of special characters
        int numSpecialCharacters = numSpecialCharactersInput.nextInt();

        System.out.println("\nHow many numbers? "); //ask the user for the user for the number of numbers they want in their password
        Scanner numNumbersInput = new Scanner(System.in); //scan the number of numbers
        int numNumbers = numNumbersInput.nextInt();

        int totalNonAlphabeticalCharacters = numSpecialCharacters + numNumbers; //total of non-alphabetical characters the user wants in their password
        int generatedPasswordLength; //initialization to get the password length that follows the constraints

        //to ensure that the constraint of at there be at least as many letters as there are special characters and numbers
        if((totalNonAlphabeticalCharacters > passwordMinLength) || ((totalNonAlphabeticalCharacters) * 2 > passwordMinLength)) {
            generatedPasswordLength = totalNonAlphabeticalCharacters * 2;
        }
        else {
            generatedPasswordLength = passwordMinLength;
        }

        List<char[]> finalPassword; //initialized character arraylist
        finalPassword = generatePassword(generatedPasswordLength, numSpecialCharacters, numNumbers);

        //tell the user what their generated password is
        System.out.print("\nYour password is " );
        for(int i = 0; i < generatedPasswordLength; i++) {
            System.out.print(finalPassword.get(i));
        }

    }

    public static List<char[]> generatePassword(int generatedPasswordLength, int numSpecialCharacters, int numNumbers) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //all possible letters
        String specialCharacters = "!@#$%&*()'+,-./:;<=>?[]^_`{|}~"; //all possible special characters
        String numbers = "1234567890"; //all possible numbers

        Random random = new Random();

        //declare array list to hold the password characters
        char[] generatedPassword = new char[generatedPasswordLength];

        //input random special characters into the password
        for(int i = 0; i < numSpecialCharacters; i++){
            generatedPassword[i] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        }

        //input random numbers into the password
        for(int i = (numSpecialCharacters); i < (numNumbers + numSpecialCharacters + 1); i++){
            generatedPassword[i] = numbers.charAt(random.nextInt(numbers.length()));
        }

        //input random letters into the password
        for(int i = (numNumbers + numSpecialCharacters); i < generatedPasswordLength; i++){
            generatedPassword[i] = letters.charAt(random.nextInt(letters.length()));
        }

        List<char[]> finalGeneratedPasswordList = new ArrayList<>();
        Collections.addAll(finalGeneratedPasswordList, generatedPassword);
        Collections.shuffle(finalGeneratedPasswordList);

        //return the final generated password for the user
        return finalGeneratedPasswordList;
    }
}
