package com.willing.chapter01_1;

public class Pratice1_1_30 {

	public static void main(String[] args) {
		boolean[][] a = new boolean[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (gcd(i, j) == 1) {
					a[i][j] = true;
				} else {
					a[i][j] = false;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int gcd(int m, int n) {
		if (m == 0 || n == 0) {
			return 1;
		}
		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}
	}
}
