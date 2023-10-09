/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s6;

/**
 * This exercise should be solved using a method in a primitive wrapper
 */
public class Exercise {
    /**
     * See requests in the "to do" comments
     * 
     * @param args used to test the code
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pass me one argument!");
        } else {
            
        	boolean flagAllDigits = true;
        	// TODO (1) check if the argument contains only digits
        	for(int i = 0; i < args[0].length(); i++) {
        		if(!Character.isDigit(args[0].charAt(i))) {
        			System.out.println("Not only digits");
        			flagAllDigits = false;
        			break;
        		}
        	}
        	if(flagAllDigits) System.out.println("Only digits");
            
        	// TODO (2) check if the argument contains at least one digit
        	boolean atLeastOne = false;
        	for(int i = 0; i < args[0].length(); i++) {
        		if(Character.isDigit(args[0].charAt(i))) {
        			System.out.println("At least one digits");
        			atLeastOne = true;
        			break;
        		}
        	}
            if(!atLeastOne) System.out.println("No one digit");
        }
    }
}
