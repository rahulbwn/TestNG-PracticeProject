package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectdropdown {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement Multiselect=driver.findElement(By.id("multiple-select-example"));
		Select sel=new Select(Multiselect);
		
		// Select Apple by index
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		//Unselect it	
	sel.deselectByVisibleText("Apple");
	Thread.sleep(2000);
	
	// select by value
	sel.selectByValue("orange");
	Thread.sleep(2000);
	
	//select by visible name
	sel.selectByVisibleText("Peach");
	Thread.sleep(2000);
	
	// Print all selected values
	List<WebElement> selList=sel.getAllSelectedOptions();
	
	/*
	int size=selList.size();
	
	for(int i=0;i<size;i++)
	{
		System.out.println(selList.get(i).getText());
	}   
	*/
	
	//Alternate way
	
	for(WebElement options:selList)
	{
		System.out.println(options.getText());
	}
	
	// Deselect All
	sel.deselectAll();
	
	//Is dropdown is  MULTIPLE choice or not
	System.out.println(sel.isMultiple());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
