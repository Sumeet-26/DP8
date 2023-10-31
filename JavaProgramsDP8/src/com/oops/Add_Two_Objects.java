package com.oops;

public class Add_Two_Objects {

	private int dd,mm,yy;

		public Add_Two_Objects()
		{
			System.out.println("I am default Constructor");
			dd=17;
			mm=10;
			yy=2023;
		}
		public Add_Two_Objects(int d,int m,int y) 
		{
		
			dd=d;
			mm=m;
			yy=y;
		}
		public void setData(int d,int m,int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
	    public void printData()
	    {
	    	System.out.println("date is "+dd+"/"+mm+"/"+yy);
	    }
	    public void add(Add_Two_Objects obj2)
	    {
	    	System.out.println(obj2.dd);
	    	System.out.println(obj2.mm);
	    	System.out.println(obj2.yy);
	    	
	    	System.out.println(this.dd);
	    	System.out.println(this .mm);
	    	System.out.println(this.yy);
	    	
	    	int d=this.dd+obj2.dd;
	    	int m=this.mm+obj2.mm;
	    	int y=this.yy+obj2.yy;
	    	System.out.println("date is "+d+"/"+m+"/"+y);
	    }
		public static void main(String[] args)
		{
		
			Add_Two_Objects obj=new Add_Two_Objects(18,10,2023);
			Add_Two_Objects obj1=new  Add_Two_Objects();
			 obj.printData();
			 obj1.printData();
			 obj.add(obj1);

	}

}
