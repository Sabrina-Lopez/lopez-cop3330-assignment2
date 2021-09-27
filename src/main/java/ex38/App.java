package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nEnter a list of numbers, separated by spaces: "); //ask the user for a list of numbers
        Scanner numberListInput = new Scanner(System.in); //scan the list of numbers
        String numberList = numberListInput.nextLine();

        String[] numberListArray = numberList.split(" "); //create a string without the spaces

        Integer[] evenNumberList = filterEvenNumbers(numberListArray); //filter out the even numbers from the string

        System.out.print("The even numbers are "); //print out the list of even numbers filtered from the input
        for(int i = 0; i < evenNumberList.length; i++) {
            if (i < evenNumberList.length - 1) { //if the for loop has not reached the end of the even number list yet
                System.out.print(evenNumberList[i] + " ");
            }
            else { //if the for loop has reached the end of the even number list
                System.out.print(evenNumberList[i] + ".\n");
            }
        }

    }

    public static Integer[] filterEvenNumbers(String[] numberListArray) {
        ArrayList<Integer> newEvenList = new ArrayList<>(); //initialization of new arraylist

        for (String s : numberListArray) { //creating integers from the numbers in the string
            int num = Integer.parseInt(s);
            if (num % 2 == 0) { //adding only the even numbers into the new list
                newEvenList.add(num);
            }
        }

        Integer[] newNumberListArray = new Integer[newEvenList.size()]; //creating a new array to return to main
        newNumberListArray = newEvenList.toArray(newNumberListArray); //converting the arraylist to an array

        return newNumberListArray; //return the new array with the list of even numbers
    }
}

