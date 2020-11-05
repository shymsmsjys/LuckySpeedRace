package com.ssk.game;

import javax.swing.JFrame;

public class Main {
	private JFrame frame;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main window = new Main();
		window.frame.setVisible(true);
	}
	
	public Main() {
		init();
		
		GameManager gm = new GameManager();
		gm.start();
	}
	
	private void init() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(300, 20, 790, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board();
		frame.add(board);
	}

}
