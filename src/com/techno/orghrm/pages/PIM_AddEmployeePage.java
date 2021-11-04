package com.techno.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techno.orghrm.base.PredefineAction;

public class PIM_AddEmployeePage extends PredefineAction {

	public PIM_AddEmployeePage setEmpFirstName(String fName) {
		driver.findElement(By.xpath("//input[@id='first-name-box']")).sendKeys(fName);
		return this;
	}

	public PIM_AddEmployeePage setEmpMidName(String mName) {
		driver.findElement(By.xpath("//input[@id='middle-name-box']")).sendKeys(mName);
		return this;
	}

	public PIM_AddEmployeePage setEmpLastName(String lName) {
		driver.findElement(By.xpath("//input[@id='last-name-box']")).sendKeys(lName);
		return this;
	}

	public PIM_AddEmployeePage setLocation(String location) {
		driver.findElement(By.xpath("//button[@data-id='location']")).click();
		driver.findElement(By.xpath("//span[text()='" + location + "']//parent::a")).click();
		return this;
	}

	public PIM_AddEmployeePage clickOnNext() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return this;
	}

	public PIM_AddEmployeePage addEmployeeInfo(String fName, String mName, String lName, String location) {
		setEmpFirstName(fName);
		setEmpLastName(lName);
		setEmpMidName(mName);
		setLocation(location);

		return this;
	}

	public PIM_AddEmployeePage setHobbies(String hobby)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30); // 500 ms
		
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='5']")));
	
		e.sendKeys(hobby);
		return this;
	}
	public PIM_AddEmployeePage clickOnPersonalDetailNextButton() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return this;
	}

	public PIM_AddEmployeePage setWorkShift(String shiftValue) {
		try {
			driver.findElement(By
					.xpath("//div[@id='work_shift_id_inputfileddiv']//span[@class='caret']//following-sibling::input"))
					.click();
		} catch (StaleElementReferenceException staleException) {
			driver.findElement(By
					.xpath("//div[@id='work_shift_id_inputfileddiv']//span[@class='caret']//following-sibling::input"))
					.click();
		}

		WebDriverWait wait = new WebDriverWait(driver, 30); // 500 ms
		// wait.until(ExpectedConditions.visibilityOf(e));
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//ul[contains(@class,'dropdown-content select-dropdown')]//span[text()='" + shiftValue + "']")));
		e.click();
		return this;
	}

	public PIM_AddEmployeePage setEffectiveFrom(String date) {
		driver.findElement(By.xpath("//label[text()='Effective From']/following-sibling::span//i")).click();
		driver.findElement(
				By.xpath("//input[@id='add_employee_effective_date']//following-sibling::span[1]//div[text()='" + date
						+ "'][contains(@class,'--infocus')]"))
				.click();
		return this;
	}

	public PIM_AddEmployeePage setRegion(String region) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement regionDropDown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[text()='Region']/preceding-sibling::div/input")));
		// scrolling
		regionDropDown.click();

		WebElement regionElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='" + region + "']")));
		regionElement.click();
		return this;
	}
}
