package com.ar.interview.exercises;

/**
 * 
 * @author Martin
 * 
 El factorial de un número se define como:
	n! = 1 x 2 x 3 x ... x (n - 1) x n
	Además, para que la definición sea completa, se define el factorial de cero, 0! = 1.
	Se pide escribir dos funciones distintas que calculen el factorial de un número.
 */

public class Factorial {

	public static void main(String[] args) {

		long number_one = 5;
		long number_two = 0;

		System.out.println(factorial_one(number_one));
		System.out.println(factorial_two(number_two));
	}

	public static long factorial_one(long n) {
		long result = 1;
		if (n == 0) {
			return 1;
		} else {
			for (long i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
	}

	public static long factorial_two(long n) {
		if (n == 0)
			return 1;
		else
			return n * factorial_two(n - 1);
	}

}