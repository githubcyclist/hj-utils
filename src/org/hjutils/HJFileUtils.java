package org.hjutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public abstract class HJFileUtils {
	// Method to write to file
	public static void writeToFile(String toWrite, String filePath) {
		File fout = new File(filePath);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fout);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			bw.write(toWrite);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Method to read from file
	public static String readFile(String filePath) throws Exception {
		String returnString = "0";
		Scanner scanner = new Scanner(new FileReader(filePath));
		while(scanner.hasNextLine()){
			returnString = scanner.nextLine();
		}
		scanner.close();
		return returnString;
	}
	
	// Method to check if directory exists
	public static boolean doesDirectoryExist(String path) {
		return(Files.isDirectory(Paths.get(path)));
	}
	
	// Method to get the current working directory
	public static String getCurrentWorkingDir() {
		return Paths.get(".").toAbsolutePath().normalize().toString();
	}
	
	// Method to create a new directory
	public static boolean createDirectory(String path) {
		File dir = new File(path);
	    // attempt to create the directory here
	    boolean successful = dir.mkdir();
	    if (successful) {
	      // creating the directory succeeded
	      return true;
	    } else {
	      // creating the directory failed
	      return false;
	    }
	}
}
