package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;

public class App {
    public static void main( String[] args ) {
        String currentName = "0";
        ArrayList<String> namesArrayList = new ArrayList<>(15);
        int numNames = 0; //the number of names that the user inputted into the program
        int winner; //the winner from the list of names that the user inputted

        while(!(currentName.equals(""))) { //if the user is not done inputting names into the program yet
            System.out.println("\nEnter a name: "); //ask the user for a name
            Scanner currentNameInput = new Scanner(System.in); //scan the name
            currentName = currentNameInput.nextLine();
            if(!(currentName.equals(""))) { //prevent the blank from being inputted into the arraylist
                namesArrayList.add(currentName);
                numNames++;
            }
        }

        //randomization to find who is the lucky winner from the list of names
        winner = (int)Math.floor(Math.random() * ((numNames - 1) - 1 + 1) + 1);

        //outputting to the user who the winner is
        for(int i = 0; i < numNames; i++) {
            if(i == winner) {
                System.out.println("\nThe winner is... " + namesArrayList.get(i) + ".");
            }
        }

    }
}

