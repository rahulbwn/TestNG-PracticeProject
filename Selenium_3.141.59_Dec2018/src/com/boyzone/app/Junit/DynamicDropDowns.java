package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.spicejet.com/");
		//Selected Source
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
	/*	driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//Select Destination (Handled Dynamic Dropdown)
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();*/
		
		//Alternate Way (Best Way)
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		// Select Destination
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
