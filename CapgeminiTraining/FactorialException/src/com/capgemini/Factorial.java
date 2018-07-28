package com.capgemini;

public class Factorial extends Exception {
	private int num;
	int fact = 1;

	/*
	 * public int getNum() { return num; }
	 * 
	 * public int setNum(int num) { this.num = num; }
	 */
	public Factorial(int num) {

		this.num = num;
	}

	public int getFactorial(int num) throws InvalidInputException,FactorialException {
		this.num = num;
		if (num < 2) {
			throw new InvalidInputException("Exception occurs.");
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}

		}
		if (fact > 2147483647) {
			throw new FactorialException("Factorial Exception Occurs");
		}
		return fact;
	}

}
