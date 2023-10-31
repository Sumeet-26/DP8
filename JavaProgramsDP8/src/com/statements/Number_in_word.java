package com.statements;
import java.util.*;
public class Number_in_word {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		num=sc.nextInt();
		
		if(num==1)
		{
			System.out.println("Given number is one");
		}
		else if (num==2)		
		{
			System.out.println("Given number is two ");
		}
		else if(num==3)
		{
			System.out.println("Given number is three");
		}
		else if (num==4)
		{
			System.out.println("Given number is four");
		}
		else if (num==5)
		{
			System.out.println("Given number is five");
		}		
		else {
			System.out.println("Given number is not in range");
		}
	}

}
