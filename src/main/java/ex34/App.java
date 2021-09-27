package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        String[] employeeNamesArray  = new String [5];
        employeeNamesArray[0] = "John Smith";
        employeeNamesArray[1] = "Jackie Jackson";
        employeeNamesArray[2] = "Chris Jones";
        employeeNamesArray[3] = "Amanda Cullen";
        employeeNamesArray[4] = "Jeremy Goodwin";

        //inform the user of the available employees
        System.out.println("\nThere are 5 employees:\nJohn Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin ");

        System.out.print("\nEnter an employee name to remove: "); //ask the user to remove an employee name from the list
        Scanner employeeNameInput = new Scanner(System.in); //scan their decision on which employee name to remove from the list
        String employeeName = employeeNameInput.nextLine();

        //inform the user of the available employees
        System.out.println("\nThere are 4 employees: ");

        for(int i = 0; i < 5; i++) {
            if (!(employeeNamesArray[i].equals(employeeName))) {
                System.out.println(employeeNamesArray[i]);
            }
        }

    }
}
