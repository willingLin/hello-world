package com.willing.chapter01_2;

public class Pratice1_2_6 {

	public static void main(String[] args) {

		System.out.println(isCircularRotation("ACTGACG", "TGACGAC"));
	
	}
	
	private static boolean isCircularRotation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return (str1.concat(str1).indexOf(str2) != -1);
	}

}
