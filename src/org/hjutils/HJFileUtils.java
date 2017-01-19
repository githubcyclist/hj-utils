package org.hjutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HJFileUtils {
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
	public static String readFile(String filePath) throws Exception {
		String returnString = "0";
		Scanner scanner = new Scanner(new FileReader(filePath));
		while(scanner.hasNextLine()){
			returnString = scanner.nextLine();
		}
		scanner.close();
		return returnString;
	}
}
