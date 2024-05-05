package TestN;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Constants;
import base.ExcelUtility;
import base.Screenshots;


public class UsingExcel {
	private WebDriver driver;
	Screenshots sc=new Screenshots();

	@BeforeClass
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		driver.findElement(By.xpath("//span[text()='Learn Now']")).click();
		
		// Click login button
				driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Login')]")).click();
		// Tell the code about the location of Excel file
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "LoginTests");
	}
	
	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}

	@Test(dataProvider="loginData")
	public void testUsingExcel(String username, String password) throws Exception {
		
		Thread.sleep(2000);
		// Enter username
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys(username);
		// Enter password
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys(password);
		// Click Login button
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		
		// Find if error messages exist
		boolean result = driver.findElements(By.xpath("//form[@id='new_user']//div[3]")).size() != 0;
		
		Assert.assertTrue(result);
		sc.getScreenshot(driver);
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
	    //driver.quit();
	}
}
