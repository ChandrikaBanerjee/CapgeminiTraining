package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.calc.CalculatorApp;

import junit.framework.Assert;

public class AddTest {

	@Test
	// Method to test addition of two positive numbers
	public void testTwoPositive() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.add(2.00, 2.00);
		Assert.assertEquals(4.00, ans);

	}

	@Test
	// Method to test addition of two negative numbers
	public void testTwoNegative() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.add(-2.00, -2.00);
		Assert.assertEquals(-4.00, ans);

	}

	@Test
	// Method to test addition of two zeroes
	public void testTwoZeros() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.add(0.00, 0.00);
		Assert.assertEquals(0.00, ans);

	}

	@Test
	// Method to test addition of one greater positive number and one lesser
	// negative number
	public void testOnePositiveandOneLesserNegative() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.add(10.00, -2.00);
		Assert.assertEquals(8.00, ans);

	}

	@Test

	// Method to test addition of one greater negative number and one lesser
	// positive number
	public void testOneNegativeandOneGreaterNegative() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.add(-10.00, 5.00);
		Assert.assertEquals(-5.00, ans);

	}

}
