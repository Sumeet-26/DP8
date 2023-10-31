package com.inheritance;
  /*3. Create a class Teenager which extends Kid created above (#14). Implement 
readBook() differently in Teenager class. In main method, declare 2 variables k1, 
k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should 
reference object of class BigKid and K2 should reference object of class Teenager. 
Call their respective readBook() methods. The output is different from both the 
method calls even if the variable type is the same i.e. Kid. This is compile time 
polymorphism example.*/
public class Teenager extends Kid{
 
	public void readBook()
	{
		System.out.println("In Teenager readbook");
	}
	public void readBook(String a,String b)
	{
		System.out.println("In teenager readbok(String a,String b) ");
	}
	
	public static void main(String[] args) {
	
		Kid k1=new BigKid();
		k1.readBook();
	
        Kid k2=new Teenager();
        k2.readBook("a", "b");
		
		
		
		
		
		
		
		
		
	}

}
