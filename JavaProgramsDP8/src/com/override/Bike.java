package com.override;

/*5)WAP to create class Bike with fields color ,speed and  method bikeInfo()
 *  which is show color and speed of bike .
 *  create class Pulsar which extends Bike implement bikeInfo() differently child */
public class Bike {

	private String color;
	private int speed;

	public void bikeInfo() {
		System.out.println("Colour" +" "+" speed");
	}


	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.bikeInfo();
		Pulsar obj1 = new Pulsar();
		obj1.bikeInfo(120);
		obj1.bikeInfo("Red");
	}
}

 class Pulsar extends Bike {

	public void bikeInfo(int s) {
		System.out.println(s);
	}

	public void bikeInfo(String c) {
		System.out.println(c);
	}

	
	}
