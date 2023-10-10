/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
    /**
     * Create a bunch of actors
     * <p>
     * Let them fight against each others
     * <p>
     * Peer-to-peer fight, the most skilled one wins
     * <p>
     * Wizards always beat warriors
     * <p>
     * In the end, let the user knows who survived
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = {new Warrior("war1", 10), new Warrior("war2", 50), new Warrior("war3", 2), new Warrior("war4", 20), new Wizard("wiz1", 10), new Wizard("wiz2", 50), new Wizard("wiz3", 20), new Wizard("wiz4", 5), };

        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }

        System.out.println("Let's fight ...");
        for(int i = 0; i < actors.length; i++) {
            for(int j = i+1; j < actors.length; j++) {
            	
            	System.out.println("----FIGHT----");
            	System.out.println("Fighter one: " + actors[i].toString());
            	System.out.println("Fighter two: " + actors[j].toString());
            	if(actors[i].fight(actors[j]))
            		System.out.println("FIGHTER ONE WON");
            	else
            		System.out.println("FIGHTER TWO WON");
            }
        }
    }
}
