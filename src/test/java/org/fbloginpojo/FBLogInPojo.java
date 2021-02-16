package org.fbloginpojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogInPojo extends BaseClass{
	public FBLogInPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;

	public WebElement getTxtEmail() {
		return txtEmail;
	}
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	@FindBy(name="login")
	private WebElement btnLogIn;
	
	public WebElement getBtnLogIn() {
		return  btnLogIn;
	}
	
	public void loginEnterUsernameAndPassword(String username, String password) {
		enterTheValues(getTxtEmail(), username);
		enterTheValues(getTxtPassword(), password);
	}
	
	public void loginButtonClick() {
		buttonClick(getBtnLogIn());
	}
}
