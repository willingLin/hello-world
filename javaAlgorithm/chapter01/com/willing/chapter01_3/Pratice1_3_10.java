package com.willing.chapter01_3;

/**
 * 此处只考虑最简单的情况，算术中的优先级都由括号标志
 */

import java.util.Scanner;
import java.util.Stack;

public class Pratice1_3_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your expression:");
		String string = sc.nextLine();
		
		Stack stack = new Stack();
		String temp = null;
		
		for(int i = 0; i < string.length(); i++) {
			if('(' == string.charAt(i)) {
				continue;
			}
			stack.push(string.charAt(i));
			if(')' == string.charAt(i)) {
				stack.pop();    // 弹出右括号
				String str1 = String.valueOf(stack.pop());
				String str2 = String.valueOf(stack.pop());
				String str3 = String.valueOf(stack.pop());
				temp = str3 + str1 + str2;
				stack.push(temp);
			}
		}
		System.out.println(temp.toString());
		
	}
	
}
