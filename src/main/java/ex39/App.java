package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sabrina Lopez
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        //list of the employees and their information (e.g., first name, last name, department, separation date)

        List<HashMap<String,String>> employees = new ArrayList<>(); //create hash map for all employees

        HashMap<String, String> jacquelynJackson = new HashMap<>(); //create hashmap for jacquelyn jackson

        jacquelynJackson.put("First Name", "Jacquelyn"); //her first name
        jacquelynJackson.put("Last Name", "Jackson"); //last name
        jacquelynJackson.put("Position Name", "DBA"); //department
        jacquelynJackson.put("Separation Date", ""); //separation date

        employees.add(jacquelynJackson); //add her to the employees hashmap

        HashMap<String, String> jakeJacobson = new HashMap<>(); //create hashmap for jake jacobson

        jakeJacobson.put("First Name", "Jake"); //their first name
        jakeJacobson.put("Last Name", "Jacobson"); //last name
        jakeJacobson.put("Position Name", "Programmer"); //department
        jakeJacobson.put("Separation Date", ""); //separation date

        employees.add(jakeJacobson); //add them to the employees hashmap

        HashMap<String, String> johnJohnson = new HashMap<>(); //create hashmap for john johnson

        johnJohnson.put("First Name", "John"); //his first name
        johnJohnson.put("Last Name", "Johnson"); //last name
        johnJohnson.put("Position Name", "Manager"); //department
        johnJohnson.put("Separation Date", "2016-12-31"); //separation date

        employees.add(johnJohnson); //add him to the employees hashmap

        HashMap<String, String> michaelaMichaelson = new HashMap<>(); //create hashmap for michaela michaelson

        michaelaMichaelson.put("First Name", "Michaela"); //their first name
        michaelaMichaelson.put("Last Name", "Michaelson"); //last name
        michaelaMichaelson.put("Position Name", "District Manager"); //department
        michaelaMichaelson.put("Separation Date", "2015-12-19"); //separation date

        employees.add(michaelaMichaelson); //add them to the employees hashmap

        HashMap<String, String> sallyWebber = new HashMap<>(); //create hashmap for sally webber

        sallyWebber.put("First Name", "Sally"); //her first name
        sallyWebber.put("Last Name", "Webber"); //last name
        sallyWebber.put("Position Name", "Web Developer"); //department
        sallyWebber.put("Separation Date", "2015-12-18"); //separation date

        employees.add(sallyWebber); //add her to the employees hashmap

        HashMap<String, String> touXiong = new HashMap<>(); //create hashmap for tou xiong

        touXiong.put("First Name", "Tou"); //her first name
        touXiong.put("Last Name", "Xiong"); //last name
        touXiong.put("Position Name", "Software Engineer"); //department
        touXiong.put("Separation Date", "2016-10-05"); //separation date

        employees.add(touXiong); //add her to the employees hashmap

        //print out the list of the employees and their info
        System.out.println("\nName                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (HashMap<String, String> currentEmployee : employees) {
            String employeeName = currentEmployee.get("First Name") + " " + currentEmployee.get("Last Name");
            System.out.printf("%-20s| %-18s| %-20s%n", employeeName, currentEmployee.get("Position Name"), currentEmployee.get("Separation Date"));
        }

    }
}