package com.ssk.game;

public class Player {
	int id;
	String name;
	Horse horse;
	int score;
	int lastDiceNumber;
	boolean isRunning = true;
	
	
	public Player(int id) {
		System.out.println("Player " + id + " created");
		this.id = id;
		
		horse = new Horse(id);
	}
	
	public int rollDice() {
		System.out.println("rollDice()..");
		lastDiceNumber = 5;
		horse.updateLocation(lastDiceNumber);
		return lastDiceNumber;
	}
	
	public Horse getHorse() {
		return horse;
	}
	
	public void arrivedGoal() {
		System.out.println("Player " + id + " arrived at Goal!!");
		isRunning = false;
	}
	
	public boolean isRunning() {
		return isRunning;
	}
	

}
