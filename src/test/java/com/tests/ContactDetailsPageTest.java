package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDetailsPageTest extends BaseTest{

	@Test
	public void ContactDetailsPageLoadingTest() throws InterruptedException
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
		Thread.sleep(3000);
		boolean data=contact.verifyContactDetailsPageHeading();
		Assert.assertEquals(data, true);
		System.out.println("verified contacts page");
	}
}
