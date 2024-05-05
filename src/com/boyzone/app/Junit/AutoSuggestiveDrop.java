package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoSuggestiveDrop {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
	
	}
	
	@Test
	public void AutoSuggestiveDroptest() throws InterruptedException {
		
		driver=new InternetExplorerDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		WebElement Source=driver.findElement(By.id("hp-widget__sfrom"));
		WebElement Destination= driver.findElement(By.id("hp-widget__sTo"));
		
		Source.clear();
		Thread.sleep(2000);
		Source.sendKeys("del");
		Thread.sleep(2000);
		Source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Destination.clear();
		Thread.sleep(2000);
		Destination.sendKeys("kol");
		Thread.sleep(2000);
		Destination.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Destination.sendKeys(Keys.ENTER);
	}
		
	@Test
	public void GetAttributetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.linkText("Images"));
		
	System.out.println("Class of Images is "+element.getAttribute("class"));
	System.out.println("href of Imaages is"+element.getAttribute("href"));
	}
	
//
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		driver.quit();
	}

	

}
