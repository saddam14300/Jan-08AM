package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.LibGlobal2;

public class LoginPage extends LibGlobal1 {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuserName;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String username, String password ) {
		sendkeys(getTxtuserName(), username);
		sendkeys(getTxtpassword(), password);
		click(getBtnlogin());
	}

	
	}
	
	
	
