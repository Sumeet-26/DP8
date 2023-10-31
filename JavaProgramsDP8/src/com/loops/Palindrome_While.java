package com.loops;
import java.util.*;
public class Palindrome_While {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rev=0;
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

}
