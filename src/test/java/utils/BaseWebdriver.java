package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseWebdriver {
	
	public WebDriver driver = new ChromeDriver();
	
	public WebDriver WebDriverManager() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://tokopedia.com/");
		return driver;
	}
	
}
