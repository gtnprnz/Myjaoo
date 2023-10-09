/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();
    private int temp;
    /**
     * No-arg constructor
     * @return 
     */
    public void setTemperature(int temp) {
    	this.temp = temp;
    }
    
    public int getTemperature() {
    	return temp;
    }
    
    public Car() {
    	temp = 0;
        log.info("Car created");
    }
}
