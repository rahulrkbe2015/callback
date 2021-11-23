package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.uitilities.Utilities;


public class HomePage {
	
	WebDriver d1;
	public HomePage(WebDriver driver) {
		//Base.driver=driver;
		this.d1=driver;
	}

	By homePageHeading=By.xpath("//h1[@class='vga-oh-savn-TD1OuterMainHead']");
	By selectStockAvailability=By.xpath("//span[@class='checkmark']");
	By selectVehicle=By.xpath("//img[@src='https://one-hub-assets.s3-ap-southeast-2.amazonaws.com/one-hub-dealer-callback/img/car-dummy-dark_slt.png']");
	By homeNextButton=By.xpath("//button[@class='btn-primary defaultBlueBtn  mL10px']");
	
	public boolean verifyHomePageHeading()
	{
		//return Base.driver.findElement(homePageHeading).isDisplayed();
		return d1.findElement(homePageHeading).isDisplayed();
	}
	
	public void selectStockAvailability() throws InterruptedException
	{
		//Base.driver.findElement(selectStockAvailability).click();
		d1.findElement(selectStockAvailability).click();
		Thread.sleep(1000);
	}
	
	public void selectVehicle() throws InterruptedException
	{
		//Base.driver.findElement(selectVehicle).click();
		Utilities.explicitWaitVisibilityOfElementLocated(d1, selectVehicle, 30);
		Utilities.clickWebElement(selectVehicle, d1);
		//Thread.sleep(3000);
	}
	
	public void homeNextButton()
	{
		Utilities.clickWebElement(homeNextButton, d1);
	}
	
}
