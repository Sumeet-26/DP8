package com.inheritance;
/*2. Create a class BigKid which extends Kid created above. Implement readBook() 
differently in BigKid class. Here the method readBook() has been over-ridden in 
the child class BigKid() */
public class BigKid extends Kid {

	public void readBook()
	{
		System.out.println("Readbook method of kid");
	}
  
	public void readBook(String a,String b)
	{
		System.out.println("Readbook method of of kid (String a,String b)");
	}
	
	public static void main(String[] args)
	{
		BigKid obj=new BigKid();
		obj.readBook();
		obj.readBook("a", "b");
	}

}
