package com.techno.orghrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.techno.orghrm.base.PredefineAction;

public class ProfilePage extends PredefineAction {
	public void clickOnUserProfile() {
		driver.findElement(By.xpath("//a[@id='user-dropdown']")).click();
	}

	public List<String> getDropDownList() {
		/*List<WebElement> list = driver.findElements(By.xpath("//ul[@id='user_menu']/li"));
		List<String> dropDownList = new ArrayList<String>();
		for (WebElement l : list) {
			String n = l.getText();
			dropDownList.add(n);
		}
		return dropDownList;*/
		return getTextOfAllElement("//ul[@id='user_menu']/li");
	}

	public int getTotalList() {
		int toatlList = getDropDownList().size();
		return toatlList;
	}
	
	public void clickOnSubMenu(String menu)
	{
		driver.findElement(By.xpath("//a[text()='"+menu+"']")).click();
	}
}
