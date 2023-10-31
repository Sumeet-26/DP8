package com.oops;

//Write a student class which has roll no,name,percentage,grade,And array of integers for marks of subject.
public class StudentsArray {

	private int rollno;
	private static String name;
	private float perc;
	private char grade;
	private int arr[];

	public StudentsArray() {
		arr = new int[5];
		 rollno=0;
		// name;
	}

	public StudentsArray(int rn, String sName, int a[]) {
		rollno = rn;
		name = sName;
		arr = a;
	}

	public float calculatePerc() {
		int sum = 0;
		for (int i : arr)

			sum = sum + i;

		perc = ((float) sum / 500) * 100;
		return perc;
	}

	public void calculateGrade() {
		if (perc >= 80)
			System.out.println("Grade is " + "A");
		else if (perc >= 60)
			System.out.println("Grade is " + "B");
		else if (perc >= 40)
			System.out.println("Grade is " + "C");
		else
			System.out.println("Grade is " + "D");

	}

	public void displayData() {
		System.out.println("Roll no of Student is " + rollno);
		System.out.println("Name of Student is " + name);
		System.out.println("Percentage of Student is  " + perc);

	}

	public static void main(String[] args) {

		int arr1[] = { 50, 80, 80, 86, 82 };
		StudentsArray obj = new StudentsArray(2, "Yogesh", arr1);
		obj.calculatePerc();
		obj.calculateGrade();
		obj.displayData();

		int arr2[] = { 45, 36, 89, 92, 90 };
		StudentsArray obj1 = new StudentsArray(2, "Sumit", arr2);
		obj1.calculatePerc();
		obj1.calculateGrade();
		obj1.displayData();

	}

}
