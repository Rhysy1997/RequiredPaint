package com.nwrc.shapes;

//This class extends the Shape class inheriting its attributes and methods
public class Square extends Shape{
	
	//private variable to hide data
	//variable accessed via setters
	//class variable
	private double side;

	//no default argument constructor
	public Square() {
		
	}
	
	//constructor accepting one argument
	public Square(double side) {
		this.side = side;
	}
	
	//getters and setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	//override methods
	@Override
	public double getArea() {
		return getSide()*getSide();
	}

	//method used to calculate surface area of a square
	@Override
	public double getPerimeter() {
		return 4*getSide();
	}

	@Override
	public String toString() {
		return String.format("Area is:%2f, Perimeter is %2f", this.getArea(), this.getPerimeter());
	}

}
