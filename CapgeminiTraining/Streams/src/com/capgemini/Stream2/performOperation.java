package com.capgemini.Stream2;

import java.util.function.Predicate;

public class performOperation {
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = i -> {

			return (i % 2 == 0) ? false : true;
		};
		return predicate;
	}

	public static Predicate<Integer> isPrime() {
		Predicate<Integer> predicate = i -> {

			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					return false;
			}

			return true;

		};
		return predicate;
	}

	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (str) -> {
			return (Integer.toString(str)).equals(new StringBuilder(Integer.toString(str)).reverse().toString());
		};
		return predicate;
	}

}
