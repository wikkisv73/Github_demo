package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	
	@FindBy(name = "removefromcart")
	private WebElement clickCheckBx;
	
	@FindBy(xpath = "//input[@value='Update wishlist']")
	private WebElement updateWishListBtn;
	
	
	@FindBy(className = "wishlist-content")
	private WebElement updateWishListText;
	
	Actions a ;
	
	public WishListPage(WebDriver driver) {
		this.a=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void updateWl() {
		clickCheckBx.click();
		updateWishListBtn.click();
		
	}
	public String wlUpMsg() {
		String upText = updateWishListBtn.getText();
		return upText;
	}
}
