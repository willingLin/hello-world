package com.willing.chapter01_1;

public class Pratice1_1_15 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 5, 3, 7, 4, 7, 9, 4, 10, 11 };
		int[] returnArr = histogram(arr, 10);
		for (int i : returnArr) {
			System.out.print(i + " ");
		}
	}

	private static int[] histogram(int arr[], int m) {

		int[] array = new int[m];
		/*int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
			}
			array[i] = count;
			count = 0;
		}

		return array;*/
		
		// int[] arr = { 3, 5, 7, 5, 3, 7, 4, 7, 9, 4, 10 };   0 0 0 2 2 2 0 3 0 1 1 0 0 0 0 0 0 0 0 0 
		for(int value: arr) {
			if(value < m) {     // 总之就是每次遍历到arr数组中的数小于m时，array[]对应的位置的值就加一
				array[value]++;  // 当数组中的数小于m数组的长度时，即说明array数组中，下标为这个数的值存在，所以加一
			}
		}
		return array;
	}

}
