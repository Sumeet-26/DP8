package com.arrayofobject;
/*2.  WAP to print the employees from Employee[] array who has same joining date. 
You have Employee class which has 4 attributes id, name, salary, date 
(date is another object which has 3 attributes day, month, year)
 and add employee objects to your array
*/
	public class Date2 {

		// data member
	private int dd,mm,yy;
	
	public Date2()  
	{
		System.out.println("I am default constructor");
		dd=17;
		mm=10;
		yy=2023;
		
	}
	  public Date2(int dd,int mm,int yy)
	  {
		  System.out.println("I am parametrised constructor");
		  this.dd=dd;
		  this.mm=mm;
		  this.yy=yy;
	  }
	  public int getDd() {
		return dd;
	}
		public void setDd(int d) {
		   dd = d;
	}
		public int getMm() {
		return mm;
	}
		public void setMm(int m) {
		   mm = m;
	}
		public int getYy() {
		return yy;
	}
		public void setYy(int y) {
		     yy = y;
	}
		public void setData(int d,int m,int y) 
		{
			dd=d;
			mm=m;
			yy=y;
					
		}
		public boolean compare(Date2 o) {
			boolean result =false;
			if (this.dd==o.dd && this.mm==o.mm && this.yy==o.yy)
				result = true;
			return result;
		}
		
		public String toString()
		{
			return dd+"/"+mm+"/"+yy;
		}
		
		public static void main(String[] args) {
		

	}

}
