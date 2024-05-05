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

public class StaticDropdownExample {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	

	@Test
	public void test() throws InterruptedException {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement drop=driver.findElement(By.id("carselect"));
		Select sel=new Select(drop);
		
		//By Value
		sel.selectByValue("benz");
		Thread.sleep(2000);
		
		//By index
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		//by Visible text
		sel.selectByVisibleText("Honda");
		Thread.sleep(2000);
		
		//Print All dropdown values
		List<WebElement> dropValues=sel.getOptions();
		
		//way 1
		/*
		int size=dropValues.size();
		
		for(int i=0;i<size;i++)
		{
			String s1=dropValues.get(i).getText();
			System.out.println(s1);
		}
		
		*/
		
		//way2
		
		for(WebElement options:dropValues)
		{
			String s2=options.getText();
			System.out.println(s2);
		}
		
		
		//Way 2  Mechanisium
		/*
		Iterator it=dropValues.iterator();
		while(it.hasNext())
		{
		String s3=it.next();
		System.out.println(s3);
		}
		*/
	}

	
	@After
	public void tearDown() throws Exception {
	}

}
