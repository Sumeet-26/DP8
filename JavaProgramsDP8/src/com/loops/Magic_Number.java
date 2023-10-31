package com.loops;
import java.util.*;
public class Magic_Number {

	public static void main(String[] args) {
		
		
		int magicNumber=66;
		 Scanner sc =new Scanner(System.in);		
		
		for (int i=1; ; i++)// infinite loop
		{
			System.out.println("Enter the number for gusseing ");
			int num=sc.nextInt();
			if (num>magicNumber) {
				System.out.println("Number is greater please try again");
			      continue;
			}
			      else if (num<magicNumber)
			      {
			    	  System.out.println("Number is less please try again");
			    	  continue;
			      }
			      else 
			      {
			    	  System.out.println("Number is matching");
			    	  break;
			      }
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
