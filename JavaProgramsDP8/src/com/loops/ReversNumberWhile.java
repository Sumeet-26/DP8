package com.loops;
import java.util.*;
public class ReversNumberWhile {
           //display the number in reverse 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
		         int num=sc.nextInt();
		         
		         int rev=0;                                                    // num                     digit                                  rev(intailly 0)
		                                                                            //123                          123%10=3(remainder)              3
		                                                                            //12(quotient)            12%2=2                               3*10+2=32
		         while(num>0)                                          //1                                   1                                          32*10+1=321
		         {                                                                 //0  ----cond false 0>0   
		        	 int digit=num%10;                               // loop completes and print rev value
		        	 rev=rev*10+digit;
		        	 num=num/10;
		         }
		                   System.out.println(rev);
		
		          
		
		
		
		
		
		

	}

}
