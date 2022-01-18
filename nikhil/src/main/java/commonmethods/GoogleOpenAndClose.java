package commonmethods;
import org.openqa.selenium.*;

import java.sql.Driver;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpenAndClose {
	
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\nikhil\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	public void launchURL(String url) {
		driver.get(url);
		
	}
	public void closeBrowser() {
		driver.close();
		
	}
	
	
}
