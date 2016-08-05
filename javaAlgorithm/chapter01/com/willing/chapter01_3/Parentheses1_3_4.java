package com.willing.chapter01_3;

import java.util.Scanner;

public class Parentheses1_3_4 {

	private char[] arr;
	private int size;

	public Parentheses1_3_4() {
	}

	public Parentheses1_3_4(int cap) {
		arr = new char[cap];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(char c) {
		arr[size++] = c;
	}

	public char pop() {
		return arr[--size];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String:");
		String string = sc.nextLine();
		char[] c = string.toCharArray();

		Parentheses1_3_4 pa = new Parentheses1_3_4(c.length);

		System.out.println(isCorrect(pa, c));

	}

	private static boolean isCorrect(Parentheses1_3_4 pa, char[] c) {
		
		// [()]{}{[()(}
		
		for(int i = 0; i < c.length; i++) {
			pa.push(c[i]);
			if(pa.size <= 1) {
				continue;
			}
			if(pa.size > 1) {
				int j = pa.size - 2;
				if(isPair(pa.arr[j],pa.arr[pa.size - 1])) {
					pa.pop();
					pa.pop();
				} else {
					continue;
				}
			}
		}
		if(pa.size == 0) {
			return true;
		}
		return false;
	}

	private static boolean isPair(char c, char d) {
		if('[' == c && ']' == d) {
			return true;
		}
		if('(' == c && ')' == d) {
			return true;
		}
		if('{' == c && '}' == d) {
			return true;
		}
		return false;
	}
}
