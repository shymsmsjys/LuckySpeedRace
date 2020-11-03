package com.ssk.game;

public class GameManager extends Thread {
	private static int MAX_PLAYER = 4;
	
	Board board;
	Player[] players;
	
	public GameManager() {
		init();
	}
	
	/*public GameManager(Board board, Player[] players) {
		super();
		this.board = board;
		this.players = players;
		
		init();
		
//		Runner runner = new Runner();
//		Thread t = new Thread(runner, "main");
//		
//		t.start();
	}*/

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		players[1].rollDice();
	}
	
	private void init() {
		System.out.println("GameManager init()");
		players = new Player[4];
		Board board = new Board();
		
		for (int i=0; i < MAX_PLAYER; i++) {
			players[i] = new Player(i);
		}
	}

	
//	private class Runner implements Runnable {
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
}
