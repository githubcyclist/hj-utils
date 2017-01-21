package org.hjutils;

import java.io.IOException;

public class HJMiscUtils {
	public void clearScreen() {
		try {
			if(HJOSUtils.isWindows()) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
