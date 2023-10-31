package com.statements;
import java.util.Scanner;
public class Divisible_5and11 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println("divisible by 5");
		}
		else if (num%11==0)
		{
			System.out.println("Divisble by 11");
		}
		else
		{
			System.out.println("It is not divisible ");
		}
		
		
		
		
		
		
		
		
		
	}

}
