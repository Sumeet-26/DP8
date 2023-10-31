package com.methoduse;

import java.util.Scanner;

public class IncreasingNo_Series {

	public static void checkNo (int num) {
		int lastdigit=num%10;
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			if(digit>lastdigit)
				count++;
			lastdigit=digit;
		}
		if(count==0)
		  System.out.println("Incresing number");
		else
			System.out.println("not increasing number");
	}	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
	    int num=sc.nextInt();
	    IncreasingNo_Series.checkNo(num);

	}

}
