package com.example.jaoo.m3.s9.ex1;

public class Wizard extends Actor{
	
	private int power;

	protected Wizard(String name, int power) {
		super(name);
		this.power = power;
	}
	@Override
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public int getPower() {
		return power;
	}

	@Override
	public boolean fight(Actor enemy) {
		if(enemy instanceof Warrior)
			return true;
		else {
			if(enemy.getPower() > this.getPower()) return false;
			return true;
		}
		
	}

}
