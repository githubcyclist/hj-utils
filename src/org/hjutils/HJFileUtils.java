package org.hjutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class HJFileUtils {
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
	public static boolean doesDirectoryExist(String path) {
		return(Files.isDirectory(Paths.get(path)));
	}
	public static String getCurrentWorkingDir() {
		return Paths.get(".").toAbsolutePath().normalize().toString();
	}
}
