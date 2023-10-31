package com.statements;
import java.util.*;
public class Max_no_Using_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner (System.in);
     System.out.println("Enter Num1");
		int num1=sc.nextInt();
		System.out.println("Enter Num2");
		int num2=sc.nextInt();
		
		int res=num1>num2?1:0;
		
		switch(res)
		{
		case 0:
			res=num1==num2?1:0;
			switch(res)
			{
			case 0:
				System.out.println("Maximum number is "+num2);
				break;
			case 1:
				System.out.println("Both are equals ");
				break;
			}
			break;
		
		case 1:
			System.out.println("Maximum Number is "+num1);
		  break;
		
		
		
		}		
		
	}

}
