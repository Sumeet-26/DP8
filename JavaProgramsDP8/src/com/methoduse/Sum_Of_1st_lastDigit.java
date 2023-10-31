package com.methoduse;

import java.util.Scanner;

public class Sum_Of_1st_lastDigit {

	public static void sum(int num) {
		int firstdigit = 0;
		int sum;
		int lastdigit = num % 10;

		while (num > 0) {
			firstdigit = num % 10;
			num = num / 10;
		}
		sum = firstdigit + lastdigit;
		System.out.println("Sum is " + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();

		Sum_Of_1st_lastDigit.sum(num);

	}

}
