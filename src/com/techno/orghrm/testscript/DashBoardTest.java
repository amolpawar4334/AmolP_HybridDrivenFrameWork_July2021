package com.techno.orghrm.testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.techno.orghrm.base.PredefineAction;
import com.techno.orghrm.pages.DashBoardPage;
import com.techno.orghrm.pages.LoginPage;



public class DashBoardTest  extends TestBase {
	@BeforeClass
	public void setUp()
	{
		super.setup();
		
	}
	@Test()
	public void  verifyWidgetsTest()
	{
		LoginPage loginPage=new LoginPage();
		DashBoardPage dashBoardPage=new DashBoardPage();
		 SoftAssert softAssert=new SoftAssert();
		 
		
		
		//System.out.println("Enter UserName and Password");
		//loginPage.enterCredentials("Admin", "P@lFg1CAm6");
		
		//System.out.println("Click on submit button");
		//loginPage.clickOnLoginButton();
		
		System.out.println(" Verify DashBoard Title should display");
		String ExpectedDashBoardTitle="Dashboard";
		String actualTitle= dashBoardPage.getDashBoardTitle();
		softAssert.assertEquals(actualTitle, ExpectedDashBoardTitle);
		
		
		int totalwidget=dashBoardPage.getTotalWidgets();
		int expectedwidget=12;
		softAssert.assertEquals(totalwidget, expectedwidget);
		
		/*List <WebElement> ActualWedgitsElement=driver.findElements(By.xpath("//div[@class='widget-header']/span[2]"));*/
		List<String > Wedgits=dashBoardPage.getAllWidgets();
		
		
		String expectedWedgits="Quick Access";
		softAssert.assertTrue(Wedgits.contains(expectedWedgits));
		softAssert.assertAll();
		
	}
	public void tearDown()
	{
		super.tearDown();
	}

}
