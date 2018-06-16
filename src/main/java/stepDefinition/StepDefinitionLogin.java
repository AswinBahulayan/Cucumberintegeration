package stepDefinition;
import seleniumHelper.SeleniumHelper;
import pageObjectModel.PageobjectCRMFREE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class StepDefinitionLogin extends SeleniumHelper {
	
	@Given("^the user is in the home page$")
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/ASWIN/Desktop/chromedriver_win32/chromedriver.exe");
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
		_driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(10000);
		Clickbutton(PageobjectCRMFREE.SignInbutton, "Sign In button");
		Thread.sleep(5000);
		SelectItemListBox(PageobjectCRMFREE.accountType, "Free Edition");
		Entertext(PageobjectCRMFREE.username, "Aswin");
		Entertext(PageobjectCRMFREE.Surname, "Bahulayan");
		Entertext(PageobjectCRMFREE.email, "aswinbahulayan@gmail.com");
		Entertext(PageobjectCRMFREE.confirmemail, "aswinbahulayan@gmail.com");
		Entertext(PageobjectCRMFREE.enteruser, "aswinbahulayan");
		Entertext(PageobjectCRMFREE.pass, "Hpaix@7612");
		Entertext(PageobjectCRMFREE.passconfirm, "Hpaix@7612");
		CheckBox(PageobjectCRMFREE.agreeterm, "Submit button");
		Thread.sleep(2000);
		Clickbutton(PageobjectCRMFREE.submitbtn, "Submit button");
		_driver.quit();
		
	}

}
