package com.statements;
import java.util.*;
public class Display_days {

	public static void main(String[] args) {
		 // write code to take a number as input from the user and display its day name as per input
		  
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num) 
		{
		case 1: System.out.println("Monday");
		break;
		case 2:System.out.println("Tuseday");
		break;
		case 3:System.out.println("Wenesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");	
		break;
		case 6: System.out.println("Saturday");
		break;
		case 8: System.out.println("Sunday");
		
		default:System.out.println("invalid number");
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}


