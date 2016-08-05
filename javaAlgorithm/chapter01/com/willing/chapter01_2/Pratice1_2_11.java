package com.willing.chapter01_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * SmartDate
 */

public class Pratice1_2_11 {

	public static void main(String[] args) throws ParseException {
		SmartDate sd = new SmartDate(2016, 7, 27);
		System.out.println(sd.dayOfTheWeek(sd));
	}

}

class SmartDate {

	private int year;
	private int month;
	private int day;

	private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30,
			31, 30, 31 };

	private static final String[] WEEK = { "Monday", "Tuesday", "Wednesday",
			"Thursday", "Firday", "Saturday", "Sunday" };

	public SmartDate() {
	}

	public SmartDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		if (!isValidateDate(year, month, day)) {
			throw new RuntimeException("Invalid date!");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean isValidateDate(int year, int month, int day) {

		if (month < 1 || month > 12) {
			return false;
		}
		if (day < 1 || day > DAYS[month]) {
			return false;
		}
		if (month == 2 && day == 29 && !isLeapYear(year)) {
			return false;
		}

		return true;
	}

	private boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		return year % 4 == 0;
	}
	
	public String dayOfTheWeek(SmartDate sd) throws ParseException {
		String time = sd.getYear() + "-" + sd.getMonth() + "-" + sd.getDay();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date tempDate = sdf.parse(time);
		Calendar c = new GregorianCalendar();
		c.set(tempDate.getYear(), tempDate.getMonth(), tempDate.getDate());
		
		return WEEK[c.get(Calendar.DAY_OF_WEEK) + 1];
	}

}
