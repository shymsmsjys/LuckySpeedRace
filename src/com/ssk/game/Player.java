package com.ssk.game;

public class Player {
	int id;
	String name;
	Horse horse;
	int score;
	int lastDiceNumber;
	
	
	public Player(int id) {
		this.id = id;
		
		horse = new Horse(id);
		System.out.println("Player " + id + " created");
	}
	
	public int rollDice() {
		System.out.println("rollDice()..");
		lastDiceNumber = 0;
		horse.setLocation(lastDiceNumber);
		return lastDiceNumber;
	}
	

}
