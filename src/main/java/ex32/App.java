package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int correctAnswer = 0; //the correct answer that the user has to guess
        int guessAnswer; //the user's current guess
        String playDecision = "Y"; //the user's decision to either continue playing or stop

        while(playDecision.equals("Y")) { //if the user wants to continue to play
            int numGuesses = 0; //reset the number of guesses to 0 every time the player starts a new game
            int rightValue = 0; //the rightmost value of the numeric range
            int leftValue; //the leftmost value of the numeric range
            int midpoint; //the midpoint value of the numeric range

            System.out.println("\nEnter the difficulty level (1, 2, or 3): "); //ask the user for what difficulty they want to play
            Scanner gameDifficultyInput = new Scanner(System.in); //scan the game difficulty they want
            int gameDifficulty = gameDifficultyInput.nextInt();

            if (gameDifficulty == 1) { //if the user selects easy difficulty
                correctAnswer = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1); //generate random number between 1 and 10
                rightValue = 10;
            }
            else if (gameDifficulty == 2) { //if the user selects medium difficulty
                correctAnswer = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1); //generate random number between 1 and 100
                rightValue = 100;
            }
            else if (gameDifficulty == 3) { //if the user selects hard difficulty
                correctAnswer = (int)Math.floor(Math.random() * (1000 - 1 + 1) + 1); //generate random number between 1 and 1000
                rightValue = 1000;
            }

            leftValue = 1;
            midpoint = (rightValue - leftValue) / 2;

            System.out.print("\nI have your number. What is your guess? "); //ask for the user's first guess
            Scanner guessAnswerInput = new Scanner(System.in); //scan the user's first guess
            guessAnswer = guessAnswerInput.nextInt();
            numGuesses = numGuesses + 1; //guess counter increments with every guess the user makes

            if (guessAnswer == correctAnswer) {
                System.out.println("You got it in " + numGuesses + " guesses!");
            }
            else {
                while(guessAnswer != correctAnswer) {

                    if(guessAnswer > correctAnswer) {
                            System.out.println("Too high. Guess again: "); //ask for the user's next guess

                            if((midpoint < guessAnswer) && (midpoint < correctAnswer)) {
                                rightValue = midpoint + 1;
                                midpoint = (rightValue - leftValue) / 2;
                            }
                            else if((midpoint < guessAnswer) && (midpoint > correctAnswer)) {
                                leftValue = midpoint + 1;
                                midpoint = (rightValue - leftValue) / 2;
                            }
                    }
                    else {
                        System.out.println("Too low. Guess again: "); //ask for the user's next guess

                        if((midpoint > guessAnswer) && (midpoint < correctAnswer)) {
                            leftValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                        else if((midpoint > guessAnswer) && (midpoint > correctAnswer)) {
                            rightValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                    }

                    numGuesses++;
                    guessAnswerInput = new Scanner(System.in); //scan the user's next guess
                    guessAnswer = guessAnswerInput.nextInt();

                }
            }


            //inform the user that they finally guessed correctly after a number of guesses and ask if they want to play again
            System.out.println("You got it in " + numGuesses + " guesses!\n" + "\n" + "Do you wish to play again (Y/N)?");
            Scanner playDecisionInput = new Scanner(System.in); //scan the user's decision
            playDecision = playDecisionInput.next();
        }
    }

}