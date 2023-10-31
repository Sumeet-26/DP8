package com.abstraction;
/*5. WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
which has only definition and one method wash() which also has 
implementation. Create class Child which extends Parent and add the missing 
method implementation. In main, use both the methods by creating instance 
of the concrete class. 
6. Show use of parameterized constructor of parent class (Child class invokes 
parent’s parameterized constructor) using super*/
public class Child extends Parent {
      
	
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("cook method of Parent class");
		
	}
	public Child (String name)
	{
		super(name);
	}
	
	
	public static void main(String[] args) {
		
		Child c=new Child(" in Child");
		c.cook();
		c.wash();
      
	}

	

}
