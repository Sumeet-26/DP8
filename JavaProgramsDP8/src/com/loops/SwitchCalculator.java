package com.loops;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st operand ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd operand");
		int num2=sc.nextInt();
		char ch;
		
		do {
				System.out.println("Add,Sub,Multi,Div");
				System.out.println("Enter the choice");
				String choice=sc.next();
			
			
			switch(choice)
			{
			case "Add":
				       System.out.println("Add="+(num1+num2));
				       break;
			case "Sub":
						System.out.println("Sub="+(num1-num2));
						break;
			case "Multi":
			        	System.out.println("Mul="+(num1*num2));
			            break;
			case "Div" :
				         System.out.println("Div="+(num1/num2));
			            break;
			    default: System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		

	}

}
