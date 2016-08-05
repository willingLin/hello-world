package com.willing.chapter01_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratice1_1_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		System.out.println("Please enter students' name,score1,score2:");
		do {
			String str = sc.nextLine();
			if(str.isEmpty()) {
				break;
			}
			else {
				String[] array = str.split(",");
				list.add(new Student(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2])));
			}
		} while(true);
		
		for (Student stu : list) {
			double count = stu.getScore1() / stu.getScore2();
			System.out.println(stu.toString() + count);
		}
		
	}

}

class Student {

	private String name;
	private int score1;
	private int score2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public Student() {
	}

	public Student(String name, int score1, int score2) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	@Override
	public String toString() {
		return name + "\t" + score1 + "\t" + score2 + "\t";
	}

}
