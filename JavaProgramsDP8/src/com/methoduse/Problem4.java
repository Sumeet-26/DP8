package com.methoduse;

import java.util.Scanner;

//2,3,5,7,11,13,17,19,23,29.......
public class Problem4 {

	
	public static void checkPrime(int num) 
	{
		int count;
		
		for(int i=1;i<=num;i++)
		{
			count =0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
		    }
				if(count==0) 
				{
					System.out.println(i+" ");
				}
			}	
		}
			
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter terms");
	int num=sc.nextInt();

	Problem4.checkPrime(num);
	
	}

}
