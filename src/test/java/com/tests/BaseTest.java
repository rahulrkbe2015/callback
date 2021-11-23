package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.config.Base;
import com.pages.ContactDetailsPage;
import com.pages.HomePage;
import com.pages.ModelPage;
import com.pages.PostcodePage;
import com.pages.ThankYouPage;

public class BaseTest extends Base{

	HomePage home;
	ModelPage model;
	PostcodePage postcode;
	ContactDetailsPage contact;
	ThankYouPage thanks;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialisation();
		home=new HomePage(driver);
		model=new ModelPage(driver);
		postcode=new PostcodePage(driver);
		contact=new ContactDetailsPage(driver);
		thanks=new ThankYouPage(driver);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
