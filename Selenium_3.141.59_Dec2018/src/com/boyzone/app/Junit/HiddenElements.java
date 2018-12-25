package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HiddenElements {
	WebDriver driver;
	String baseURL1="https://learn.letskodeit.com/p/practice";
	String baseURL2="https://www.expedia.co.in/";

	@Before
	public void setUp() throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-infobars");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LetsKodeIttest() throws InterruptedException {
		
	driver.get(baseURL1);
	WebElement textBox=driver.findElement(By.id("displayed-text"));
	WebElement hideButton=driver.findElement(By.id("hide-textbox"));
	WebElement showButton=driver.findElement(By.id("show-textbox"));
	
	System.out.println("Text Box Displayed "+textBox.isDisplayed());
	Thread.sleep(3000);
	
	System.out.println("Click on Hide Button");
	hideButton.click();
	System.out.println("Text Box Displayed "+textBox.isDisplayed());
	Thread.sleep(3000);
	//driver.findElement(By.id("displayed-text")).sendKeys("xyz");
	
	System.out.println("Click on Show Button");
	showButton.click();
	System.out.println("Text Box Displayed "+textBox.isDisplayed());
	//driver.findElement(By.id("displayed-text")).sendKeys("xyz");
	
	}
	
	@Test
	public void Expediatest() {
		driver.get(baseURL2);
		WebElement childDrop=driver.findElement(By.id("hotel-1-age-select-1-hp-hotel"));
		System.out.println("Child Dropdown Displayed "+childDrop.isDisplayed());
		childDrop.click(); //Gives Element Not Visible Exception
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
