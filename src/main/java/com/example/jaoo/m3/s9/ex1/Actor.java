/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
    /**
     * Canonical constructor
     * 
     * @param name the actor name
     */
	protected String name;
    protected Actor(String name) {
        // TODO
    	this.name = name;
    }

    /**
     * Fight against an enemy
     * 
     * @param enemy another actor
     * @return true if the current actor wins
     */
    public abstract boolean fight(Actor enemy);
    public abstract int getPower();
    public abstract void setPower(int power);
	@Override
	public String toString() {
		return "name= " + name;
	}
    
}
