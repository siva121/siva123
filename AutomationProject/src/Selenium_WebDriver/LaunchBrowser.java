package Selenium_WebDriver;

import org.jboss.netty.channel.StaticChannelPipeline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Verify;
import com.google.common.base.VerifyException;

public class LaunchBrowser {
	public static WebDriver driver;
	
	
	
	public static void openURL(){
		driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("7095457078");
		driver.findElement(By.id("password")).sendKeys("password037");
		driver.findElement(By.id("pass")).sendKeys("enter");
	}
	public static void main(String[] args) {
		//open browser flipcart url
		openURL();
		

	
	}

}
