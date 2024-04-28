package TestCases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationExample extends BaseTest {
	
	//In Java Annotation means pre-defined rules just we have to use it. @ = ANNOTATION.
	//When we not want to run the case. simply "@Ignore" the case will not run.
	
	
	
	@Test
	public void TestCase1()
	{
		System.out.println("TestCase1");
	}
	
	
	@Test
	public void TestCase2()
	{
		System.out.println("TestCase2");
	}
	
	
	@Test
	public void TestCase3()
	{
		System.out.println("TestCase3");
	}
	
	
	@Before  //Pre-Condition
	public void login()
	{
		System.out.println("login");
	}

	
	@After  //Post-Condition
	public void logout()
	{
		System.out.println("logout");
	}
	/*
	//There is no need to add every time before or after statement in test.
	//If we want to lauch the application before statement.
	//JUnit has Auto-Intelligence that understand the statement or Annotation.
	
	
	@BeforeClass  //Only 1 time Pre-condition
	public static void LauchApp()
	{
		System.out.println("LauchApp");
	}
	//It will run before the start of statement.
	
	
	@AfterClass  //Only 1 time post-condition
	public static void CloseApp()
	{
		System.out.println("CloseApp");
	}
	
	
	//There is no mandatory that all annotation will use.
	//As we required we can use it.
	//There is no edit or delete annotations.
	//We can directly edit or delete in test cases.
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
