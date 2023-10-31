package com.statements;
import java.util.*;
public class AlphabetDigitChar {

	public static void main(String[] args) {
		// code to check given value is Alphabet,character or digit using and operator
		char ch;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the chracter");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Chracter is alphabet");
		}
		else if (ch>='A' && ch<'Z')
		{
			System.out.println("Chracter is alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Chracter is digit");
		}
		else
		{
			System.out.println("Chracter is special Character");
		}
		
		
		
		
	}

}
