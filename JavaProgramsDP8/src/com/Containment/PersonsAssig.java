package com.Containment;
/*Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data*/

public class PersonsAssig {
     
	private String name,gender;
	private int age;
	private Adress adress;
	
	PersonsAssig()
	{
		
	}
	
	PersonsAssig(String name,int age,String gender,Adress adress)
	{
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String toString()
	{
		return "Person [ Name="+name+",Gender="+ gender +"  age="+age+",  Address = "+adress+"]";
		
	}
	public static void main(String[] args) 
 {
		PersonsAssig obj=new PersonsAssig("Sumit",25,"Male",new Adress("Pune","MH","India"));
		System.out.println(obj);
		
		Adress obj2=new Adress("Mumbai","Mh","India");
		PersonsAssig obj1=new PersonsAssig("Yogesh",30,"male",new Adress ("Mumbai","Mh","India"));
		System.out.println(obj1);
	}

}
