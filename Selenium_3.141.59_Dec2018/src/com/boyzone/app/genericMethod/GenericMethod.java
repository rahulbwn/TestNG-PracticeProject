package com.boyzone.app.genericMethod;

package GenericMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethod {
	 WebDriver driver;
	
	public GenericMethod(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getElement(String locator, String type) 
	{
		WebElement element=null;
		type=type.toLowerCase();
		
		if(type.equals("id"))
		{
			System.out.println("Element found with ID: "+locator);
			element= this.driver.findElement(By.id(locator));
		}
		
		else if(type.equals("xpath"))
		{
			System.out.println("Element found with xpath: "+locator);
			element= this.driver.findElement(By.xpath(locator));
		}
		
		else if(type.equals("cssselector"))
		{
			System.out.println("Element found with cssselector: "+locator);
			element= this.driver.findElement(By.cssSelector(locator));
		}
		
		else if(type.equals("linktext"))
		{
			System.out.println("Element found with linktext: "+locator);
			element= this.driver.findElement(By.linkText(locator));
		}
		
		else if(type.equals("partiallinktext"))
		{
			System.out.println("Element found with partiallinktext: "+locator);
			element= this.driver.findElement(By.partialLinkText(locator));
		}
		
		else
		{
			System.out.println("Locator Type not Supported: "+type+" Locator: "+locator);
		}
		
		return element;
		
	}
	
	public List<WebElement> getElementList(String locator,String type)
	{
		List<WebElement> element=new ArrayList<WebElement>();
		type=type.toLowerCase();
		if(type.equals("id"))
		{
			
			element= this.driver.findElements(By.id(locator));
		}
		
		else if(type.equals("xpath"))
		{
			
			element= this.driver.findElements(By.xpath(locator));
		}
		
		else if(type.equals("cssselector"))
		{
			
			element= this.driver.findElements(By.cssSelector(locator));
		}
		
		else if(type.equals("linktext"))
		{
			
			element= this.driver.findElements(By.linkText(locator));
		}
		
		else if(type.equals("partiallinktext"))
		{
		
			element= this.driver.findElements(By.partialLinkText(locator));
		}
		
		else
		{
			System.out.println("Locator Type not Supported: "+type+" Locator: "+locator);
		}
		if(element.isEmpty())
		{
			System.out.println("Element not found with "+type+" :"+locator);
		}
		else
		{
			System.out.println("Element found with "+type+" :"+locator);
		}
		
		return element;
		
	}

	public boolean isElementPresent(String locator, String type)
	{
		List<WebElement> eleList=getElementList(locator, type);
				int size=eleList.size();
				if(size>0)
					return true;
				else
					return false;
	}
}
