package com.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	
	@FindBy(id = "Enquiry")
	private WebElement enquiryTbx;
	
	@FindBy(className = "contact-us-button")
	private WebElement contactUsBtn;
	
	@FindBy(className = "result")
	private WebElement resultMsg;
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEnquiryMsg(String msg) {
		enquiryTbx.sendKeys(msg);
		contactUsBtn.click();
	}
	
	
	public String getResultMsg() {
		String result = resultMsg.getText();
		return result;
	}
	
	
}
