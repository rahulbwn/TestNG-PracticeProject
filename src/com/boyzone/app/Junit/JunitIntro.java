package com.boyzone.app.Junit;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitIntro {
	
	@BeforeClass
	
	public static void setUpBeforeClass()
	{
		System.out.println("Before 1st test method");
	}
	
	@AfterClass
	
	public static void tearDownAfterClass()
	{
		System.out.println("After last test method");
		
	}
	
	@Before
	public void setUp()
	{
		System.out.println("Before each test method");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After Each test method");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}
	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}
}
