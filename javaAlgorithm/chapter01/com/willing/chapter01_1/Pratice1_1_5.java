package com.willing.chapter01_1;

import java.util.Scanner;

public class Pratice1_1_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.println(campare(x));
		System.out.println(campare(x));
	}

	private static boolean campare(double num) {

		if (0 < num && 1 > num) {
			return true;
		}
		return false;
	}

}
