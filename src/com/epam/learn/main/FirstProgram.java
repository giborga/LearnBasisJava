package com.epam.learn.main;

// public - class is accessible to other packages and applications
public class FirstProgram { // static means that it does not require creating an object
    public static void main(String [] args) { // String [] args - command line arguments, main is method
        System.out.println("Hello Java"); // operation is System.out.println("Hello Java")
        System.out.println(42);
        System.out.println("\n\tJava " + 42);
        // println - after calling this line a trans to the next ine will be made
    }
}