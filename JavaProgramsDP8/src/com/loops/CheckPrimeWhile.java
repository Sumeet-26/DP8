package com.loops;

import java.util.Scanner;

public class CheckPrimeWhile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int i=2;
		int count =0;
		
		while (i<num)
			{    if( num % i == 0)
			    {      count=1;
			            break;
			      }
				i++;
			}
		if(count==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}	
	}

}
