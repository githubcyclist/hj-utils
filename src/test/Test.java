package test;
import javax.swing.JFrame;

import org.hjutils.*;
public class Test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StrintCollection strint = new StrintCollection(5);
		strint.addStrint("test", 13);
		strint.addStrint("test 2", 24);
		System.out.println("Strint at index 0: " + strint.getInt(0) + "Strint at index 1: " + strint.getInt(1));
	}
}
