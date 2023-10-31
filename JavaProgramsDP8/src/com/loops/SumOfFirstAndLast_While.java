package com.loops;
import java.util.*;
public class SumOfFirstAndLast_While {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int sum=0;
		int firstdigit=0;
		int lastdigit=num%10;
		
		while(num>0)
		{
			firstdigit=num%10;
			num=num/10;
		}
		sum=firstdigit+lastdigit;
		System.out.println("Sum of 1st and last digit is "+sum);	
	}

}
