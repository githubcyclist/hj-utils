package org.hjutils;

import javax.swing.JFrame;

public class QuickFrame {
	public static JFrame createFrame(String name, boolean isResizable, int width, int height, boolean isStatic) {
		JFrame toReturn = new JFrame(name);
		toReturn.setResizable(isResizable);
		toReturn.setSize(width, height);
		toReturn.setVisible(true);
		return toReturn;
	}
	public JFrame createFrame(String name, int width, int height) {
		JFrame toReturn = new JFrame(name);
		return null;
	}
}
