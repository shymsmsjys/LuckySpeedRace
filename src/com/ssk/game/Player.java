package com.ssk.game;


public class Player {
	int id;
	String name;
	Horse horse;
	int score;
	int lastDiceNumber;
	boolean isRunning = true;
	int[] goal = {20, 16, 11, 16};
	int path = PATH_FULL;
	
	static int PATH_FULL = 0;
	static int PATH_SHORT_CUT_1 = 1;
	static int PATH_SHORT_CUT_2 = 2;
	static int PATH_SHORT_CUT_3 = 3;
	
	
	public Player(int id) {
		System.out.println("Player " + id + " created");
		this.id = id;
		
		horse = new Horse(id);
	}
	
	public int rollDice() {
		System.out.println("\nrollDice()..");
		int low = 1;
		int high = 6;
		lastDiceNumber = (int) (Math.random() * high + low);
		System.out.println("plyaer" +id + " got number, " + lastDiceNumber);
		updateHorseLocation(lastDiceNumber);
		checkFinish();
		return lastDiceNumber;
	}
	
	private void updateHorseLocation(int num) {
		horse.updateLocation(num);
		
		if (path == PATH_FULL) {
			switch(horse.getLocation()) {
			case 5:
				path = PATH_SHORT_CUT_1;
				System.out.println("change plyaer" +id + "'s path to short cut type 1");
				System.out.println("plyaer" +id + "'s goal is " + goal[path]);
				break;
			
			case 10:
				path = PATH_SHORT_CUT_3;
				System.out.println("change plyaer" +id + "'s path to short cut type 3");
				System.out.println("plyaer" +id + "'s goal is " + goal[path]);
				break;
			}
		} else if (path == PATH_SHORT_CUT_1) {
			switch(horse.getLocation()) {
			case 8:
				path = PATH_SHORT_CUT_2;
				System.out.println("change plyaer" +id + "'s path to short cut type 2");
				System.out.println("plyaer" +id + "'s goal is " + goal[path]);
				break;
			}
		}
	}
	
	private void checkFinish() {
		if (getHorse().getLocation() > goal[path]) {
			setFinish();
		}
	}
	
	public Horse getHorse() {
		return horse;
	}
	
	public void setFinish() {
		System.out.println("Player " + id + " has reached the Goal!!");
		isRunning = false;
	}
	
	public boolean isRunning() {
		return isRunning;
	}
	

}
