package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(linkText = "Contact us")
	private WebElement contactUsLink;
	
	@FindBy(id  = "bar-notification" )
	private WebElement logoutLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTbx;
	
	@FindBy(className = "search-box-button")
	private WebElement searchBtn;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[3]")
	private WebElement shoesLink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickContactUsLink() {
		contactUsLink.click();
	}
	
	public void clickLogoutLink() {
		logoutLink.click();
	}
	
	public void searchProduct(String stbx) {
		searchTbx.sendKeys(stbx);
		searchBtn.click();
	}
	public void clickAppNshoes() {
		shoesLink.click();
	}
	
}
