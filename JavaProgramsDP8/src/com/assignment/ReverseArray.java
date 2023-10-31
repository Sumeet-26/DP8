package com.assignment;

public class ReverseArray {

	public void arrayCreation()
	{
		int arr[]= {1,2,3,4,5};	
		this.showArrayElement(arr);
	}
	public void showArrayElement(int a[]) 
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReverseArray obj=new  ReverseArray();
		obj.arrayCreation();

	}

}
