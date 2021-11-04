package com.techno.orghrm.testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.techno.orghrm.base.PredefineAction;
import com.techno.orghrm.pages.DashBoardPage;
import com.techno.orghrm.pages.LoginPage;

public class TestBase {
	
	public void setup() {
		System.out.println("Launch Orange HRM");
		PredefineAction.start();
		LoginPage loginPage = new LoginPage();

		System.out.println("Enter UserName and Password");
		loginPage.enterCredentials("Admin", "P@lFg1CAm6");

		System.out.println("Click on submit button");
		loginPage.clickOnLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void tearDown()
	{
		PredefineAction.closeBrowser();
	}
}
