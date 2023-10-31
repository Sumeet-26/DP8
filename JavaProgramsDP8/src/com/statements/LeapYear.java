package com.statements;
import java.util.Scanner;
public class LeapYear {
//Write a program to find out leap year
	public static void main(String[] args) {
		int year;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year");
		year=sc.nextInt();
	
		if((year%4==0 && year%100==0) ||(year%400==0))
		{
			System.out.println("This is leap year "+year);
		}
		else
		{
			System.out.println("This is not leap year "+year);
		}
		
		
		
		
		
		
		
		
		
	}

}
