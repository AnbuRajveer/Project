package org.dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	
	
	@Parameters({"browser"})
	@Test
	private void facebookLogin(String browser) {
		
		if (browser.equals("chrome")) {
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.quit();
		}else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
			
			driver.quit();
			
		}
	
	
}
}