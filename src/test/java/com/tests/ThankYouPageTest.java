package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThankYouPageTest extends BaseTest{

	@Test
	public void verifyThankYouPageLoadingTest() throws InterruptedException
	{
		home.selectStockAvailability();
		home.selectVehicle();
		//Thread.sleep(3000);
		model.selectModel();
		//Thread.sleep(3000);
		home.homeNextButton();
		//Thread.sleep(3000);
		postcode.enterPostcode();
		//Thread.sleep(3000);
		postcode.selectLocation();
		//Thread.sleep(3000);
		postcode.selectDealer();
		//Thread.sleep(3000);
		contact.enterContactDetails();
		Thread.sleep(2000);
		String data=thanks.verifyThankYouPageHeading();
		System.out.println("The data is "+data);
		Assert.assertEquals(data, "Can we help you with anything else?");
		System.out.println("Verified thank you page");
		
		
	}
	
}
