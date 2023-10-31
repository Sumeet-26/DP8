package com.loops;

public class ArraysDemo {

	public void arrayCreation()
	{
		// first syntax with new keyword
		 int arr[]=new int [5];
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 arr[3]=4;
		 arr[4]=5;
		
		 this.showArrayElement(arr);
		// without new keyword also called as first class object.
		 int arr1[]= {10,20,30,40,50};
		 this.showArrayElement(arr1);
	}
	public void showArrayElement(int a [])
	{
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);}
		System.out.println("**************");
	}
	public static void main(String[] args) {
		 ArraysDemo obj=new  ArraysDemo();
		obj.arrayCreation();
		

	}

}
