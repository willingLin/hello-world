package com.willing.chapter01_3;

/**
 * 此处只考虑最简单的情况，算术中的优先级都由括号标志
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Pratice1_3_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your expression:");
		String string = sc.nextLine();

		char[] chars = string.toCharArray();

		Stack stack = new Stack();

		List<Character> list = new ArrayList<Character>();
		list.add('+');
		list.add('-');
		list.add('*');
		list.add('/');
		// list.add('%');
		int sum = 0;

		for (char c : chars) {
			stack.push(c);
			if (list.contains(c)) {
				char operator = (Character) stack.pop();
				int top = Integer.parseInt(String.valueOf(stack.pop()));
				int bottom = Integer.parseInt(String.valueOf(stack.pop()));
				sum = calculator(operator, top, bottom);
				stack.push(sum);
				
			}
		}
		System.out.println(sum);
	}

	private static int calculator(char operator, int top, int bottom) {
		int temp = 0;
		switch (operator) {
		case '+':
			temp = bottom + top;
			return temp;
		case '-':
			temp = bottom - top;
			return temp;
		case '/':
			temp = bottom / top;
			return temp;
		case '*':
			temp = bottom * top;
			return temp;
		default:
			return -1;
		}
	}
}
