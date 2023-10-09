/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: MotorBike is-a Vehicle
 */
public class MotorBike extends Vehicle {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public MotorBike() {
        log.info("MotorBike created");
    }
    
    @Override
    public void steerRight() {
    	System.out.println("Steer right motorbike");
    }
    
    @Override
    public void steerLeft() {
    	System.out.println("Steer left motorbike");
    }
}

