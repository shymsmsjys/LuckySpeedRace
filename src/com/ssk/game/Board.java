package com.ssk.game;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon imgBoard;
	Horse[] horses;
	
	public Board() {
		init();
	}
	
	private void init() {
		imgBoard = new ImageIcon("res/img_board.png");
		JLabel board = new JLabel(imgBoard);
		add(board);
	}
//
//	@Override
//	public void paint(Graphics arg0) {
//		// TODO Auto-generated method stub
//		super.paint(arg0);
//		arg0.drawImage(imgBoard, 0, 0, null);
//	}

}
