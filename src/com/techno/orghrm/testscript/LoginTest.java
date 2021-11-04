package com.techno.orghrm.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.techno.orghrm.base.PredefineAction;
import com.techno.orghrm.pages.DashBoardPage;
import com.techno.orghrm.pages.LoginPage;

public class LoginTest 
{
	LoginPage loginPage=new LoginPage();
	DashBoardPage dashBoardPage=new DashBoardPage();
	 SoftAssert softAssert=new SoftAssert();
	@BeforeMethod()
	public void setUp()
	{
		System.out.println("Launch Orange HRM");
		 PredefineAction.start();
		
	}
	@Test()
	public void loginTest()
	{
		System.out.println("Verify Logo diplayed on login page");
		boolean isPanelDisplayed=loginPage.isLogoDisplayed();
		softAssert.assertTrue(isPanelDisplayed,"Panel is not Displayed on Login page");
		
		System.out.println("Enter UserName and Password");
		loginPage.enterCredentials("Admin", "P@lFg1CAm6");
		
		System.out.println("Click on submit button");
		loginPage.clickOnLoginButton();
	}
	@Test()
	public void loginTestWithoutPassword()
	{
		loginPage.enterCredentials("Admin", "");
		loginPage.clickOnLoginButton();
		String errorMessage= loginPage.getErrorMessage();
		String expectedError="Password cannot be empty";
		softAssert.assertEquals(errorMessage, expectedError);
	}
	
	@Test()
	public void loginTestWithoutUsername()
	{
		loginPage.enterCredentials("", "dgd");
		loginPage.clickOnLoginButton();
		String errorMessage= loginPage.getErrorMessage();
		String expectedError="Username cannot be empty";
		softAssert.assertEquals(errorMessage, expectedError);
	}
	@AfterMethod
	public void tearDown()
	{
		PredefineAction.closeBrowser();
	}
}
