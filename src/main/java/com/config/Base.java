package com.config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.uitilities.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialisation() throws IOException
	{
		switch(Utilities.getPropertiesFileValue("browser"))
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		default:
			System.out.println("Entered browser not present in config.properties file");
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get(Utilities.getPropertiesFileValue("url"));
		driver.findElement(By.cssSelector("#customButton")).click();
	}

	}


