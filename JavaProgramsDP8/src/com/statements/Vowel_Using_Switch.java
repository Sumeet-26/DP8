package com.statements;
import java.util.*;
public class Vowel_Using_Switch {

	public static void main(String[] args) {
		   // check given char is vowel or consonant using switch case
		
		char ch;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Character");
		ch =sc.next().charAt(0);
		
		switch (ch) {
		case 'a' :System.out.println("vowel");
			break;
		case 'e':System.out.println("Vowel");
			break;
		case 'i': System.out.println("Vowel");	
		    break;
		case 'o':System.out.println("Vowel");
			break;
		case 'u':System.out.println("Vowel");	
			
		case 'A':System.out.println("Vowel");
		    break;
		case 'E':System.out.println("Vowel");
		    break;
		case 'I':System.out.println("Vowel");
		    break;
		case'O':System.out.println("Vowel");
		    break;
		case 'U':System.out.println("Vowel");
		    break;
		    default:System.out.println("Consonant");
               
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
