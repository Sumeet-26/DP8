package com.arrayofobject;
/* 1.	WAP to print the employees from Employee[] array who has same salary 
 * (Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
 * /Accept id from user and show all emp who get same sal as given id
*/
     import java.util.*;
public class Employee1 {

		private int id;
		private String name;
		private double salary;
	
		public Employee1()
		{
			System.out.println("I am in default constructor");
			id=0;
			name="";
			salary=0.0;
		}
	    
		public Employee1(int id,String name,Double sal)
		{
			this.id=id;
			this.name=name;
			this.salary=sal;
		}
	
		public int getId()
		{
			return id;
		}
	    public void setId(int id)
	    {
	    	this.id=id;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    public void setName()
	    {
	    	this.name=name;
	    }
	    public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String toString() {
			return "Employee [ ID :" + id + " Name : " + name + " Salary : " + salary + "]";
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employee1 []arr=new Employee1[5];
		arr[0]=new Employee1(01,"Sumit",20000.);
		arr[1]=new Employee1(01,"Aman",550000.);
		arr[2]=new Employee1(01,"Yogesh",50000.);
		arr[3]=new Employee1(01,"Amol",55000.);
		arr[4]=new Employee1(01,"Sharang",20000.);
		
		System.out.println("Enter ID ");
		int id = sc.nextInt();
		Employee1 obj =new Employee1();
		
		for (int i = 0; i < arr.length; i++) {
			if (id == arr[i].getId()) {
				obj = arr[i];
				break;
			}
			else { 
				System.out.println("Invalid Id");
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (obj.getSalary() == arr[i].getSalary())
				System.out.println(arr[i]);

		}	
	}

}































