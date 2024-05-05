package com.boyzone.app.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Ex_P1 {
	
	WebDriver driver;
	String baseURL;
  
  @BeforeClass
  @Parameters ({"browser"})
  public void beforeClass(String browser) {
	  
	    baseURL="https://learn.letskodeit.com/p/practice";
	    
	    if(browser.equalsIgnoreCase("chrome"))
	    {
	    driver=new ChromeDriver();
	    }
	    
	    else if(browser.equalsIgnoreCase("firefox"))
	    {
	    	driver=new FirefoxDriver();
	    }
	    
	    driver.manage().window().maximize();
	  
  }
  
  @Test
  public void TestonChrome() throws InterruptedException {
	  
	  driver.get(baseURL);
	  driver.findElement(By.linkText("Login")).click();
	  
	  WebDriverWait wait=new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
      
      driver.findElement(By.id("user_email")).sendKeys("test@test.com");
      Thread.sleep(3000);
      driver.findElement(By.id("user_password")).sendKeys("Pass");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@value='Log In']")).click();
  }

  @AfterClass
  public void afterClass() {
  }

}
