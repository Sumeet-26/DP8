package com.methoduse;
// write your own method to satisfy the relationship bet the inputs & outputs
//832--->594
//51--->36
//7977-->180
//665--->99
//149-->0

import java.util.Scanner;

public class Problem_1 
{
     public void calculaterev(int num)
     {
    	 int rev=0;
    	 int orignum=num;
    	 while(num>0)
    	 {
    		 int rem=num%10;
    		 rev=rev*10+rem;
    		 num=num/10;	 
    	 }
    	 rev=orignum-rev;
    	 if(rev>0)
    		 System.out.println(rev);
    	 else
    		 System.out.println("0");
    	 
     }
	
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number");
	  int num=sc.nextInt();
	  
	  Problem_1 obj=new Problem_1();
	  obj.calculaterev(num);
	
	}

}
