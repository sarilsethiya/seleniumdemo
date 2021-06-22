package com.mwp.abbmi.stepDefinitions;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.mwp.abbmi.pageObjects.BasePage;

import cucumber.api.java.en.And;

public class AbbEmpLoginFailedPageSteps extends BasePage {

	BasePage basePage = new BasePage();
	final static Logger LOG = LoggerFactory.getLogger(AbbEmpLoginFailedPageSteps.class);

	@And("^User should see error message$")
	public void delete_cookie() throws IOException {

		String errorMessage = abbEmpLoginPage.ERROR_MESSAGE.getText();
		LOG.info(errorMessage);
		Assert.assertEquals("Sign in failed! Verify your login and try again.",
				abbEmpLoginPage.ERROR_MESSAGE.getText());

	}

	@And("^reset username and passowrd$")
	public void reset_username_and_passowrd() throws IOException {

		basePage.WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_UserName);
		abbEmpLoginPage.txtBox_UserName.click();
		abbEmpLoginPage.txtBox_UserName.clear();
		basePage.WaitUntilWebElementIsVisible(abbEmpLoginPage.txtBox_Password);
		abbEmpLoginPage.txtBox_Password.click();
		abbEmpLoginPage.txtBox_Password.clear();
		LOG.info("Username and Password is reset Successfully");

	}

}
