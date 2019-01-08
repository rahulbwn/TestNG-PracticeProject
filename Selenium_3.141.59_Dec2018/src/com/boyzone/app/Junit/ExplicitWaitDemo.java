package com.boyzone.app.Junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.boyzone.app.genericMethod.GenericMethod;

public class ExplicitWaitDemo {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/");
		
	}

	@Test
	public void test() {
	driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 15);
	WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
	email.sendKeys("test");
	//driver.findElement(By.id("user_email")).sendKeys("test");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		
	}
}
