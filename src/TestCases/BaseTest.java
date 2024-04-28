package TestCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

	
	//If we want to use this everytime we have to create the class.
	//simply use extends keyword.
	//Whether we want to launch this class we can use it.
	//This is re-useable class. 
	
	
	@BeforeClass  //Only 1 time Pre-condition. Static class
	public static void LauchApp()
	{
		System.out.println("LauchApp");
	}
	//It will run before the start of statement.
	
	
	@AfterClass  //Only 1 time post-condition. static class
	public static void CloseApp()
	{
		System.out.println("CloseApp");
	}
	
	
	
}
