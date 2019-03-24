package default1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_Browser {
	WebDriver driver;
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:www.bbc.com");
	}

}
