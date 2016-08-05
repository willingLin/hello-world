package com.willing.chapter01_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class: Rational
 */

public class Pratice1_2_16 {

	public static void main(String[] args) throws ParseException {
		Rational a = new Rational(2L, 5L);
		Rational b = new Rational(6L, 10L);

		// Rational r = a.plus(b);
		// System.out.println("加法 = " + r.getNumerator() + "/" + r.getDenomiator());
		// Rational r = a.minus(b);
		// System.out.println("减法 = " + r.getNumerator() + "/" + r.getDenomiator());
		Rational r = a.times(b);
		System.out.println("乘法 = " + r.getNumerator() + "/" + r.getDenomiator());
		// Rational r = a.divides(b);
		// System.out.println("除法 = " + r.getNumerator() / r.getDenomiator());
		// System.out.println(a.equals(b));
		// System.out.println(a.toString());
	}

}

class Rational {

	private long numerator;
	private long denominator;

	public Rational() {
	}

	public Rational(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		if (denominator == 0) {
			throw new RuntimeException("[error]Denominator is zero");
		}

		// reduce fraction
		long g = gcd(numerator, denominator);
		this.numerator = numerator / g;
		this.denominator = denominator / g;

		// only needed for negative numbers
		if (denominator < 0) {
			denominator = -denominator;
			numerator = -numerator;
		}
	}

	public long getNumerator() {
		return numerator;
	}

	public void setNumerator(long numerator) {
		this.numerator = numerator;
	}

	public long getDenomiator() {
		return denominator;
	}

	public void setDenomiator(long denominator) {
		this.denominator = denominator;
	}

	/**
	 * 判断分数分母是否为0
	 */
	private static boolean isValide(Rational r) {

		if (r.getDenomiator() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 最小公倍数
	 */
	private static long getMultiple(long num1, long num2) {
		return num1 * num2 / gcd(num1, num2);
	}

	/**
	 * 最大公约数
	 */
	private static long gcd(long p, long q) {
		if (q == 0) {
			return p;
		}
		long r = p % q;
		return gcd(q, r);
	}

	/**
	 * 加法
	 */
	public Rational plus(Rational b) {

		if (isValide(this) || isValide(b)) {
			throw new RuntimeException("rational's denominator equals zero!");
		}

		long multiple = getMultiple(this.getDenomiator(), b.getDenomiator());
		long thisMul = multiple / this.getDenomiator();
		long bMul = multiple / b.getDenomiator();

		return new Rational(this.getNumerator() * thisMul + b.getNumerator()
				* bMul, multiple);
	}

	/**
	 * 减法
	 */
	public Rational minus(Rational b) {
		if (isValide(this) || isValide(b)) {
			throw new RuntimeException("rational's denominator equals zero!");
		}

		long multiple = getMultiple(this.getDenomiator(), b.getDenomiator());
		long thisMul = multiple / this.getDenomiator();
		long bMul = multiple / b.getDenomiator();

		long resultNum = Math.abs(this.getNumerator() * thisMul - b.getNumerator() * bMul);
		// 分子分母约分
		long g = gcd(resultNum, multiple);
		resultNum = resultNum / g;
		multiple = multiple / g;

		return new Rational(resultNum, multiple);
	}
	
	/**
	 * 乘法
	 */
	public Rational times(Rational b) {
		
		if (isValide(this) || isValide(b)) {
			throw new RuntimeException("rational's denominator equals zero!");
		}
		
		long timesNum = this.numerator * b.numerator;
		long timesDen = this.denominator * b.denominator;
		
		long g = gcd(timesNum, timesDen);
		timesNum = timesNum / g;
		timesDen = timesDen / g;
		
		return new Rational(timesNum, timesDen);
	}
	
	/**
	 * 除法
	 */
	public Rational divides(Rational b) {
		
		if (isValide(this) || isValide(b)) {
			throw new RuntimeException("rational's denominator equals zero!");
		}
		
		long divNum = this.numerator * b.denominator;
		long divDen = this.denominator * b.numerator;
		long g = gcd(divNum, divDen);
		divNum = divNum / g;
		divDen = divDen / g;
		
		return new Rational(divNum, divDen);
		
	}
	
	/**
	 * 判断是否相等
	 */
	public boolean equals(Rational that) {
		
		if (isValide(this) || isValide(that)) {
			throw new RuntimeException("rational's denominator equals zero!");
		}
		
		return (this.getNumerator() == that.getNumerator() && this.getDenomiator() == that.getDenomiator());
	}

	/**
	 * toString()
	 */
	public String toString() {
		return "Rational [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}
	
	
	
	
	
}
