package com.override;
/*5)WAP to create class Programmer with Method workingHours().
 * create class Employee which extends Programmer
 *  implement workingHours()differently in child.*/

 public class Programmer {
	   
	   public void workingHours()
	   {
		   System.out.println("Programmer works 45 hrs a week");
	   }
	   
	   public static void main(String[] args) 
	   {
		   Programmer p=new Programmer();
		   p.workingHours();
		   Employee e=new Employee();
		   e.workingHours();
    	}

}
   class Employee extends Programmer
   {
	   public void workingHours()
	   {
		   System.out.println("Employee works 35 hrs a week");
	   } 
   }
   
   