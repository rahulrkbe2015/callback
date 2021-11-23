package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {

	WebDriver d1;
	public ThankYouPage(WebDriver driver)
	{
		this.d1=driver;
	}
	
	By thankYouPageHeading=By.xpath("//div[@class='vga-oh-sdk-testdrive-confirmation-carousel-head']");
	
	public String verifyThankYouPageHeading()
	{
		return d1.findElement(thankYouPageHeading).getText();
		
	}
	
}
