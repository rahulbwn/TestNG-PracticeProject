package com.boyzone.app.genericMethod;

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
			System.out.println("Element id is having locator: "+locator);
			element= this.driver.findElement(By.id(locator));
		}
		
		else if(type.equals("xpath"))
		{
			System.out.println("Element xpath is having locator: "+locator);
			element= this.driver.findElement(By.xpath(locator));
		}
		
		else if(type.equals("cssselector"))
		{
			System.out.println("Element cssselector is having locator: "+locator);
			element= this.driver.findElement(By.cssSelector(locator));
		}
		
		else if(type.equals("linktext"))
		{
			System.out.println("Element linktext is having locator: "+locator);
			element= this.driver.findElement(By.linkText(locator));
		}
		
		else if(type.equals("partiallinktext"))
		{
			System.out.println("Element partiallinktext is having locator: "+locator);
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
			System.out.println("Element id is having locator: "+locator);
			element= this.driver.findElements(By.id(locator));
		}
		
		else if(type.equals("xpath"))
		{
			System.out.println("Element xpath is having locator: "+locator);
			element= this.driver.findElements(By.xpath(locator));
		}
		
		else if(type.equals("cssselector"))
		{
			System.out.println("Element cssselector is having locator: "+locator);
			element= this.driver.findElements(By.cssSelector(locator));
		}
		
		else if(type.equals("linktext"))
		{
			System.out.println("Element linktext is having locator: "+locator);
			element= this.driver.findElements(By.linkText(locator));
		}
		
		else if(type.equals("partiallinktext"))
		{
			System.out.println("Element partiallinktext is having locator: "+locator);
			element= this.driver.findElements(By.partialLinkText(locator));
		}
		
		else
		{
			System.out.println("Locator Type not Supported: "+type+" Locator: "+locator);
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
