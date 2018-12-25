package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import java.awt.Dimension;
import java.awt.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class RadioCheckbox {
	
	WebDriver driver;
	boolean IsChecked;

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\\\Rahul\\eclipse-workspace\\chromedriver_win32\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		// Clicked on Radio & checkboxes one by one
		driver.get("https://learn.letskodeit.com/p/practice");
		
		/*
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("bmwcheck")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("benzcheck")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hondacheck")).click();
		
		// check their State
		
		System.out.println("BMW Radio button is Selected? "+driver.findElement(By.id("bmwradio")).isSelected());
		System.out.println("BMW Check box is Selected? "+driver.findElement(By.id("bmwcheck")).isSelected());
		
		*/
		
		//Alternate Way
		
		//List of all the radio buttons
		
		java.util.List<WebElement> btns= driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		int sizee=btns.size();
		System.out.println("No. of webElements are: "+sizee);
		
		for(int i=0;i<sizee;i++)
		{
			IsChecked=btns.get(i).isSelected();
			if(!IsChecked)
			{
				btns.get(i).click();
			}
		}
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
