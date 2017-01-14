package org.hjutils;

public class StrintCollection {
	
	// Declare the two arrays of String and int
	public static String[] strings;
	public static int[] ints;
	static int length = 0;
	
	// Constructors
	public StrintCollection(int spaces) {
		strings = new String[spaces];
		ints = new int[spaces];
	}
	
	// Simple method to return the length of the strint
	public static  int length() { return length; }
	
	// Add value to the strint
	public void addStrint(String string, int integer) {
		strings[length] = string;
		ints[length] = integer;
		length++;
	}
	
	// Method to get the integer at a specified index
	public static int getInt(int index) { return ints[index]; }
	
	// Method to get the string at a specified index
	public static String getString(int index) { return strings[index]; }
	
}
