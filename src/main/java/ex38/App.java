package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
       /* int numIndex = 1; //keep track of the index being filled into the integer array

        System.out.println("\nEnter a list of numbers, separated by spaces: "); //ask the user for a list of numbers
        Scanner numListInput = new Scanner(System.in); //scan the list of numbers
        String numList = numListInput.nextLine();

        //convert string into character array
        int numListLength = numList.length();
        int [] numListArray = new int[];
        for (int i = 0; i < numListLength; i++) {
            if(numList.charAt(i) != ' ') {
                numListArray[] = numList.charAt(i);
                numIndex++;
            }
        }

        int [] evenNumList = filterEvenNumbers(numListArray);

        System.out.print("\nThe even numbers are ");
        for(int i = 0; i < evenNumList.length; i++){
            if(i < evenNumList.length - 1){
                System.out.print(evenNumList[i] + " ");
            }
            else
            {
                System.out.print(evenNumList[i] + ".");
            }
        }*/

    }

    public static int[] filterEvenNumbers(int[] numListArray) {
        //int nextEven = 0; //variable to keep track of index for the array with the even numbers

        int[] evenNumbers = new int[numListArray.length];

        /*for(int i = 0; i < numListArray.length; i++) {
            if(numListArray[i] % 2 == 0) {
                evenNumbers[nextEven] = numListArray[i];
                nextEven++;
            }
        }

        for(int i = 0; i < nextEven + 1; i++) {
            System.out.print(evenNumbers[i]);
        }*/

        return evenNumbers;

    }
}

