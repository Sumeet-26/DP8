package com.abstraction;
/*5. WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
which has only definition and one method wash() which also has 
implementation. Create class Child which extends Parent and add the missing 
method implementation. In main, use both the methods by creating instance 
of the concrete class. 
6. Show use of parameterized constructor of parent class (Child class invokes 
parent’s parameterized constructor) using super*/
public abstract class Parent {
       String cook;
     
	
	public Parent()
	{
		System.out.println("Default constr of parent class");
	}
	// Parameterized constructor of parent class
	public Parent (String cook)
	{
		System.out.println("Parent Constructor called" +cook);
	}
	public abstract void cook();
	
	public void wash()
	{
		System.out.println("Wash method of parent");
	}
	
	
}
