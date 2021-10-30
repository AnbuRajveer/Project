package org.xpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTask {
	public static void main(String[] args)  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("Iphone 13"+Keys.ENTER);
	WebElement clkIphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (256GB) - Blue']"));
	clkIphone.click();	
	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		
		if (!windowHandle.equals(string)) {
			driver.switchTo().window(string);
		}
	}
	System.out.println(driver.getTitle());
	WebElement date = driver.findElement(By.xpath("//div[@id='ddmDeliveryMessage']//child::b"));
	String txtDate = date.getText();
	System.out.println(txtDate);
	
	
	
	
	
	
	
	
	
	
	//driver.switchTo().window("Apple iPhone 13 Mini (256GB) - Blue : Amazon.in");
	//System.out.print(driver.hashCode());
//	WebElement txtdate = driver.findElement(By.xpath("//div[@id='ddmDeliveryMessage']//child::b"));
//	String text = txtdate.getText();
//	System.out.println(text);	
//	driver.quit();
	}
}