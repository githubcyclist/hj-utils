package test;
import javax.swing.JFrame;

import org.hjutils.*;
public class Test {
	public static void main(String[] args) {
		JFrame quickFrame = QuickFrame.createFrame("Test Frame", false, 300, 300, true);
		System.out.println(HJRandom.randint(1, 10));
	}
}
