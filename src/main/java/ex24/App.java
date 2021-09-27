package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nEnter two strings, and I'll tell you if they are anagrams: "); //inform the user they'll need to input two strings

        System.out.println("\nEnter the first string: "); //ask the user to input the first string
        Scanner firstStringInput = new Scanner(System.in); //scan the first string
        String firstString = firstStringInput.next();

        System.out.println("\nEnter the second string: "); //ask the user to input the second string
        Scanner secondStringInput = new Scanner(System.in); //scan the second string
        String secondString = secondStringInput.next();

        if (isAnagram(firstString, secondString)) { //if the strings are anagrams
            System.out.println("\n\"" + firstString + "\" " + "and \"" + secondString + "\" are anagrams."); //tell the user that the strings are anagrams
        }
        else if (!isAnagram(firstString, secondString)) { //if the strings aren't anagrams
            System.out.println("\n\"" + firstString + "\" " + "and \"" + secondString + "\" are not anagrams."); //tell the user that the strings aren't anagrams
        }
    }

    public static boolean isAnagram(String firstString, String secondString) { //check to see if the string are anagrams of each other
        int firstStringLength = firstString.length(); //get the string length of the first string
        int secondStringLength = secondString.length(); //get the string length of the second string

        if(firstStringLength != secondStringLength) { //if the strings' lengths are not equal
            return false; //the strings aren't anagrams
        }

        char[] firstStringArray = firstString.toCharArray(); //convert the first string into a character array
        char[] secondStringArray = secondString.toCharArray(); //convert the second string into a character array

        Arrays.sort(firstStringArray); //sort the characters of the first string alphabetically
        Arrays.sort(secondStringArray); //sort the characters of the second string alphabetically

        return Arrays.equals(secondStringArray, firstStringArray); //if they match, the strings are anagrams

    }
}
