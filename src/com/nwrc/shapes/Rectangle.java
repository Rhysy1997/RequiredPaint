package com.nwrc.shapes;

//This class extends the Shape class inheriting its attributes and methods
public class Rectangle extends Shape{
	
	//private variable to hide data
	//variable accessed via setters
	//class variable
	private double height;
	private double width;
	
	//no default argument constructor
	public Rectangle() {
		
	}
	
	//constructor accepting two arguments
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//getter - accessor
	public double getHeight() {
		return height;
	}

	//setter - mutator
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	//override methods
	@Override
	public double getArea() {
		return getHeight()*getWidth();
	}

	//method used to calculate surface area of a rectangle
	@Override
	public double getPerimeter() {
		return 2*(getWidth() + getWidth()/2);
	}

	@Override
	public String toString() {
		return String.format("Area is:%2f, Perimeter is %2f", this.getArea(), this.getPerimeter());
	}

	
}
