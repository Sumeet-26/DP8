package com.Containment;
/*1. WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method*/

public class DepartmentAssign {

	private  int id ;
	private  String name;
	StudentAssig stud;
	public  DepartmentAssign()
	{
		id=0;
		name="";
		stud =new StudentAssig();
		
		
	}
	public DepartmentAssign(int id,String name,StudentAssig stud)
	{
		this.id=id;
		this.name=name;
		this.stud=stud;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setStudent( StudentAssig stud)
	{
		this.stud=stud;
	}
	public StudentAssig getStudentAssig()
	{
		return stud;
	}
	public String toString()
	{
		return "Department name :"+name+"\n"+"Department ID : "+id+"\t "+stud;
	}	
	public static void main(String[] args)
	{
		
		DepartmentAssign obj=new DepartmentAssign(1," Science", new StudentAssig(1,"Yogesh"));
		System.out.println(obj);
		
	    StudentAssig s=new  StudentAssig(2,"Sumit");
		DepartmentAssign obj1=new DepartmentAssign(2,"Arts ",s);
		System.out.println(obj1);
	}

}
