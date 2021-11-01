package com.nwrc.main;

import com.nwrc.customers.*;
import com.nwrc.utilities.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nwrc.constants.*;

public class DifferentCoats {

	//This is the class used to test the developed software system.

	public static void main(String[] args) {

		//Customer tests
		//Customer cust = new Customer('G',"Old Boat Lane, Donegal","02871 345678",350);
		
		//General tests
		//General gen = new General('G',"Old Boat Lane, Donegal","02871 345678","Square",10,10, "Sara Smith");
		//General gen = new General('G',"Old Boat Lane, Donegal","02871 345678","Rectangular",11,9, "Sara Smith");
		//General gen = new General('G',"Old Boat Lane, Donegal","02871 345678","Cylindrical",30,1, "Sara Smith");
		//System.out.println(gen.printGeneralHeading());
		//System.out.println(gen.toString());
		
		//Trade tests
		//Trade trade = new Trade('T', "Old Boat Lane, Donegal","02871 345678",350,"TMK Designs");
		//System.out.println(trade.printTradeHeading());
		//System.out.println(trade.toString());
		
		DifferentCoats.explanation();
		DifferentCoats.displayCustomerObjects();
		
	}//end main
	
	// Task 3 a - Explanation of the software system developed.
	public static void explanation() 
	{
		System.out.println("Different Coats");
		System.out.println("\nThe system we have developed will output " + 
							"General and Trade customer paint required details.\n" +
							"The system will calculate paint required in litres " +
							"based on the room shape, wall height, and wall width. \n" +
							"Trade customer calculations for paint will only use " +
							"surface area passed in via the Trade class constructor. \n" +
							"These parameters will be taken from a file and passed into " +
							"the appropriate constructor depending on the customer type. \n "
							
							);
	}//end explanation
	
	// Task 3 b - Instantiating appropriate customer objects and displaying.
	public static void displayCustomerObjects() 
	{
		String folderPath = "C:\\Selenium\\";
		String fileName = "customers.csv";
		
		String pathAndFile = folderPath + fileName;
		
		List<String> recordsInList;
		
		Helper helpObj = new Helper();
		recordsInList = helpObj.readFileIntoList(pathAndFile);
		
		//setting up trade and general customer objects.
		Trade tradeCustomer;
		General generalCustomer;
		
		//lists of trade and general customers for storage and output further down
		List<Trade> trade = new ArrayList<>();
		List<General> general = new ArrayList<>();
		
		//looping through the records passed in
		for(int x=0;x<recordsInList.size();x++) 
		{
			//splitting columns per each row and saving in a String array
			String[] values = recordsInList.get(x).split(";");
			char type = values[0].charAt(0);
			
			//Trade customer
			if(type == 'T')
			{
				double surfaceArea = Integer.parseInt(values[4]);
										//type	address	   number	  surfaceArea  name
				tradeCustomer = new Trade(type, values[2], values[3], surfaceArea, values[1]);
				//add newly created trade customer object to trade list
				trade.add(tradeCustomer);
			
			}
			else //General customer
			{
				double height = Double.parseDouble(values[5]);
				double width = Double.parseDouble(values[6]);
											//type  address	   number     roomShape  height  width  name
				generalCustomer = new General(type, values[2], values[3], values[4], height, width, values[1]);
				//add newly created general customer object to general list
				general.add(generalCustomer);
			}
		}
	
		//print trade objects from trade list
		Trade.printTradeHeading();
		for(int x = 0; x < trade.size(); x++) {
			System.out.println(trade.get(x));
		}
		
		//print general objects from general list
		General.printGeneralHeading();
		for(int x = 0; x < general.size(); x++) {
			System.out.println(general.get(x));
		}
		
	}//end displayCustomerObjects

}//end class
