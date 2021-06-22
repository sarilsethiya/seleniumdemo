package com.mwp.abbmi.stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.mwp.abbmi.pageObjects.BasePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends BasePage {

	SoftAssert softAssert = new SoftAssert();
	BasePage basePage = new BasePage();

	@Given("^user navigates to Home Page \"([^\"]*)\" website$")
	public void user_navigates_to_Home_Page_website(String url) throws IOException {
		getDriver().get(url);
	}

	@Then("^I should see label Welcome to AbbVie’s Medical Information Site$")
	public void i_should_see_label_Welcome_to_AbbVie_s_Medical_Information_Site() throws IOException {
		basePage.WaitUntilWebElementIsVisible(homePage.lablel_WelcomeMessage);
		String welcomeMsg = homePage.lablel_WelcomeMessage.getText();
		Assert.assertEquals("Welcome to AbbVie’s Medical Information Site", homePage.lablel_WelcomeMessage.getText());
	}

	@And("^I should see language as label$")
	public void i_should_see_language_label_and_control() throws IOException {
		basePage.WaitUntilWebElementIsVisible(homePage.label_Language);
	}

	@And("^I should see language dropdown with prepopulated values$")
	public void i_should_see_language_drodown_control() throws IOException {
		basePage.WaitUntilWebElementIsVisible(homePage.dropdown_Language);
	}

	@And("^I should see I am label$")
	public void i_should_see_I_am_label() throws IOException {
		basePage.WaitUntilWebElementIsVisible(homePage.label_Iam);
	}

	@And("^when user is cliking on abbvie logo Its navigating to abbvie website$")
	public void when_user_is_cliking_on_abbvie_logo_Its_navigating_to_abbvie_website()
			throws IOException, InterruptedException {

		waitAndClickElement(homePage.logo_Abbvie);
		Thread.sleep(2000);
		ArrayList<String> listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(1));
		Assert.assertEquals("https://www.abbvie.com/", getCurrentURL());
	}

}
