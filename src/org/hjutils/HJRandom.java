package org.hjutils;

import java.util.Random;

public class HJRandom {
	
	// Method for generating a random number
	public static int randint(int min, int max) {
		return new Random().nextInt(max) + min;
	}
	
}
