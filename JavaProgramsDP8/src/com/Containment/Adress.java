package com.Containment;

public class Adress {
	private String city;
    private String state;
    private String country;
    
    public Adress() 
    {
    	
    }
    
	public Adress(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getCountry()
	{
		return country;
	}
	
	public String toString() 
	{
		return "City : "+ city+"      State : "+state+"      Country :"+country;	
	}
	public static void main(String[] args) {
		
		Adress obj=new Adress("Pune","MH","India");
		System.out.println(obj);
		
		Adress obj1=new Adress("Mumbai","MH","India");
		System.out.println(obj1);
		
	}

}
