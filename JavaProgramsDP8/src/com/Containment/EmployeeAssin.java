package com.Containment;
/*Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter*/

public class EmployeeAssin {

	private int id;
	private double salary;
	private String name;
	private Department1 dept;
	private MydateAssig mydate;
	
	 EmployeeAssin() 
	{
		
	}
	
	 EmployeeAssin(int id,String name,int salary,Department1 dept,MydateAssig mydate)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.dept=dept;
		 this.mydate=mydate;	 
	 }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department1 getDept() {
		return dept;
	}

	public void setDept(Department1 dept) {
		this.dept = dept;
	}

	public MydateAssig getMydate() {
		return mydate;
	}

	public void setMydate(MydateAssig mydate) {
		this.mydate = mydate;
	}
        
		public String toString() 
		{
			return "Employee id "+id+"  Employee name :"+name+"  Salary :"+salary+"   Department  :"+dept+"   Date of Joining  :"+mydate;
		}
		
	public static void main(String[] args) {
		Department1 department=new Department1(101,"HR");
		MydateAssig joindate=new MydateAssig(10,2,2023);
		
		 EmployeeAssin obj=new  EmployeeAssin(1,"Sumit",80000,department,joindate);
		 System.out.println(obj);
	}

}
