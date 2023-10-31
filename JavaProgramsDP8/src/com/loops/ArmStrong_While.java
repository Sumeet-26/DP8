package com.loops;
import java.util.Scanner;

public class ArmStrong_While {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
            int num=sc.nextInt();
            int orignal=num;
            int sum=0;
            int rem;
            
            while(num>0)
            {
            	rem=num%10;
            	rem=rem*rem*rem;
            	sum=sum+rem;
            	num=num/10;  	     	
            }
            if(orignal==sum)
            	System.out.println("Number is armstrong number");
            else
            	System.out.println("Number is not armstrong number");
	}

}
