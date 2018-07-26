package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.calc.CalculatorApp;

import junit.framework.Assert;

public class MultiplyTest {

	@Test
	// Method to test multiplication of two positive numbers
	public void testTwoPositive() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(2.00,2.00);
		Assert.assertEquals(4.00, ans);
		
	}
	@Test
	// Method to test multiplication of two negative numbers
	public void testTwoNegative() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(-2.00,-2.00);
		Assert.assertEquals(4.00, ans);
		
	}
	@Test
	// Method to test multiplication of two zeroes
	public void testTwoZeros() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(0.00,0.00);
		Assert.assertEquals(0.00, ans);
		
	}
	@Test
	// Method to test multiplication of a number by zero
	public void testMultiplyByZero() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(5.00,0.00);
		Assert.assertEquals(0.00, ans);
		
	}
	@Test
	// Method to test multiplication of one greater positive number and one lesser
	// negative number
	public void testOnePositiveandOneLesserNegative() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(10.00,-2.00);
		Assert.assertEquals(-20.00, ans);
		
	}
	@Test
	// Method to test multiplication of one greater negative number and one lesser
	// positive number
	public void testOneNegativeandOneGreaterPositive() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.mul(-10.00,5.00);
		Assert.assertEquals(-50.00, ans);
		
	}

}
