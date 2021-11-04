package com.techno.orghrm.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefineAction 
{
	protected static WebDriver driver;
	public static void  start() 
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		 driver=new ChromeDriver();
		System.out.println("Step 1- Launch Browser and redirect to site");
		driver.get("https://deven001-trials72.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
	}
	public static void start(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Step 1- Launch Browser and redirect to site");
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void quiteBrowser()
	{
		driver.quit();
	}
	
	public List<String> getTextOfAllElement(String locator)
	{
		
		List <WebElement> ActualElement=driver.findElements(By.xpath(locator));
		List<String > Element=new ArrayList<String>();
		for(WebElement Wedgit:ActualElement)
		{
			Element.add(Wedgit.getText());
		}
		return Element;
		
	}
}
