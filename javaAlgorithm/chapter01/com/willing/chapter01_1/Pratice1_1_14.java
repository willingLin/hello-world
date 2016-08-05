package com.willing.chapter01_1;

import java.util.Scanner;

public class Pratice1_1_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int N = sc.nextInt();
		System.out.println(lg(N));
	}

	private static int lg(int n) {
		int count = 0;
		while(n > 1) {
			n = n>>1;
			count ++;
		}
		return count;
	}
}
