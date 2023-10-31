package com.statements;
import java.util.Scanner;
public class Number_in_Word_Switch {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
         System.out.println("Enter number");
         int num=sc.nextInt();
         
         switch (num) 
         {
		case 1:System.out.println("Given number is one");
		break;
		case 2: System.out.println("Given no number is two");
		break;
		case 3: System.out.println("Given no is Three");
		break;
		case 4:System.out.println("Given no is four");
		break;
		case 5:System.out.println("Given no is five");
		break;
		default:System.out.println("Not in range");
			
		}
         
         
	}

}
