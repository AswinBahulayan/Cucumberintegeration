package seleniumHelper;

//import java.awt.print.Printable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import pageObjectModel.PageobjectCRMFREE;

public class SeleniumHelper {
	
	public static WebDriver _driver;
	public void Entertext(By element, String value)
	{
		String a=element.toString();
		String[] b=a.split(": ");

		for(int i=0;i<=1;i++)
		{
			
			System.out.println(b[i]);
		}
		System.out.println('"'+b[1]+'"');
		if(b[0].contains("By.xpath"))
		{
			try {
			String d=b[1];
			String f=d.trim();
			
			WebElement e=_driver.findElement(By.xpath(f));
			e.sendKeys(value);
			}catch(Exception c) {c.getMessage();
			System.out.println(c);}
			
		}
	}
	
	public void Clickbutton(By element,String ButtonName)
	{
		String a=element.toString();
		String[] b=a.split(": ");

		for(int i=0;i<=1;i++)
		{
			
			System.out.println(b[i]);
		}
		System.out.println('"'+b[1]+'"');
		if(b[0].contains("By.xpath"))
		{
			try {
			String d=b[1];
			String f=d.trim();
			
			WebElement e=_driver.findElement(By.xpath(f));
			e.click();
			System.out.println("Clicked : "+ButtonName);
			}catch(Exception c) {c.getMessage();
			System.out.println(c);}
			
		}
	}
	
	public void SelectItemListBox(By element,String Value)
	{
		String a=element.toString();
		String[] b=a.split(": ");

		for(int i=0;i<=1;i++)
		{
			
			System.out.println(b[i]);
		}
		System.out.println('"'+b[1]+'"');
		if(b[0].contains("By.xpath"))
		{
			try {
			String d=b[1];
			String f=d.trim();
			Select actType = new Select(_driver.findElement(By.xpath(f)));
			actType.selectByVisibleText(Value);
			
			}catch(Exception c) {c.getMessage();
			System.out.println(c);}
			
		}
	}
	
	public void CheckBox(By element,String Value)
	{
		String a=element.toString();
		String[] b=a.split(": ");

		for(int i=0;i<=1;i++)
		{
			
			System.out.println(b[i]);
		}
		System.out.println('"'+b[1]+'"');
		if(b[0].contains("By.xpath"))
		{
			try {
			String d=b[1];
			String f=d.trim();
			WebElement chkbox=_driver.findElement(By.xpath(f));
			chkbox.click();
			System.out.println("CheckBox "+Value+"Clicked");
			}catch(Exception c) {c.getMessage();
			System.out.println(c);}
			
		}
	}
	
}
