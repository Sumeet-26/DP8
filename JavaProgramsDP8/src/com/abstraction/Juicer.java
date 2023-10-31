package com.abstraction;
/*Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this 
abstract class Machine and implements method crush. Now, add another 
method filter in the class Juicer. In main method,  
a. Create an object of type Juicer and calls its crush, rotate and filter 
methods.  
b. Create an object of type Juicer with reference variable of Machine 
(Machine m = new Juicer). Check the methods available to m. */
public class Juicer extends Machine{

	@Override
	public void crush() 
	{
	    System.out.println("crush method implement in juicer");	
		
	}
     public void filter()
     {
    	 System.out.println("Filter method of juicer class");
     }
     
     public static void main(String[] args) 
     {
		Juicer j=new Juicer();
	    j.crush();
	    j.rotate();
	    j.filter();
	    System.out.println("----------called by reference variable of machine(Machine m = new Juicer)----------");
	    Machine m=new Juicer();
	    m.crush();
	    m.rotate();
	  //  m.filter();   it is not availabel to machine bcz we not allow child reference object to call parent menthod
    	 
    	 
    	 
	}
     
     
     
     
     
}
