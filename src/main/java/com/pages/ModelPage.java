package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.uitilities.Utilities;

public class ModelPage {

	WebDriver d1;
	public ModelPage(WebDriver driver)
	{
		this.d1=driver;
	}
	
	By modelPageHeading=By.xpath("//span[contains(text(),'a model')]");
	By selectModel=By.xpath("//img[@src='https://vga-images.herokuapp.com/VICCI/image/AW13KX$GPH2PH2$GPJ3PJ3$GPLAPLA$GPU2PU2$GPWGPWG$GZEXZEX/F14%204M4M/right']");
	//By nextButton=By.xpath("//button[@class='btn-primary defaultBlueBtn  mL10px']");
	public boolean verifyModelPageHeading()
	{
		return d1.findElement(modelPageHeading).isDisplayed();
	}
	
	public void selectModel()
	{
		Utilities.explicitWaitVisibilityOfElementLocated(d1, selectModel, 30);
		Utilities.clickWebElement(selectModel, d1);
		
	}
}
