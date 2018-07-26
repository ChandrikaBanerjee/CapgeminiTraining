package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.calc.CalculatorApp;

import junit.framework.Assert;

public class DivideTest {

	@Test
	// Method to test division of two positive numbers
	public void testTwoPositive() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(2.00, 2.00);
		Assert.assertEquals(1.00, ans);

	}

	@Test
	// Method to test division of two negative numbers
	public void testTwoNegativeResultingFloat() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(-7.00, -2.00);
		Assert.assertEquals(3.50, ans);

	}
	@Test
	//Method to test division of a lesser positive number by a greater negative number 
	public void testOnePositiveandOneGreaterNegative() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(-10.00, 5.00);
		Assert.assertEquals(-2.00, ans);
	}
	//Method to test division of a positive number by a lesser negative number
	public void testOnePositiveandOneLesserNegative() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(10.00, -2.00);
		Assert.assertEquals(-5.00, ans);

	}
	@Test
	//Method to test division of 0/0
	public void testTwoZeros() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(0.00, 0.00);
		Assert.assertEquals(Double.NaN, ans);

	}




	@Test
	//Method to test division of 0/any number
	public void testOneZeroInTheNumeratorAndNumberInTheDenominator() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(0.00, 5.00);
		Assert.assertEquals(0.00, ans);

	}

	@Test
	//Method to test division of any number/0
	public void testOnePositiveNumberInTheNumeratorAndZeroInTheDenominator() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(1.00, 0.00);
		Assert.assertEquals(Double.POSITIVE_INFINITY, ans);

	}
	@Test
	//Method to test division of any number/0
	public void testOneNegativeNumberInTheNumeratorAndZeroInTheDenominator() {
		CalculatorApp cal = new CalculatorApp();
		double ans = cal.div(-1.00, 0.00);
		Assert.assertEquals(Double.NEGATIVE_INFINITY, ans);

	}
}
