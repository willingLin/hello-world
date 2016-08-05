package com.willing.chapter01_1;

import java.util.Scanner;

public class Pratice1_1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("equeal");
		} else {
			System.out.println("not equeal");
		}
		
		/*
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++){
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
