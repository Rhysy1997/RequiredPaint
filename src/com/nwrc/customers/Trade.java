package com.nwrc.customers;

import com.nwrc.constants.Constants;

public class Trade extends Customer{

	private String tradeName;
	
	public Trade() {
		super();
	}
	
	public Trade(char customerType, String customerAddress, String customerTeleNo, double surfaceArea, String tradeName) {
		super(customerType, customerAddress, customerTeleNo, surfaceArea);
		this.tradeName = tradeName;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public static void printTradeHeading() {
		System.out.println(String.format("\n%-10s%-15s%-30s%-20s%-15s%-15s", "Type", "Name", "Address", "Tel No", "SurfaceArea", "Coverage"));
	}
	
	@Override
	public String toString() {
		return String.format("%-10c%-15s%-30s%-20s%-15.2f%-15.2f", this.getCustomerType(), this.getTradeName(), this.getCustomerAddress()
				, this.getCustomerTeleNo(), this.getSurfaceArea(), this.getCoverage());
	}

	@Override
	public double getCoverage() {
		
		double surfaceArea = 0.0;
		surfaceArea = getSurfaceArea() * Constants.WASTAGE;
		surfaceArea = surfaceArea - Constants.DOOR;
		surfaceArea = surfaceArea - Constants.WINDOW;
		surfaceArea = surfaceArea / Constants.COVERAGE;
		surfaceArea = surfaceArea * Constants.GALLONS;
		
		return surfaceArea;
	}


	
}//end class
