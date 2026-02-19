package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id = "Email")
	private WebElement emailTbx;
	
	@FindBy(id = "Password")
	private WebElement pwdTbx;
	
	@FindBy(className = "login-button")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterLoginDetails(String email , String pwd) {
		emailTbx.sendKeys(email);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();
	}

	
	
	
}
