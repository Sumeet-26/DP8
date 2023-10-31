package com.methoduse;

import java.util.Scanner;

public class Palindrome {

	public void checkPalindrome(int num) {
	int rev=0;
	//int num;
	int orginalNum=num;
	
	while(num>0)
	{
		 int digit=num%10;                             
		 
    	 rev=rev*10+digit;
    	 num=num/10;
		
	}
		if (orginalNum==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		Palindrome obj=new Palindrome();
		obj.checkPalindrome(num);
		
		
		
		
		
		
		
		
		
		
		
	}

}
