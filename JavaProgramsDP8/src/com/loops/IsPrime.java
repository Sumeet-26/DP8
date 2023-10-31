package com.loops;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

             Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		for(int i=2; i<num; i++)
		{
			if (num % i==0) 
			{
				isprime=false;
				break;
			}
			if(isprime==true)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
