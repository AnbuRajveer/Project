package org.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathGreens {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Oracle Training ']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Oracle SQL Training']"))).perform();
		List<WebElement> findElements = driver.findElements(By.xpath("//a[text()='Oracle Training ']//following-sibling::ul"));
		
		
		for (int i =0; i <findElements.size() ; i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//a[@href='http://www.greenstechnologys.com/oracle-training.html']//preceding::ul[@class='sub-menu']
		
		
		
		
		
		
		
		
		
		
		
		// action.moveToElement(driver.findElement(By.xpath("//a[text()='Oracle SQL
		// Training']"))).perform();;

//		List<WebElement> ancestor = driver
//				.findElements(By.xpath("//span[text()='Oracle Training ']//ancestor::ul[@class='sub-menu']"));
//		for (int i = 0; i < ancestor.size(); i++) {
//			WebElement element = ancestor.get(i);
//			System.out.println(element.getText());
//
//		}
//
//		driver.quit();
	}

}
