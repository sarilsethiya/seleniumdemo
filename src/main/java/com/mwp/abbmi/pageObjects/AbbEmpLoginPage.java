package com.mwp.abbmi.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbbEmpLoginPage extends BasePage {

	public @FindBy(css = "input[type='text']") WebElement txtBox_UserName;
	public @FindBy(css = "input[type='password']") WebElement txtBox_Password;
	public @FindBy(css = "input[type='submit']") WebElement btn_SignIn;
	public @FindBy(css = "h2.mb-3.mt-2.text-center") WebElement lbl_HealthcareProfessional;
	public @FindBy(id = "mcphSigninBox_errorTitle") WebElement ERROR_MESSAGE;

}
