package com.basic;

import java.util.Scanner;

//2,3,5,7,11,13,17.....
public class PrimeNumber 
{
	public static void prime (int a)
	{
		
		for(int i=1;i<=a;i++)
		{
			int count=0,j;
			for( j=2;j<=a/2;j++) 
		{
			if(a%j==0)
				count=1;
		}
			if(count==0)
				System.out.println(j);
		}
	}	public static void main(String[] args) 
	{     Scanner sc =new Scanner(System.in);
	          System.out.println("Enter number");
	          int a=sc.nextInt();
	          PrimeNumber.prime(a);
	          
	          
	}
}
