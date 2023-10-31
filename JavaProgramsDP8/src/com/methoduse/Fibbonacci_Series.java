package com.methoduse;

import java.util.Scanner;

public class Fibbonacci_Series {

	public static void fibbonacci(int n)
	{
		int num1=0,num2=1;
		int count=0;
		 while(count<n)
		 {
			 System.out.println(num1+ " ");
			 
			 //swap number
			 int num3=num2+num1;
				 num1=num2;
				 num2=num3;
				 count=count+1;
		 }
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter term n");
		int n=sc.nextInt();
		 Fibbonacci_Series.fibbonacci(n);
		
		
		
	}

}
