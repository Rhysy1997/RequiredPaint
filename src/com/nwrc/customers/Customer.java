package com.nwrc.customers;

public abstract class Customer {
	
	private char customerType;
	private String customerAddress;
	private String customerTeleNo;
	private double surfaceArea;
	private String roomShape;
	private double height;
	private double width;
	
	public Customer() {
	}
	
	//overridden and overloaded the no default argument constructor for a trade customer
	public Customer(char customerType, String customerAddress, String customerTeleNo, double surfaceArea) {
		this.customerType = customerType;
		this.customerAddress = customerAddress;
		this.customerTeleNo = customerTeleNo;
		this.surfaceArea = surfaceArea;
	}
	
	//overridden and overloaded the no default argument constructor for a general customer
	public Customer(char customerType, String customerAddress, String customerTeleNo, String roomShape, double height, double width) {
		this.customerType = customerType;
		this.customerAddress = customerAddress;
		this.customerTeleNo = customerTeleNo;
		this.roomShape = roomShape;
		this.height = height;
		this.width = width;
	}

	public char getCustomerType() {
		return customerType;
	}

	public void setCustomerType(char customerType) {
		this.customerType = customerType;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerTeleNo() {
		return customerTeleNo;
	}

	public void setCustomerTeleNo(String customerTeleNo) {
		this.customerTeleNo = customerTeleNo;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getRoomShape() {
		return roomShape;
	}

	public void setRoomShape(String roomShape) {
		this.roomShape = roomShape;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public abstract double getCoverage();
	
	//generic toString() method that both child classes can use
	@Override
	public String toString() {
		return String.format("%c\t%s\t%s", this.getCustomerType(), this.getCustomerAddress(), 
				this.getCustomerTeleNo());
	}
}//end class
