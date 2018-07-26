package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.calc.CalculatorApp;

import junit.framework.Assert;

public class SubTest {

	@Test
	// Method to test subtraction of two positive numbers
	public void testTwoPositive() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.sub(2.00,2.00);
		Assert.assertEquals(0.00, ans);
		
	}
	@Test
	// Method to test subtraction of two negative numbers
	public void testTwoNegative() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.sub(-2.00,-2.00);
		Assert.assertEquals(0.00, ans);
		
	}
	@Test
	// Method to test subtraction of two zeroes
	public void testTwoZeros() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.sub(0.00,0.00);
		Assert.assertEquals(0.00, ans);
		
	}
	@Test
	// Method to test subtraction of one greater positive number and one lesser
	// negative number
	public void testOnePositiveandOneLesserNegative() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.sub(10.00,-2.00);
		Assert.assertEquals(12.00, ans);
		
	}
	@Test
	// Method to test subtraction of one greater negative number and one lesser
		// positive number
	public void testOneNegativeandOneGreaterNegative() {
		CalculatorApp cal=new CalculatorApp();
		double ans=cal.sub(-10.00,5.00);
		Assert.assertEquals(-15.00, ans);
		
	}
}
