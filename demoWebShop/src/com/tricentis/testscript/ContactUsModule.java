package com.tricentis.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tricentis.generic.BaseClass;
import com.tricentis.pom.ContactUsPage;
import com.tricentis.pom.HomePage;
	
	@Listeners(com.tricentis.generic.ListenerImplementation.class)
public class ContactUsModule extends BaseClass {

	@Test
	public void contactUs() throws EncryptedDocumentException, IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
		HomePage h = new HomePage(driver);
		h.clickContactUsLink();
//		driver.findElement(By.linkText("Contact us")).click();
		ContactUsPage c = new ContactUsPage(driver);
		String enqMsg = f.readExcelData("contactus", 1, 1);
		c.enterEnquiryMsg(enqMsg);
//		driver.findElement(By.id("Enquiry")).sendKeys("Is the prduct available?");
		String text = c.getResultMsg();
//		driver.findElement(By.className("contact-us-button")).click();
//		String text = driver.findElement(By.xpath("//div[@class='result'")).getText();
//		System.out.println(text);
		f.readExcelData("", 0, 0);
		Reporter.log(text,true);
		
	}
}
