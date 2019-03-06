package com.boyzone.app.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_demo {
	
	WebDriver driver;
	String baseURL="https://learn.letskodeit.com/";
	ExtentReports report;
	ExtentTest test;
  
  @BeforeClass
  public void beforeClass() {
	  report=new ExtentReports("D:\\New folder\\New folder\\login_test.html");
	  test=report.startTest("Welcome DashBoard");
	  test.log(LogStatus.INFO, "Opening the Chrome Browser");
	  driver=new ChromeDriver();
	  test.log(LogStatus.INFO, "Maximizing the Chrome Browser");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  
  @Test
  public void ExtentReportDemo() throws InterruptedException {
	 
		  driver.get(baseURL);
	  test.log(LogStatus.INFO, "Opening the webSite");
	  WebElement loginLink=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	  test.log(LogStatus.INFO, "Clicking on Login Link");
	  loginLink.click();
	  Thread.sleep(3000);
	  
	  
	  WebElement enterEmail=driver.findElement(By.id("user_email"));
	 
	  WebElement enterPassword=driver.findElement(By.id("user_password"));
	  
	  WebElement loginButton=driver.findElement(By.xpath("//input[@name='commit']"));
	  
	  test.log(LogStatus.INFO, "Enter Email Id");
	  enterEmail.sendKeys("test@email.com");
	  test.log(LogStatus.INFO, "Enter Password");
	  enterPassword.sendKeys("abcabc");
	  test.log(LogStatus.INFO, "Clicking on Login Button");
	  loginButton.click();
	  
	  Thread.sleep(3000);
	  WebElement dashBoardText=null;
	  
	  try{
	  dashBoardText=driver.findElement(By.xpath("//a[contains(text(),'My Courses')]"));
	  }
	  
	  catch (NoSuchElementException e)
	  {
		  System.out.println(e.getMessage());
	  }
	  
	  Assert.assertTrue(dashBoardText != null);
	  test.log(LogStatus.PASS, "Verified Welcome Text, Login SuccessFul");

	  
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
	  report.endTest(test);
	  report.flush();
	  
  }

}
