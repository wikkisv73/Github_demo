package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoesPrdPage {

	
	@FindBy(linkText = "Blue and green Sneaker")
	private WebElement blueShoeLink;
	
	
	
	public ShoesPrdPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void sneakerlink() {
		blueShoeLink.click();
	}
}
