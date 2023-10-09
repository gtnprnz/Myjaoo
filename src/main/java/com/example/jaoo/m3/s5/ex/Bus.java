/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning{
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
    
    public Bus() {
    	temp = 0;
        log.info("Bus created");
    }
}
