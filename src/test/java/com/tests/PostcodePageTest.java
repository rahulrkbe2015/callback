package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PostcodePageTest extends BaseTest {

	@Test
	public void verifyPostcodePageLoadingTest() throws InterruptedException
	{
		home.selectStockAvailability();
		home.selectVehicle();
		//Thread.sleep(3000);
		model.selectModel();
		//Thread.sleep(3000);
		home.homeNextButton();
		//Thread.sleep(3000);
		boolean data=postcode.verifyPostcodePageHeading();
		Assert.assertEquals(data, true);
		postcode.enterPostcode();
		//Thread.sleep(3000);
		postcode.selectLocation();
		//Thread.sleep(3000);
		postcode.selectDealer();
		Thread.sleep(3000);
		System.out.println("verified postcode page");
	}
}
