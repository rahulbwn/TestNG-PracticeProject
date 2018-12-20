package com.boyzone.app.ChromeCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeCapDemo {
	
	public static void main(String[] args) {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-gpu");
		options.addArguments("--headless");
		
		options.addArguments("--disable-infobars");
		options.merge(capabilities);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://self-signed.badssl.com/");
	}

}
