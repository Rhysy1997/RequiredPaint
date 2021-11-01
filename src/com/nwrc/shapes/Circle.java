
package com.nwrc.shapes;

//This class extends the Shape class inheriting its attributes and methods
public class Circle extends Shape{
	
	//private variable to hide data
	//variable accessed via setters
	//class variable
	private double radius;
	
	//no default argument constructor
	public Circle() {
		
	}
	
	//constructor accepting one argument
	public Circle(double radius) {
		this.radius = radius; 
	}
	
	//overloading circle
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//getter - accessor
	public double getRadius() {
		return radius;
	}
	//setter - mutator
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//override methods
	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	//method used to calculate surface area of a circle
	@Override
	public double getPerimeter() {			
		return 2 * Math.PI * getRadius();
	}

	@Override
	public String toString() {
		return String.format("Area is:%2f, Perimeter is %2f, and Radius is %2f", this.getArea(), this.getPerimeter(), this.getRadius());
	}
	
}
