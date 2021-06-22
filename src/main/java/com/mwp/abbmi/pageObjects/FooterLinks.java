package com.mwp.abbmi.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinks extends BasePage {

	public FooterLinks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public @FindBy(xpath = "//a[text()='Submit an Inquiry']") WebElement link_SubmitInquiry;
	public @FindBy(xpath = "//a[text()='Prescribing Information']") WebElement link_Prescribing;
	public @FindBy(xpath = "//a[text()='Other Requests']") WebElement link_OtherRequest;
	public @FindBy(linkText = "Clinical Research & Innovation") WebElement link_ClinicalResearch;
	public @FindBy(linkText = "AbbVie Global") WebElement link_Abbvie;
	public @FindBy(linkText = "Terms of Use") WebElement link_Terms;
	public @FindBy(linkText = "Privacy Policy") WebElement link_Privacy;
	public @FindBy(linkText = "Site Feedback") WebElement link_Site;

}
