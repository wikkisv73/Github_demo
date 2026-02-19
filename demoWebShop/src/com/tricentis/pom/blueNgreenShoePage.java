package com.tricentis.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blueNgreenShoePage {

	
	@FindBy(xpath = "//select[contains(@name,'product_attribute')]")
	private WebElement dropDown;
	
	@FindBy(xpath = "//span[@title='Green']")
	private WebElement selectClr;
	
	@FindBy(className = "add-to-wishlist-button")
	private WebElement addToWishlistBtn;
	
	@FindBy(xpath = "//p[@class='content']")
	private WebElement wishListMsg;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	WebDriverWait wait;
	Actions a;
	
	public blueNgreenShoePage(WebDriver driver) {
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		this.a= new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void filterShoes() {
		dropDown.click();
		Select s = new Select(dropDown);
		s.selectByValue("28");
		selectClr.click();
		addToWishlistBtn.click();
		
	}
	public String wishListMsg() {
		wait.until(ExpectedConditions.visibilityOf(wishListMsg));
		return wishListMsg.getText();
		
	}
	
	public void cwlBtn() {
		a.scrollToElement(wishlistLink).perform();
		wishlistLink.click();
	}
}
