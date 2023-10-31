package com.inheritance;

public class MyDate7 {
     
private int dd,mm,yy;
	
	public MyDate7()
	{
		dd=17;
		mm=10;
		yy=2023;
	}
	public MyDate7(int dd,int mm,int yy)
	{     
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;		
	}
    
        public String toString()
    {
    	return dd+"/"+mm+"/"+yy;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
