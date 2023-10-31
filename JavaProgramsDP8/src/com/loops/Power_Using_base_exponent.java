package com.loops;
import java.util.*;
public class Power_Using_base_exponent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=sc.nextInt();
		System.out.println("Enter the exponent number");
		int exponent=sc.nextInt();
		
		int power=1;
		
		for(int i=1;i<=exponent;i++) 
		{
			power=power*base;
		}
		System.out.println(power);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
