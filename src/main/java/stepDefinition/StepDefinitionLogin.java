package stepDefinition;
import seleniumHelper.SeleniumHelper;
import _testDataManage._testDataManage;
import pageObjectModel.PageobjectCRMFREE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class StepDefinitionLogin extends SeleniumHelper {
	
	@Given("^the user is in the home page$")
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/seleniumAPI/chromedriver.exe");
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
		String URL=_testDataManage.getDataSheetENV("URL", "Test1");
		String FirstName=_testDataManage.getTestData("Firstname", "TCID001");
		String LastName=_testDataManage.getTestData("Lastname", "TCID001");
		String emailID=_testDataManage.getTestData("email_ID", "TCID001");
		String Username=_testDataManage.getTestData("username", "TCID001");
		String password=_testDataManage.getTestData("pass", "TCID001");
		_driver.get(URL);
		Thread.sleep(10000);
		Clickbutton(PageobjectCRMFREE.SignInbutton, "Sign In button");
		Thread.sleep(5000);
		SelectItemListBox(PageobjectCRMFREE.accountType, "Free Edition");
		Entertext(PageobjectCRMFREE.username, FirstName);
		Entertext(PageobjectCRMFREE.Surname, LastName);
		Entertext(PageobjectCRMFREE.email, emailID);
		Entertext(PageobjectCRMFREE.confirmemail, emailID);
		Entertext(PageobjectCRMFREE.enteruser, Username);
		Entertext(PageobjectCRMFREE.pass, password);
		Entertext(PageobjectCRMFREE.passconfirm, password);
		CheckBox(PageobjectCRMFREE.agreeterm, "Submit button");
		Thread.sleep(2000);
		Clickbutton(PageobjectCRMFREE.submitbtn, "Submit button");
		_driver.quit();
		
	}

}
