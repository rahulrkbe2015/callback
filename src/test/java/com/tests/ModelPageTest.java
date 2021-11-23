package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModelPageTest extends BaseTest{

	@Test
	public void verifyModelPageLoadingTest() throws InterruptedException
	{
		home.selectStockAvailability();
		home.selectVehicle();
		Thread.sleep(3000);
		boolean data=model.verifyModelPageHeading();
		Assert.assertEquals(data, true);
		System.out.println("verified the model page");
	}
}
