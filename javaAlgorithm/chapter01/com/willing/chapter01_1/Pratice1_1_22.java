package com.willing.chapter01_1;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice1_1_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(",");
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(intArr);
		for (int i : intArr) {
			System.out.print(i + "  ");
		}
		System.out.println("\n" + "====================================");
		System.out.println("请输入要查找的数字：");
		int key = sc.nextInt();
		int count = 0;
		System.out.println(rank(0, intArr.length, intArr, key, count));

	}

	private static int rank(int lo, int hi, int[] array, int key, int count) {
		count++;
		System.out.println("----------------------------------");
		System.out.println("rank()方法被第" + count + "次调用");
		System.out.println("hi =" + hi + ", lo = " + lo);

		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (array[mid] == key) {
			return mid;
		} else if (array[mid] > key) {
			return rank(lo, mid - 1, array, key, count);
		} else {
			return rank(mid + 1, hi, array, key, count);
		}

	}
}
