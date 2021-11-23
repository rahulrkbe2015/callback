package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.uitilities.Utilities;

public class ContactDetailsPage {

	WebDriver d1;
	public ContactDetailsPage(WebDriver driver)
	{
		this.d1=driver;
	}
	
	By contactDetailsPageHeading=By.xpath("//p[contains(text(),'Finally, just fill in your details and you will receive a call, email or text very shortly. ')]");
	By firstName=By.id("fName");
	By lastName=By.id("lName");
	By emailAddress=By.id("emailAdd");
	By phoneNumber=By.xpath("//input[@placeholder='e.g 0431 152 784']");
	By emailCheckbox=By.id("customCheck6");
	By subscribeCheckbox=By.id("customCheck9");
	//By contactPageNextButton=By.xpath("//*[@id=\"stepperForm\"]/div[1]/section[4]/div/section/div/div/div[3]/div[2]/div/div/button[2]");
	
	By contactPageNextButton=By.xpath("(//button[text()='Next'])[3]");
	public boolean verifyContactDetailsPageHeading()
	{
		return d1.findElement(contactDetailsPageHeading).isDisplayed();
	}
	
	//Form Details
	public void enterContactDetails() throws InterruptedException
	{
		d1.findElement(firstName).sendKeys("Shaw");
		d1.findElement(lastName).sendKeys("Marsh");
		d1.findElement(emailAddress).sendKeys("shaw.marsh@gmail.com");
		Thread.sleep(2000);
		d1.findElement(phoneNumber).sendKeys("7056294472");
		Thread.sleep(2000);
		Utilities.clickWebElement(emailCheckbox, d1);
		Utilities.clickWebElement(subscribeCheckbox, d1);
		((JavascriptExecutor) d1).executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		d1.findElement(contactPageNextButton).click();
	}
	

}
