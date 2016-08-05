package com.willing.chapter01_3;

import java.util.Stack;

public class Pratice1_3_12 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("lebron");
		stack.push("wede");
		stack.push("paul");
		stack.push("anthrony");
		

		Stack<String> copyStack = copy(stack);
		int j = copyStack.size();
		for (int i = 0; i < j; i++) {
			System.out.println(copyStack.pop());
		}
	}

	/*
	 * copy stack
	 */
	private static Stack<String> copy(Stack<String> stack) {

		Stack<String> copyStack = new Stack<String>();
		Stack<String> tempStack = new Stack<String>();
		while(!stack.isEmpty()) {
			tempStack.push(stack.pop());
		}
		while(!tempStack.isEmpty()) {
			String str = tempStack.pop();
			copyStack.push(str);
			stack.push(str);
		}
		return copyStack;
	}
}
