package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        //map of the employees and their company information (e.g., first name, last name, department, separation date (if they did))
        companyEmployees [] employeesInfo = {
                new companyEmployees ("John","Johnson","Manager","2016-12-31"),
                new companyEmployees ("Tou","Xiong","Software Engineer","2016-10-05"),
                new companyEmployees ("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new companyEmployees ("Jake","Jacobson","Programmer"," "),
                new companyEmployees ("Jacquelyn", "Jackson", "DBA"," "),
                new companyEmployees ("Sally","Webber","Web Developer","2015-12-18")
        };

        List<companyEmployees> employeesList = Arrays.asList(employeesInfo); //create view of list of employees

        //get the first and last names from each employee
        Function<companyEmployees, String> byFirstName = companyEmployees::getFirstName;
        Function<companyEmployees, String> byLastName = companyEmployees::getLastName;

        //compare the employees by first name and then last name
        Comparator<companyEmployees> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        //create table as well as sort and display the employees in alphabetical order based on their last names
        System.out.println("\nName     ----->     Department     ----->     Separation Date");
        System.out.println("-------------------------------------------------------------------------------");
        employeesList.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}

//creation of class to hold employees' information
class companyEmployees {
    private String firstName; //private declarations for the employee's information
    private String lastName;
    private String department;
    private String separationDate;

    public companyEmployees(String firstName, String lastName, String department, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate = separationDate;
    }

    public void setFirstName (String firstName) { //set the first name of the employee
        this.firstName = firstName;
    }

    public String getFirstName() { //get the first name of the employee
        return firstName;
    }

    public void setLastName (String lastName) { //set the last name of the employee
        this.lastName = lastName;
    }

    public String getLastName() { //get the last name of the employee
        return lastName;
    }

    public void setDepartment (String department) { //set the department of the employee
        this.department = department;
    }

    public String getDepartment() { //get the department of the employee
        return department;
    }

    public void setSeparationDate (String separationDate) { //set the separation date of the employee
        this.separationDate = separationDate;
    }

    public String getSeparationDate() { //get the separation date of the employee
        return separationDate;
    }

    public String getName() { //get the full name of the employee, so first and last name
        return getFirstName() + " " + getLastName();
    }

    public String toString() { //print out the employees in sorted alphabetical order based on their last names
        return String.format("%s %-5s     ----->     %-5s     ----->     %-5s", getFirstName(), getLastName(), getDepartment(),getSeparationDate());
    }

}