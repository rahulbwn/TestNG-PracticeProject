package com.boyzone.app.Junit;

import com.boyzone.app.genericMethod.GenericMethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateofElement {
	
	WebDriver driver;
	boolean ElementState;
	GenericMethod gm;

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rahul\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		gm=new GenericMethod(driver);
		
	}

	

	@Test
	public void test()  {
		driver.get("https://www.google.com");
		//ElementState=driver.findElement(By.xpath("//input[@title='Search']")).isEnabled();
		ElementState=gm.getElement("//input[@title='Search']", "XPAT").isEnabled();
		System.out.println(ElementState);
	}

	
	@After
	public void tearDown() throws Exception {
	}
}
