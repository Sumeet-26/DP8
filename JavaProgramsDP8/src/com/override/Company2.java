package com.override;
/*2) WAP to create class company with method address.
 * create class eBay which extends company implement address() differently in eBay class.
 * Here the method address ()has been overridden in child class.*/
public class Company2 {

	public void adress()
	{
		System.out.println("I am in Company class");
	}
	
	public class ebay extends Company2
	{
		public void adress()
		{
			System.out.println("I am in ebay class");
		}
	}
	
	public static void main(String []args)
	{
		
		
	}
	
}
