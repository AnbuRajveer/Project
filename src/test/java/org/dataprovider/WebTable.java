package org.dataprovider;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Tables;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tables = table.findElements(By.tagName("tr"));
//		WebElement webElement = tables.get(tables.size()-1);
//		String text = webElement.getText();
//		System.out.println(text);	
		for (int i = 0; i< tables.size(); i++) {
			WebElement TablesRows = tables.get(i);
			String text = TablesRows.getText();
			 
		
		File file = new File("C:\\Users\\Anburaja\\Desktop\\file\\easy.txt");
	
			boolean x = file.createNewFile();
			
			FileUtils.write(file, text, true);
			
			
		}
	}		

	}

