package com.abstraction;
/*2. Above we created an abstract class Machine with an abstract method crush 
and a concrete / implemented method rotate. Now create another abstract 
class Mixer which extends the abstract class Machine, has method crush 
implemented and has an additional concrete method blend. In main create an 
object of class of Mixer. Call methods rotate, blend and crush. */
public class Mixer2 extends Machine{

	@Override
	public void crush()
	{
		System.out.println("crush method of machine implemnted in Mixer2");
	}
	
	public void blend()
	{
		System.out.println("Blend method of Mixer2");
	}
	
	public static void main(String[] args) 
	{
		Mixer2 mx=new Mixer2();
		mx.rotate();
		mx.crush();
		mx.blend();

	}

	

}
