package challenges;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * 1. Fibonacci series (solution) Write a simple Java program which will print
		 * Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number. Be prepare
		 * for cross questions like using iteration over recursion and how to optimize
		 * the solution using caching and memoization.
		 * 
		 * Read more:
		 * https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-
		 * Interviews.html#ixzz5r2rwpKRX
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter positive number: ");
		int number = sc.nextInt();
		System.out.print("Fibonacci Sequence= ");
		for (int i = 1; i <= number; i++) {
			System.out.print(getFibonacciNumbers2(i) + " ");
		}

		System.out.println("\nRecursion= " + getRecursionNumber(number));

	}

	/*
	 * Java program for Fibonacci number using recursion. This program uses tail
	 * recursion to calculate Fibonacci number for a given number
	 * 
	 * @return Fibonacci number
	 */
	public static int getRecursionNumber(int number) {
		if (number <= 1) {
			return number;
		}
		return getRecursionNumber(number - 1) + getRecursionNumber(number - 2);

	}

	/*
	 * Java program to calculate Fibonacci number using loop or Iteration.
	 * 
	 * @return Fibonacci number
	 */
	public static int getFibonacciNumbers2(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {

			// Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci;

	}

}
