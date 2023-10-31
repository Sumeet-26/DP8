package com.oops;
//for each loop
public class Enhanced_For_Loop {

	public void printArray() 
	{
          int arr[]= {1,2,3,4,5};
	
	for (int i:arr)
		{
		System.out.println(i);
		}
	this.addArrayElements(arr);
	}
	
	 public void addArrayElements(int obj []) 
	 {
	    int sum=0;
	    for(int i:obj)
	    	sum=sum+i;
		 System.out.println("Sum of elements is "+sum);
	 }
	 
	public static void main(String[] args) 
	{
		Enhanced_For_Loop obj=new Enhanced_For_Loop();
		obj.printArray();

	}

}
