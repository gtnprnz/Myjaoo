/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Flat is-a Conditioning
 */
public class Flat implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temp;
    /**
     * No-arg constructor
     */
    public Flat() {
        log.info("Flat created");
    }

	@Override
	public void setTemperature(int temp) {
		this.temp = temp;
	}
	
	public int getTemperature() {
    	return temp;
    }
}
