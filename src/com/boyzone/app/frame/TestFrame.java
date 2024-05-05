package com.boyzone.app.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestFrame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Java_Workspace\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
	}
	
	

}
