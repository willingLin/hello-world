package com.willing.chapter01_2;

import java.util.Arrays;

public class Pratice1_2_9 {

	public static void main(String[] args) {
		int[] arr = { 2, 13, 76, 56, 37, 9, 5, 73, 8, 4, 3, 7 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int count = 0;
		System.out.println(rank(0, arr.length, arr, 3, count));
	}

	private static int rank(int lo, int hi, int[] array, int key, int count) {
		count++;
		// System.out.println("----------------------------------");
		// System.out.println("rank()方法被第" + count + "次调用");
		// System.out.println("hi =" + hi + ", lo = " + lo);

		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (array[mid] == key) {
			System.out.println("被检查的键的总数为：" + count);
			return mid;
		} else if (array[mid] > key) {
			return rank(lo, mid - 1, array, key, count);
		} else {
			return rank(mid + 1, hi, array, key, count);
		}

	}

}
