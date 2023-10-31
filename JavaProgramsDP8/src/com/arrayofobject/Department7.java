package com.arrayofobject;
/*
 * 7)Employee class is as follows .
		Employee {
			int empno ;
			String name ;
			Department dept ;}
		Where dept is object of department class. Department class as deptId and deptname.
		Write a program to create array of 3 employees. Each employee will have different department

 */

public class Department7 {
       private int deptId;
       private String deptName;
       
       public Department7()
       {
    	   deptId=0;
    	   deptName="";
       }
       public Department7(int deptId,String deptName)
       {
    	   this.deptId=deptId;
    	   this.deptName=deptName;
       }
       
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String toString() {
		return "Department [ID : "+deptId+"Name : "+deptName+"]";
	}
	
	public static void main(String[] args) 
	{
		

	}

}
