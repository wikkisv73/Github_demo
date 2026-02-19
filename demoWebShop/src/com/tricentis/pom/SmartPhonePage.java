package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartPhonePage {
	
	
	
	@FindBy(className = "product-box-add-to-cart-button")
	private WebElement addToCartBtn;
	
	public SmartPhonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void addTocartSmartPhone() {
		addToCartBtn.click();
	}

}
