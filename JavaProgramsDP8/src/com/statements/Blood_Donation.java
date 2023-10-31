package com.statements;
import java.util.Scanner;
public class Blood_Donation {

	public static void main(String[] args) 
	{
		
		//write a code to check candidate is eligible for blood donation if candidate's weight is must be 50 or more than  and 
		// age is more than 18
		
		int wt,age;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter wt");
		wt=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		
		if(wt>=50) 
	{
			if(age>=18)
			{
				System.out.println("Candiate is eligible for blood donation");
			}			
	}
		else
		{
			System.out.println("Candiate is not eligible for blood donation");
		}
		
	}

}
