package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.uitilities.Utilities;

public class PostcodePage {

	WebDriver d1;
	
	public PostcodePage(WebDriver driver)
	{
		this.d1=driver;
	}
	
	By postcodePageHeading=By.xpath("//label[contains(text(),'Enter a postcode to find your closest dealer*')]");
	
	public boolean verifyPostcodePageHeading()
	{
		return d1.findElement(postcodePageHeading).isDisplayed();
	}
	
	//enter the postcode
	By enterPostcode=By.id("localitySearch");
	public void enterPostcode()
	{
//		JavascriptExecutor js=(JavascriptExecutor)d1;
//		js.executeScript("arguments[0].value=arguments[1]",d1.findElement(enterPostcode),"2000");
		//Utilities.clickWebElement(enterPostcode, d1);
		d1.findElement(enterPostcode).sendKeys("2000");
	}
	
	
	//select location
	By selectLocation=By.xpath("//li[contains(text(),'HAYMARKET NSW 2000')]");
	public void selectLocation()
	{
		Utilities.explicitWaitVisibilityOfElementLocated(d1, selectLocation, 30);
		Utilities.clickWebElement(selectLocation, d1);
	}
	
	//select dealer
	By selectDealer=By.xpath("//label[contains(text(),'Leichhardt Volkswagen')] ");
	By postcodeNextButton=By.xpath("(//button[text()='Next'])[2]");
	public void selectDealer()
	{
		Utilities.explicitWaitVisibilityOfElementLocated(d1, selectDealer, 30);
		Utilities.clickWebElement(selectDealer, d1);
		Utilities.clickWebElement(postcodeNextButton, d1);
	}
	
}
