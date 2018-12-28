package com.boyzone.app.ChromeCapabilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import okio.Options;

public class ChromeCapDemo {
	
	public static void main(String[] args) {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setAcceptInsecureCerts(true);
	
		
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("E:\\Java_Workspace\\amazon extension.crx"));
		options.addExtensions(new File("E:\\Java_Workspace\\buyhatke extension.crx"));
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		
		
		
		options.addArguments("--disable-infobars");
		options.merge(capabilities);
		String abc =options.getVersion();
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://self-signed.badssl.com/");
		System.out.println(abc);
	}

}
