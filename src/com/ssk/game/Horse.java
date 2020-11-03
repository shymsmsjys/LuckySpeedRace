package com.ssk.game;

public class Horse {
	int id;
	int location = 0;
	
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
	
	public void updateLocation(int location) {
		this.location += location;
		System.out.println("Horse[" + id +"] is located at " + this.location);
	}
	
	public int getLocation() {
		return location;
	}
}
