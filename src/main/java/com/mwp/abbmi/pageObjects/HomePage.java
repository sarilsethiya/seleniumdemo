package com.mwp.abbmi.pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {	

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public @FindBy(css ="h3.text-center") WebElement lablel_WelcomeMessage;
	public @FindBy(css ="label.select-float-label") WebElement label_Language;
	public @FindBy(css ="div.Select-value") WebElement dropdown_Language;
	public @FindBy(css ="h4.m-r-20") WebElement label_Iam;
	public @FindBy(xpath ="//span[text()='A Healthcare Professional']") WebElement radioBtn_HCP;
	public @FindBy(xpath ="//label[2]/span[2]") WebElement radioBtn_AbbVieEmployee;
	public @FindAll({ @FindBy(css = "input[role='combobox']")}) List<WebElement>  dropdown_CountryHome;
	public @FindBy(css ="input[value='on']") WebElement chkBox_AcceptLicenceHome;
	public @FindBy(xpath ="//button[contains(text(),'ENTER')]") WebElement btn_Enter;
	public @FindBy(css ="a.logo") WebElement logo_Abbvie;
	
	

}
