package com.boyzone.app.Junit;

import com.boyzone.app.genericMethod.GenericMethod;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateofElement {
	
	WebDriver driver;
	boolean ElementState;
	boolean ElePresent;
	GenericMethod gm;

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul\\workspace\\chromedriver_new\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rahul\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		gm=new GenericMethod(driver);
		
	}

	

	@Test
	public void test()  {
		driver.get("https://www.google.com");
		//ElementState=driver.findElement(By.xpath("//input[@title='Search']")).isEnabled();
		ElementState=gm.getElement("//input[@title='Search']", "XPATH").isEnabled();
		System.out.println("Is Element Enabled? "+ElementState);
		
		System.out.println("------------------------------------------------------------");
		
		List<WebElement> ListEle=gm.getElementList("//input[@type='submit']", "Xpath");
		for(WebElement opt:ListEle)
		{
			System.out.println(opt.getText());
		}
		
		System.out.println("------------------------------------------------------------");
		
		//When correct attribute value is passed
		ElePresent=gm.isElementPresent("//input[@type='submit']", "Xpath");
		System.out.println("Is Element Present? "+ElePresent);	
		
		//When Incorrect attribute value is passed
				ElePresent=gm.isElementPresent("//input[@type='submit-text']", "Xpath");
				System.out.println("Is Element Present? "+ElePresent);	
	}

	
	@After
	public void tearDown() throws Exception {
	}
}
