package com.mwp.abbmi.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import com.mwp.abbmi.pageObjects.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AbbEmpLoginPageSteps extends BasePage {

	final static Logger LOG = LoggerFactory.getLogger(AbbEmpLoginPageSteps.class);

	@Given("^User navigates to Home Page website$")
	public void user_navigates_to_Home_Page_website() throws IOException, InterruptedException {
		//getDriver().get(System.getProperty("url"));
		
		
		
		//WebDriverManager.voiddriver().setup();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver1= new ChromeDriver();
		
		//WebDriver driver1= new SafariDriver();
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());

	}

	@Given("^User navigates to Home Page website and responsive as \"([^\"]*)\"$")
	public void user_navigates_to_Home_Page_website_and_responsive(String res)
			throws IOException, InterruptedException {
		getDriver().get(System.getProperty("url"));
		selectDimension(res);

	}

	@When("^User selects user as abbvie employee$")
	public void user_selects_user_as_abbvie_employee() throws IOException {

		WaitUntilWebElementIsVisible(homePage.radioBtn_AbbVieEmployee);
		homePage.radioBtn_AbbVieEmployee.click();
	}

	@And("^User clicks on Enter button$")
	public void user_clicks_on_Enter_button() throws IOException, Exception {

		waitAndClickElement(homePage.btn_Enter);
	}

	@And("^User enter Username$")
	public void user_enter_Username_as() throws IOException {
		WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_UserName);
		abbEmpLoginPage.txtBox_UserName.sendKeys(System.getProperty("username"));

	}

	@And("^User enter Username as \"([^\"]*)\"$")
	public void user_enter_Username_as(String username) throws IOException {

		WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_UserName);
		abbEmpLoginPage.txtBox_UserName.sendKeys(username);

	}

	@And("^User enter Password$")
	public void user_enter_Password_as() throws IOException {
		WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_Password);
		abbEmpLoginPage.txtBox_Password.sendKeys(System.getProperty("password"));

	}

	@And("^User enter Password as \"([^\"]*)\"$")
	public void user_enter_Password_as(String password) throws IOException {
		WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_Password);
		abbEmpLoginPage.txtBox_Password.sendKeys(password);

	}

	@And("^User clicks on SignIn button$")
	public void user_clicks_on_SignIn_button() throws IOException, InterruptedException {
		waitAndClickElement(abbEmpLoginPage.btn_SignIn);

	}

	@Then("^User should see message HEALTHCARE PROFESSIONALS, GET THE ANSWERS YOU ARE SEARCHING FOR HERE$")
	public void user_should_see_message_HEALTHCARE_PROFESSIONALS_GET_THE_ANSWERS_YOU_ARE_SEARCHING_FOR_HERE()
			throws IOException, InterruptedException {
		WaitUntilWebElementIsVisible(abbEmpLoginPage.lbl_HealthcareProfessional);
		String lblHealthcareProfessionalMsg = abbEmpLoginPage.lbl_HealthcareProfessional.getText();
		LOG.info(lblHealthcareProfessionalMsg);
		Assert.assertEquals("Healthcare Professionals, Get The Answers You Are Searching For Here",
				abbEmpLoginPage.lbl_HealthcareProfessional.getText());

	}

	@And("^Close the browser$")
	public void Close_the_browser() throws IOException {

		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}

	}

}
