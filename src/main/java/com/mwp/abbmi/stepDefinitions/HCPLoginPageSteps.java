package com.mwp.abbmi.stepDefinitions;

import java.io.IOException;
import java.sql.SQLException;
import com.mwp.abbmi.pageObjects.BasePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.runtime.CucumberException;

public class HCPLoginPageSteps extends BasePage {

	@When("^user login as HCP$")

	public void user_login_as_HCP() throws CucumberException, InterruptedException, IOException {

		waitAndClickElement(homePage.radioBtn_HCP);

	}

	@And("^user selects country as \"([^\"]*)\"$")

	public void user_selects_country_as(String country) throws Exception {

		actionMoveAndClickAndSendKeysAndEnter(homePage.dropdown_CountryHome.get(3), country);

	}

	@And("^user Selects checkbox for HCP with a correct license$")
	public void user_Select_checkbox_for_HCP_with_a_correct_license() throws Exception {

		actionMoveAndClick(homePage.chkBox_AcceptLicenceHome);

	}

	@And("^user clicks on Enter$")
	public void user_clicks_on_Enter() throws CucumberException, SQLException, InterruptedException, IOException {

		waitAndClickElement(homePage.btn_Enter);

	}

}
