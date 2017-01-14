package org.hjutils;

public class StrintCollection {
	// Declare the two arrays of String and int
	public String[] strings;
	public int[] ints;
	static int index;
	
	// Constructors
	public StrintCollection(int spaces) {
		strings = new String[spaces];
		ints = new int[spaces];
	}
	public static  int getIndex() { return index; }
}
