package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSyntax {

	@Test(dataProvider= "Data")
	private void facebookLogin(String email, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement clkLogin = driver.findElement(By.name("login"));
		clkLogin.click();
		driver.quit();
	}
	@DataProvider(name = "Data", parallel= false)
		private Object[][] data() {
		Object[][] obj = new Object[][] {{"anbu","12345"},{"aadhi","4561"},
			{"dhoni","07"}};
			return obj;
		
		
	
}
	}