package com.techno.orghrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.techno.orghrm.base.PredefineAction;

public class DashBoardPage extends PredefineAction
{
	public String getDashBoardTitle()
	{
		 return driver.getTitle();
	}
	public int getTotalWidgets()
	{
		int totalWedgets= driver.findElements(By.xpath("//*[@id='widget.id']")).size();
		return totalWedgets;
	}
	public List<String> getAllWidgets()
	{
		/*List <WebElement> ActualWedgitsElement=driver.findElements(By.xpath("//div[@class='widget-header']/span[2]"));
		List<String > Wedgits=new ArrayList<String>();
		for(WebElement Wedgit:ActualWedgitsElement)
		{
			Wedgits.add(Wedgit.getText());
		}
		return Wedgits;*/
		return getTextOfAllElement("//div[@class='widget-header']/span[2]");
	}
}
