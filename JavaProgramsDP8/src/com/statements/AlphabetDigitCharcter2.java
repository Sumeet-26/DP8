package com.statements;
import java.util.Scanner;
public class AlphabetDigitCharcter2 {

	public static void main(String[] args) {
		// code to check given value is Alphabet,character or digit using or operator
            char ch;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the Character");
            ch=sc.next().charAt(0);
            
            if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
                {
            	      System.out.println("Chracter is alphabet");
            	}
            else if(ch>='0'   &&  ch<='9')
            {
            	System.out.println("Chracter is digit");
            }
            else 
            {
            	System.out.println("Any other charcter");
            }
            	
            	
            	
            
            
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
