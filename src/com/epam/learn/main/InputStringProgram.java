package com.epam.learn.main;

import java.util.Scanner;

// Scanner is a class. scan is an object of the Scanner class
// Scanner object is connected to the cli input
// scan.next() method reads the string and saves it into input (object of the string class)
public class InputStringProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("hello " + input);
    }
}