package com.override;

/*4)WAP to create class shape with method draw().
 * create class circle, square, Rectangle which extends Shape implement draw() 
 * differently in each child.*/
 class Shape1 {

	public void draw() {
		System.out.println("Draw method of shape class");
	}

}

class Circle extends Shape1 {

	public void draw() {
		System.out.println("Draw method of circle class");
	}
}

class Square extends Shape1 {
	public void draw() {
		System.out.println("Draw method of Square class");
	}
}

class Rectangle extends Shape1 {

	public void draw() {
		System.out.println("Draw method of rectangle class");
	}
}

public class Shape{

	public static void main(String[] args) {

		Shape1 s = new Shape1();
		s.draw();
		Circle c = new Circle();
		c.draw();
		Square sq = new Square();
		sq.draw();
		Rectangle r = new Rectangle();
		r.draw();

	}

}
