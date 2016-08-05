package com.willing.chapter01_1;

import java.util.Scanner;

public class Pratice1_1_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the line number:");
		int line = sc.nextInt();
		System.out.println("Please enter the column number:");
		int col = sc.nextInt();
		int[][] arr = new int[line][col];
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = (int) (Math.random() * 100);
			}
		}

		sysoArray(arr);
		System.out.println("========================================================");
		int[][] array = transpose(arr);
		sysoArray(array);
		
	}

	private static void sysoArray(int[][] arr) {
		for (int m = 0; m < arr.length; m++) {
			for (int n = 0; n < arr[0].length; n++) {
				System.out.print(arr[m][n] + "\t");
			}
			System.out.println();
		}
	}

	private static int[][] transpose(int[][] arr) {
		int[][] array = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				array[j][i] = arr[i][j];
			}
		}
		return array;
	}

	public static String exR1(int i) {
		if (i <= 0) {
			return "";
		}
		return exR1(i - 3) + i + exR1(i - 2) + i;
	}

}
