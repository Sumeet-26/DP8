package com.oops;
/* National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football, 
United States is baseball. Write a Java program to read country name as user-input and to print the 
country’s national game. Use switch */
import java.util.*;
public class Switch_Use_Game {

	String countryName;
	
	public void setData(String Cn)
	{
		countryName=Cn;	
	}
	public void checkData() 
	{
		switch(countryName)
		{
		case "India":System.out.println("National game of india is hockey ");
		break;
		case "China":System.out.println("National game of China is table tennis ");
		break;
		case "Bangladesh":System.out.println("National game of bangladesh is kabaddi");
		break;
		case "Italy":System.out.println("National game of Italy is Football");
		break;
		case "United States":System.out.println("National game of United States is baseball");
		break;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Switch_Use_Game obj=new  Switch_Use_Game();
	    System.out.println("Enter country name as follows India,China,Bangladesh,Italy,Unites States");
		String country=sc.next();
         obj.setData(country);
         obj.checkData();
	}

}
