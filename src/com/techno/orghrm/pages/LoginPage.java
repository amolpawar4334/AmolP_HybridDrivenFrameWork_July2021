package com.techno.orghrm.pages;

import org.openqa.selenium.By;

import com.techno.orghrm.base.PredefineAction;

public class LoginPage extends PredefineAction {
	public boolean isLogoDisplayed() {

		boolean isLogoDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		return isLogoDisplayed;
	}

	public void enterCredentials(String username, String password) {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}

	public void clickOnLoginButton() {

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	public String getErrorMessage()
	{
		String errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		return errorMessage;
	}
	
}
