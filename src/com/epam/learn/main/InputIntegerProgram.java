package com.epam.learn.main;

import java.util.Scanner;

public class InputIntegerProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //cannot input characters or fraction
        System.out.println(number);
    }
}