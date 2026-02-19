package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	@FindBy(className = "content")
	private WebElement cartMsg;
	
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getCartMsg() {
		String resultMsg = cartMsg.getText();
		return resultMsg;
	}
}
