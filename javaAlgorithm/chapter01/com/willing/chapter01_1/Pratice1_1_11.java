package com.willing.chapter01_1;

public class Pratice1_1_11 {

	public static void main(String[] args) {

		boolean[][] arr = new boolean[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == true) {
					System.out.println(i + "+" + j + "--" + arr[i][j]);
				} else {
					System.out.println(i + "+" + j + "--" + arr[i][j]);
				}
			}
		}

	}
}
