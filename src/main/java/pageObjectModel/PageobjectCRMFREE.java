package pageObjectModel;

import org.openqa.selenium.By;

public class PageobjectCRMFREE {
	
	public static By SignInbutton= By.xpath("(//a[@href='https://www.freecrm.com/register/'])[2]");
	public static By accountType= By.xpath("//select[@name='payment_plan_id']");
	public static By username= By.xpath("//input[@name='first_name']");
	public static By Surname= By.xpath("//input[@name='surname']");
	public static By email= By.xpath("//input[@name='email']");
	public static By confirmemail= By.xpath("//input[@name='email_confirm']");
	public static By enteruser= By.xpath("//input[@name='username']");
	public static By pass= By.xpath("//input[@name='password']");
	public static By passconfirm= By.xpath("//input[@name='passwordconfirm']");
	public static By agreeterm= By.xpath("//input[@name='agreeTerms']");
	public static By submitbtn= By.xpath("//button[@id='submitButton']");
	

		
	}


