package com.methoduse;

import java.util.Scanner;

public class Frequecy_of_Digit {

	public static void frequency(int n) {
		int count;
		for (int i = 0; i <= 9; i++) {
			count = 0;
			int temp = n;
			while (temp > 0) {
				int digit = temp % 10;
				if (digit == 1)
					count++;
				temp = temp / 10;
			}
			if (count > 0) {
				System.out.println("The frequency of digit in given number  " + i + " is " + count);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Frequecy_of_Digit.frequency(n);

	}

}
