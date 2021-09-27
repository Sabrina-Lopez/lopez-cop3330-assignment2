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
        int numNames = 0;
        int winner;

        while(!(currentName.equals(""))) {
            System.out.println("\nEnter a name: "); //ask the user for a name
            Scanner currentNameInput = new Scanner(System.in); //scan the name
            currentName = currentNameInput.nextLine();
            if(!(currentName.equals(""))) {
                namesArrayList.add(currentName);
                numNames++;
            }
        }

        winner = (int)Math.floor(Math.random() * ((numNames - 1) - 1 + 1) + 1);

        for(int i = 0; i < numNames; i++) {
            if(i == winner) {
                System.out.println("\nThe winner is... " + namesArrayList.get(i) + ".");
            }
        }

    }
}

