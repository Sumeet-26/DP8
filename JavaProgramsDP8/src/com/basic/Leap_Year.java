package com.basic;
// write code to display given year us leap year or not 
public class Leap_Year {

	public static void main(String[] args) {
		int year=2016;
	//	int count=0;
		if ((year%4==0 && year%100!=0) ||( year%400==0) )
			
		{
			System.out.println("This is leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		
	}

}
