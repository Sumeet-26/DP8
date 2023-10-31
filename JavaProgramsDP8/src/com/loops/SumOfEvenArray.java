package com.loops;

public class SumOfEvenArray {

	int arr[];
	
	public  SumOfEvenArray()
	{
		arr=new int [5];
		
		for (int i=0;i<arr.length;i++)
		{
			arr [i]=i;
		}
	}
	public SumOfEvenArray(int a[])
	{
		arr=a;
	}
	public void SumOfEvenArray()
	{
		int sum=0;
		for (int i:arr)
		{
			if (i%2==0) 
				sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		SumOfEvenArray obj=new SumOfEvenArray();
		obj.SumOfEvenArray();
             
		int arr1[]=new int [5];
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		arr1[3]=8;
		arr1[4]=10;
		
		SumOfEvenArray obj1=new SumOfEvenArray(arr1);
		obj1.SumOfEvenArray();
		
		
	}

}
