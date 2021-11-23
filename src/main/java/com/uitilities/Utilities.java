package com.uitilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public static String getPropertiesFileValue(String propertyName) throws IOException {
		String propertyValue;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		propertyValue = prop.getProperty(propertyName);
		return propertyValue;
		
		
	}
	
	public static void clickWebElement(By locator, WebDriver driver)
	{
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(locator));

	}
	
	public static void explicitWaitVisibilityOfElementLocated(WebDriver driver, By element, int timeOut) {

		WebDriverWait wait =new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
}
