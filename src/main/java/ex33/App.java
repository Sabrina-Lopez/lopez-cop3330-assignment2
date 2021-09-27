package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is your question? "); //ask the user's question
        System.out.print("> ");
        Scanner questionInput = new Scanner(System.in); //scan their question
        String question = questionInput.nextLine();

        int randomChoice = (int)Math.floor(Math.random() * (4 - 1 + 1) + 1);

        switch (randomChoice) {
            case 1:
                System.out.println("\nYes. ");
                break;
            case 2:
                System.out.println("\nNo. ");
                break;
            case 3:
                System.out.println("\nMaybe. ");
                break;
            case 4:
                System.out.println("\nAsk again later. ");
                break;
        }

    }
}

