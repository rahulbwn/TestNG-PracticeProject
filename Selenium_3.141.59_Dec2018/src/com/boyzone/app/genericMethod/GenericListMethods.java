package test123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericListMethods {
	WebDriver driver;
	List<WebElement> element;
	
	
	public GenericListMethods(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public List<WebElement> getElementList(String locator,String type)
	{
		
		type=type.toLowerCase();
		if(type.equals("id"))
		{
			System.out.println("Element is of type Id");
			 element= this.driver.findElements(By.id(locator));
			
		}
		
		else if(type.equals("xpath"))
		{
			System.out.println("Element is of type xpath");
			 element=driver.findElements(By.xpath(locator));
		
		}
		else if(type.equals("partiallinktext"))
		{
			System.out.println("Element is of type partialLinkText");
			 element=driver.findElements(By.partialLinkText(locator));
		
		}
		else if(type.equals("linktext"))
		{
			System.out.println("Element is of type LinkText");
			 element=driver.findElements(By.linkText(locator));
		
		}
		else
		{
			System.out.println("Invalid locator type");
		}
		
		return element;
		
		
	}

	
}
