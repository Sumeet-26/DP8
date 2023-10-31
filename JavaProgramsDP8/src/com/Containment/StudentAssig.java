package com.Containment;
/*. WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method 
 */
public class StudentAssig {

	private int rollno;
	private String name;
	
	public StudentAssig ()
	{
		
	}
	public StudentAssig(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		
	}
		public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Student Roll no :"+rollno+" Student Name :"+name;
	}
	public static void main(String[] args)
	{
		StudentAssig obj=new StudentAssig(10,"Suraj");
	    System.out.println(obj);
	    
	    StudentAssig obj1=new  StudentAssig(12,"Sumit");
	    System.out.println(obj1);
	    
	}

}
