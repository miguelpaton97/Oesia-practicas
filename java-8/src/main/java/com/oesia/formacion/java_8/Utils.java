package com.oesia.formacion.java_8;

public class Utils {
	
	public static int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
	public int compareNotStatic(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
