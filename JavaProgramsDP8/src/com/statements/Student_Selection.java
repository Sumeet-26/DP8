package com.statements;
import java.util.*;
public class Student_Selection {

	public static void main(String[] args) {
		
		// write code to check candidate is eligible for interview using nested if else 
		int per,year;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the percentage");
		per =sc.nextInt();
		System.out.println("Enter the passout year");
		year=sc.nextInt();
		
		if(year==2022)
		{
			if(per>60)
			{
				System.out.println("Selected for interview");
			}
			else 
			{
				System.out.println("not selected");		
			}	
			}		
		else
		{
			System.out.println("Not selected for interview");
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
