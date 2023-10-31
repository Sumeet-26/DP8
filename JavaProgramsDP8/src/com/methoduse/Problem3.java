package com.methoduse;

import java.util.Scanner;
//1,22,333,4444,55555,666666,...........
public class Problem3 
{
		public static void series(int n) {
		  int i,j;

	        for(i=1; i<=n; i++)
	        {
	            for(j=1; j<=i; j++)
	            {
	                System.out.print(i);
	            }
	            System.out.print(" , ");
	        }
		}
		
		public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms");
		int n=sc.nextInt();
		
		Problem3.series(n);
		

	
		}
	}

