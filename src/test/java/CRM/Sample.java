package CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Sample {

	@Test
	public void ni()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
