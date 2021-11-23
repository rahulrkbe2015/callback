package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

	@Test
	public void homePageLoadingTest()
	{
		boolean data=home.verifyHomePageHeading();
		Assert.assertEquals(data, true);
		System.out.println("verified the home page");
	}
	
//	@Test
//	public void selectStockAvailabilityTest() throws InterruptedException
//	{
//		home.selectStockAvailability();
//	}
}
