package com.methoduse;

import java.util.Scanner;

public class ArmStrong_No {

	public void checkArmstrong(int num) {

		int orignal = num;
		int sum = 0;
		int rem;

		while (num != 0) {
			rem = num % 10;
			sum = sum+(rem * rem * rem);
			//sum = sum + rem;
			num = num / 10;

		}
		if (orignal == sum)
			System.out.println("Given number is armstrong number");
		else
			System.out.println("Given number is not armstrong number");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		ArmStrong_No obj = new ArmStrong_No();
		obj.checkArmstrong(num);

	}

}
