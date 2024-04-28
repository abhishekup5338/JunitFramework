package TestCases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AssertionExample {
	
	//Assertion = VALIDATION that we want to check in application.
	//OLD TEST CASE THAT WE WRITE.
	/*
	@Test //old example
	public void testcase4()
	{
		String ExpTitle = "vTigerCRM";
		String ActTitle = "vTigerCRM";
		
		if(ExpTitle.equals(ActTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	*/
	//In this there is no need to mention IF ELSE condition.
	
	@Test 
	public void testcase5()
	{
		String ExpTitle = "vTigerCRM";
		String ActTitle = "vTigerCRM12";
		
		assertEquals(ExpTitle, ActTitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
