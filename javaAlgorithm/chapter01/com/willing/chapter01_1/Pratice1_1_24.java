package com.willing.chapter01_1;

/**
 * 欧几里得算法求最大公约数
 */

import java.util.Scanner;

public class Pratice1_1_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		System.out.println(gcd(p, q));

	}

	private static int gcd(int p, int q) {
		
		System.out.println("p = " + p + ", q = " + q);
		
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}

}
