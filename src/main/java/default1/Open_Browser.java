package default1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Open_Browser {
	WebDriver driver;
	@Test
	public void verify_Page_Title()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:www.bbc.com");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "BBC - Homepage");
	
	}

}
