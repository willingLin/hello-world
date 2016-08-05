package com.willing.chapter01_2;

public class Pratice1_2_7 {

	public static void main(String[] args) {
		System.out.println(mystery("ABCDDEFGHIJKLMNOPQRSTUVWXYZ"));
	}

	public static String mystery(String s) {
		int n = s.length();
		if (n <= 1) {
			return s;
		}
		String a = s.substring(0, n / 2);
		String b = s.substring(n / 2, n);
		
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		return mystery(a) + mystery(b);
	}

}
