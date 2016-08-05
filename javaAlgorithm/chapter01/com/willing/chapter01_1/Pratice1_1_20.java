package com.willing.chapter01_1;

public class Pratice1_1_20 {

	public static void main(String[] args) {
		System.out.println(ln(0));
	}
	
	public static double ln(int n) {
		
		if(n == 0) {
			return -1.0;
		}
		if(n == 1) {
			return 0.0;
		}
		return ln(n-1) + Math.log(n);
	}

}
