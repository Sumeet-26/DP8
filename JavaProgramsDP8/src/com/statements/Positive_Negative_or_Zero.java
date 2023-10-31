package com.statements;
import java.util.Scanner;
public class Positive_Negative_or_Zero {

	public static void main(String[] args) {
               int num;
               Scanner sc =new Scanner(System.in);
               System.out.println("Enter number");
               num=sc.nextInt();
               
              if(num>0) 
              {
            	System.out.println("Given number is positive");
              }
              else if(num<0)
              {
            	  System.out.println("Given number is negative");
              }
              else if(num==0)
              {
            	  System.out.println("Given number is zero");
              }
              
              
              
              
              
              
              
              
              
	}

}
