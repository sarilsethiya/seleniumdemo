package com.mwp.abbmi.stepDefinitions;

import java.util.ArrayList;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mwp.abbmi.pageObjects.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class FooterLinksSteps extends BasePage {

	ArrayList<String> listOfWindows;
	String parentWindow = driver.getWindowHandle();
	final static Logger LOG = LoggerFactory.getLogger(FooterLinksSteps.class);

	@When("^user clicks on submit an inquiry link$")
	public void user_clicks_on_submit_an_inquiry_link() throws Exception {

		isElementClickable(footerLinks.link_SubmitInquiry);
		waitAndClickElement(footerLinks.link_SubmitInquiry);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(1));
		LOG.info(getCurrentURL());
		String Expected = "";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());

	}

	@And("^user clicks on prescribing link$")
	public void user_clicks_on_prescribing_link() throws Exception {

		isElementClickable(footerLinks.link_Prescribing);
		waitAndClickElement(footerLinks.link_Prescribing);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(1));
		LOG.info(getCurrentURL());
		String Expected = "https://www.rxabbvie.com/";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());

	}

	@And("^user clicks on other requests link$")
	public void user_clicks_on_other_requests_link() throws Exception {

		isElementClickable(footerLinks.link_OtherRequest);
		waitAndClickElement(footerLinks.link_OtherRequest);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(2));
		LOG.info(getCurrentURL());
		String Expected = "https://www.abbvie.com/contactus.html";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());
	}

	@And("^user clicks on client research link$")
	public void user_clicks_on_client_research_link() throws Exception {

		isElementClickable(footerLinks.link_ClinicalResearch);
		waitAndClickElement(footerLinks.link_ClinicalResearch);
		Thread.sleep(4000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(3));
		LOG.info(getCurrentURL());
		String Expected = "https://www.abbvie.com/our-science.html";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());
	}

	@And("^user clicks on abbvie global link$")
	public void user_clicks_on_abbvie_global_link() throws Exception {

		isElementClickable(footerLinks.link_Abbvie);
		waitAndClickElement(footerLinks.link_Abbvie);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(4));
		LOG.info(getCurrentURL());
		String Expected = "https://www.abbvie.com/";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());
	}

	@And("^user clicks on terms of use link$")
	public void user_clicks_on_terms_of_use_link() throws Exception {

		isElementClickable(footerLinks.link_Terms);
		waitAndClickElement(footerLinks.link_Terms);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(5));
		LOG.info(getCurrentURL());
		String Expected = "https://www.abbvie.com/termsofuse.html";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());
	}

	@And("^user clicks on privacy policy link$")
	public void user_clicks_on_privacy_policy_link() throws Exception {

		isElementClickable(footerLinks.link_Privacy);
		waitAndClickElement(footerLinks.link_Privacy);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(6));
		LOG.info(getCurrentURL());
		String Expected = "https://www.abbvie.com/privacy.html";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());

	}

	@And("^user clicks on site feedback link$")
	public void user_clicks_on_site_feedback_link() throws Exception {

		isElementClickable(footerLinks.link_Site);
		waitAndClickElement(footerLinks.link_Site);
		Thread.sleep(2000);
		listOfWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfWindows.get(7));
		LOG.info(getCurrentURL());
		String Expected = "https://www.surveymonkey.com/r/Q8JBJS8";
		Assert.assertEquals(Expected, getCurrentURL());
		LOG.info("CorrectLink");
		driver.switchTo().window(parentWindow);
		LOG.info(getCurrentURL());
	}

}
