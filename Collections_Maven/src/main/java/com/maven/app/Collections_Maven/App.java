package com.maven.app.Collections_Maven;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void Main()
	{
		CustomList<Integer> list = new CustomList<Integer>();
		int element;
		char chooseToContinue='y';
		int index =1;
		Scanner scan = new Scanner(System.in);
		while(chooseToContinue!='n' || chooseToContinue=='N')
		{
			logger.error("Enter the element "+index+" :");
			element = scan.nextInt();
			list.add(element);
			logger.error("Do you want to enter more items(y/n)");
			chooseToContinue = scan.next().charAt(0);
			index++;        	
		}

		logger.error("Enter an index where you want to delete an item");
		index = scan.nextInt();
		try {
			int key = list.remove(index);
			logger.error("Element "+key+" is removed");
		}catch(IndexOutOfBoundsException e)
		{
			logger.error("List index out of bounds");
		}
		logger.error("The elements of the list are"+list.traverse());
		logger.error("The size of the list is : "+list.size());
	}
	public static void main( String[] args )
	{
		Main();
	}
}
