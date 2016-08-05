package com.willing.chapter01_1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 7, 1, 88, 33, 34, 12, 67, 43, 33, 96, 34, 55 };

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number you would find:");
		int key = scanner.nextInt();
		System.out.println("finding...");

		System.out.println("rank = " + rank(key, arr));
		System.out.println("count = " + count(key, arr));

	}

	private static int search(int[] arr, int key) {
		if (arr.length <= 0) {
			System.out.println("The array is Illegal.");
			return -1;
		}
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > key) {
				high = mid - 1;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	/*
	 * 1_1_29
	 */
	private static int rank(int key, int[] array) {
		int count = 0;
		int num = search(array, key);
		if (num == -1) {
			for (int i : array) {
				if (i == key) {
					count++;
				}
			}
		} else {
			count = num - 1;
		}
		return count;

	}

	private static int count(int key, int[] array) {
		int count = 0;
		for (int i : array) {
			if (i == key) {
				count++;
			}
		}
		return count;
	}

}
