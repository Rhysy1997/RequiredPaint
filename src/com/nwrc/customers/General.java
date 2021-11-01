package com.nwrc.customers;

import com.nwrc.constants.*;
import com.nwrc.shapes.*;

public class General extends Customer{

	private String customerName;
	
	public General() {
		super();
	}
	
	public General(char customerType, String customerAddress, String customerTeleNo, String roomShape, double height, double width, String customerName) {
		super(customerType, customerAddress, customerTeleNo, roomShape, height, width);
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public static void printGeneralHeading() {
		System.out.println(String.format("\n%-10s%-15s%-30s%-20s%-15s%-15s%-15s%-15s", "Type", "Name", "Address", "Tel No", "Room Shape", "Height", "Width", "Coverage")); 
	}

	@Override
	public String toString() {
		return String.format("%-10c%-15s%-30s%-20s%-15s%-15.2f%-15.2f%-15.2f", this.getCustomerType(), this.getCustomerName(), this.getCustomerAddress()
				, this.getCustomerTeleNo(), this.getRoomShape(), this.getHeight(), this.getWidth(), this.getCoverage());
	}
	
	@Override
	public double getCoverage() {
		
		double surfaceArea = 0.0;
		double perimeter = 0.0;
		
		switch(getRoomShape().toUpperCase()) {
		case "SQUARE": 
			Square square = new Square(getWidth());
			perimeter = square.getPerimeter();
			surfaceArea = perimeter * getHeight();
		break;
		case "RECTANGULAR": 
			Rectangle rect = new Rectangle(getHeight(), getWidth());
			perimeter = rect.getPerimeter();
			surfaceArea = perimeter * getHeight();
		break;
		case "CYLINDRICAL": 
			double radius = (getWidth() / 2);
			Circle circle = new Circle(radius);
			perimeter = circle.getPerimeter();
			surfaceArea = perimeter * getHeight();
		break;
			default:
				System.out.println("Shape should be Square, Rectangular or Cylindrical");
		}
		
		surfaceArea = surfaceArea * Constants.WASTAGE;
		//System.out.println("times wastage = "+surfaceArea);
		surfaceArea = surfaceArea - Constants.DOOR;
		//System.out.println("minus doors = "+surfaceArea);
		surfaceArea = surfaceArea - Constants.WINDOW;
		//System.out.println("minus windows = "+surfaceArea);
		surfaceArea = surfaceArea / Constants.COVERAGE;
		//System.out.println("divided by coverage = "+surfaceArea);
		surfaceArea = surfaceArea * Constants.GALLONS;
		//System.out.println("times gallons to get litres = "+surfaceArea);
		
		return surfaceArea;
	}

}//end class
