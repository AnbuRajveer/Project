package org.xpath;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMakeMyTrip {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement raf = driver.findElement(By.xpath("//p[@class='makeFlex vrtlCenter ']"));
		Actions action = new Actions(driver);
		action.doubleClick(raf).perform();
		
		
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();
		
	
		
		
		
		
		
	}

}
