package com.statements;
import java.util.*;
public class Max_bet_three_number {

	public static void main(String[] args) {
		
	int num1;
	int num2;
	int num3;
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter number");
	num1=sc.nextInt();
	System.out.println("Enter number");
	num2=sc.nextInt();
	System.out.println("Enter number");
	num3=sc.nextInt();
	
		if(num1>num2)
		       { if (num1>num3)
		          {
		             System.out.println("Print num1 is greater");
		          }
		else 
	                    	{
			                     System.out.println("Print num3 is greater");
		                    }
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Print number 2 is greater");
			}
			else
			{
				System.out.println("Print num 3 is greater ");
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
