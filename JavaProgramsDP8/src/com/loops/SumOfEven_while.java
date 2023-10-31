package com.loops;
import java.util.*;
public class SumOfEven_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner (System.in);
          System.out.println("Enter number");          
             int   num=sc.nextInt();
          
		int sum=0,digit;
	
		while(num>0)
		{
			digit=num%10;
		
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			num=num/10;
					
		}
		         System.out.println(sum);
		
		
		
		
	}

}
