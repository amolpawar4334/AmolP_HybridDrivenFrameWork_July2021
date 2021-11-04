package com.techno.orghrm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.techno.orghrm.base.PredefineAction;

public class MenuPage extends PredefineAction{
	public void clickOnPIMMenu()
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']")).click();
	}
	public void clickOnAddEmployee()
	{
		driver.findElement(By.xpath("//a/span[text()='Add Employee']")).click();
	}

}
