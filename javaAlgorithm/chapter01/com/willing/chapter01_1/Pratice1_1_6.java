package com.willing.chapter01_1;

import java.util.Scanner;

public class Pratice1_1_6 {

	public static void main(String[] args) {

		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.print(f + "  ");
			f = f + g;
			g = f - g;
		}

	}

}
