package com.assignment;

public class Employee {
     
	private int emp_id;
	private String name;
	private double sal;
	
	public Employee()
	{
		int emp_id;
		String name;
		double sal;
	}
	public Employee(int id,String n,double s)
	{
		emp_id=id;
		name=n;
		sal=s;
	}
	public void setEmpid(int id)
	{
		emp_id=id;
	}
	public int getEmpid()
	{
		return emp_id;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		sal=salary;
	}
	public double getSalary() {
		return sal;
	}
	
	public void displayData() 
	{
		System.out.println("Employee ID is  "+ emp_id);
		System.out.println("Employee name is  "+ name);
		System.out.println("Employee salary is  "+ sal);
	}
	public void compareSalary(Employee obj1) 
	{
		if(this.sal>obj1.sal)
			System.out.println(this.name+" has a greater salary than "+obj1.name);
		else
			System.out.println(obj1.name+" has a greater salary than "+this.name);
	}
	public static void main(String[] args) {
		
		Employee obj=new  Employee();
        obj.setEmpid(1);
        obj.setName("Sumit");
		obj.setSalary(55000);
		obj.displayData();
		
		Employee obj1=new Employee(2,"Yogesh",60000);
        obj1.displayData();
         
        obj.compareSalary(obj1);
	}

}
