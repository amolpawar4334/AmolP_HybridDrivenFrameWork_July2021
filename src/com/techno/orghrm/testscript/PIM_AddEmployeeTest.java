package com.techno.orghrm.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techno.orghrm.pages.MenuPage;
import com.techno.orghrm.pages.PIM_AddEmployeePage;

public class PIM_AddEmployeeTest extends TestBase {
	MenuPage manupage=new MenuPage();
	PIM_AddEmployeePage addemployeePage=new  PIM_AddEmployeePage();
	@BeforeMethod
	public void setUp()
	{
		super.setup();
	}
	@Test()
	public void VerifyAddEmployeeTest() 
	{
		
		manupage.clickOnPIMMenu();
		manupage.clickOnAddEmployee();
		
		addemployeePage.setEmpFirstName("Amol")
		.setEmpMidName("M")
		.setEmpLastName("Pawar")
		.setLocation("Canadian Regional HQ")
		.clickOnNext()
		.setHobbies("Cricket")
		.clickOnNext()
		.setWorkShift("Twilight")
		.setEffectiveFrom("12")
		.setRegion("Region-1");
		
		
	}
	@AfterMethod
	public void teardown()
	{
		super.tearDown();
	}
}
