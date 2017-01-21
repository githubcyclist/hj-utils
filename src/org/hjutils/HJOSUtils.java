package org.hjutils;

public abstract class HJOSUtils {
   private static String OS = null;
   public static String getOsName() {
      if(OS == null) {
    	  OS = System.getProperty("os.name");
      }
      return OS;
   }
   public static boolean isWindows() {
      return getOsName().startsWith("Windows");
   }
   public static boolean isMac() {

		return (getOsName().indexOf("mac") >= 0);

	}
   public static boolean isLinux() {
	   return getOsName().startsWith("Linux");
   }
}
