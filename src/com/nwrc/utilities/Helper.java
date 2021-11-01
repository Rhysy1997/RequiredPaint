package com.nwrc.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Helper {
	
	private List<String> allRecords;
	
	//Method to read a file into a List of Strings
	public List<String> readFileIntoList(String filePath) 
	{
		//Try catch method which handles input and output errors
		try 
		{
			allRecords = Files.readAllLines(Paths.get(filePath));
		} 
		catch(FileNotFoundException fnfe) 
		{
			System.out.println("File not found exception thrown.");
			fnfe.printStackTrace();
		}
		catch (IOException ioe) 
		{
			System.out.println("Input output exception thrown.");
			ioe.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println("Something else has gone wrong.");
			e.printStackTrace();
		}
	
		return allRecords;
	}
}
