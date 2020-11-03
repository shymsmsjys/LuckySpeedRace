package com.ssk.game;

public class Horse {
	int id;
	int location;
	
	int columnY;
	int color;
	
	public Horse(int id) {
		this.id = id;
		location = 0;
		color = getColor(id);
		System.out.println("Horse " + id + " created");
	}
	
	private int getColor(int id) {
		return id;
	}
	
	public void setLocation(int location) {
		System.out.println("Horse is located at " + location);
		this.location = location;
	}
}
