package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	public static String getRandomString(int length)
	{
		String Characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<length;i++)
		{
		int index= (int) (Math.random() * Characters.length());
		sb.append(Characters.charAt(index));
		}
		
		return sb.toString();
	}
	
	public  void getScreenshot(WebDriver driver) throws IOException
	{
		//String filename=TimeUnit.MILLISECONDS +".png";

		String filename=getRandomString(10)+".png";
		String dir="D:\\New folder\\New folder\\";
		
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(dir+filename));
	}

}
