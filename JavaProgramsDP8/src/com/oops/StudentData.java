package com.oops;
//write a employye class with appropriate data members and member methods.
//Student id name,contact ,email,percentage,grade
public class StudentData 
{

	// data members
	int studentid, physics, maths, biology, geography, history;
	String name, email;
	long contactNo;
	double percentage;
	char grade;

	public void setdata(int studenti, String n, String emailid, long contact, int phy, int math, int bio, int geo,
			int his) 
	{

		studentid = studenti;
		name = n;
		email = emailid;
		contactNo = contact;
		physics = phy;
		maths = math;
		biology = bio;
		geography = geo;
		history = his;
	}

	public void calculatePercenatgeGrade() 
	{
		percentage = (physics + maths + biology + geography + history) * 100 / 500;
		System.out.println("Percentage of student is " + percentage);

		if (percentage >= 80)
			System.out.println("Grade is " + "A");
		else if (percentage >= 60)
			System.out.println("Grade is " + "B");
		else if (percentage >= 40)
			System.out.println("Grade is " + "C");
		else
			System.out.println("Grade is " + "D");
	}

	public void displayData()
	{
		System.out.println("Student id " + studentid);
		System.out.println("Student name" + name);
		System.out.println("Student email id " + email);
		System.out.println("Student contact " + contactNo);
		System.out.println("Student marks " + physics);
		System.out.println("Student marks " + maths);
		System.out.println("Student marks " + biology);
		System.out.println("Student marks " + geography);
		System.out.println("Student marks " + history);
	}

	public static void main(String[] args)
	{
		StudentData obj = new StudentData();
		obj.setdata(1, "suraj", "Suraj@gmail.com", 1236547890l, 50, 60, 55, 68, 80);
		obj.displayData();
		obj.calculatePercenatgeGrade();

		System.out.println("----------------------------------------------------------");

		StudentData obj1 = new StudentData();
		obj1.setdata(2, " Mayur", "mayur@", 8600297159l, 80, 65, 56, 85, 45);
		obj1.displayData();
		obj1.calculatePercenatgeGrade();

	}

}
