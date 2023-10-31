package com.oops;

import java.util.Scanner;

public class SumOfEvenDigits {

	int num;
	int sum;
	int digit;

	public void setData(int n) 
	{
		num = n;
	}

	public void calculateSum() {
		sum = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;

			if (digit % 2 == 0) {
				sum = sum + digit;
			}

		}
	}

	public void display() {
		System.out.println("Sum of even digits is : " + sum);

	}

	public static void main(String[] args) {

		SumOfEvenDigits obj = new SumOfEvenDigits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		obj.setData(num);
		obj.calculateSum();
		obj.display();

	}

}
