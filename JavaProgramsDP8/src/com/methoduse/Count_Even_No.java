package com.methoduse;

public class Count_Even_No {

	//count of even no using 1 to 20
	public void count()
	{
		int i;
		int count=0;
		
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
				count=count+1;
			
		}
			System.out.println(count);
		
	}

	
	public static void main(String[] args)
	{
		Count_Even_No obj=new Count_Even_No ();
		obj.count();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
