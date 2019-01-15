package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitType {
   WebDriver driver;
   WebElement element;

	public WaitType(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement waitforElement(By locator, int timeout)
	{
		try
		{
		System.out.println("Element will be waited for Max: "+timeout+" seconds to become available");
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		System.out.println("Element is now visible for usuage");
		}
		catch(Exception e)
		{
			System.out.println("Element is not available for usage");
		}
		return element;
	}
	
	public void WaitAndClick(By locator, int timeout)
	{
		try
		{
		System.out.println("Element will be waited for Max: "+timeout+" seconds to become clickable");
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		System.out.println("Element is available to Click");
		element.click();
		}
		catch(Exception e)
		{
			System.out.println("Element is not available to Click");
		}
	}
	
}
