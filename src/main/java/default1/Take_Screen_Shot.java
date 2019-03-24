package default1;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Take_Screen_Shot {
	WebDriver driver;
	@Test
	public void take_screen_shot()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:www.bbc.com");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "yahoo");
	}
	@AfterMethod
	public void after_Test_Activity(ITestResult result) throws IOException
	{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			String test_Name=result.getMethod().getMethodName();
			screenshot(test_Name);
			driver.close();
		}
		
	}
	
	public void screenshot(String testName) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		
		 //Call getScreenshotAs method to create image file

        File SrcFile=ts.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

        File DestFile=new File("C:\\Users\\Pranab Roy\\Desktop\\ScreenShots\\"+testName+".png");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
		
	}

}
