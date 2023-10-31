package com.override;
/*8)WAP to create class Person with method readScript().
 * create class Actor which extends Person implement readScript() differently in child.*/
public class Person {

	public void readScript()
	{
		System.out.println("Read script method of Person class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Person p=new Person();
	 p.readScript();
	 Actor a=new Actor();
	 a.readScript();
	}

}
	class Actor extends Person
	{
		public void readScript()
		{
			System.out.println("Read script method of Actor class");
		}
	}