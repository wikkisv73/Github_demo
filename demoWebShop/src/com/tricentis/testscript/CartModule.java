package com.tricentis.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tricentis.generic.BaseClass;
import com.tricentis.pom.CartPage;
import com.tricentis.pom.HomePage;
import com.tricentis.pom.SmartPhonePage;


//@Listeners(com.tricentis.generic.ListenerImplementation.class)
public class CartModule extends BaseClass{

		@Test
	public void AddToCart() throws EncryptedDocumentException, IOException {
		HomePage h = new HomePage(driver);
		String searchproduct = f.readExcelData("searchproduct", 1, 1);
		h.searchProduct(searchproduct);
//		driver.findElement(By.id("small-searchterms")).sendKeys("smartphone");
//		driver.findElement(By.className("search-box-button")).click();
		SmartPhonePage sp = new SmartPhonePage(driver);
		sp.addTocartSmartPhone();
		CartPage cp = new CartPage(driver);
		String cartMsgs = cp.getCartMsg();
//		driver.findElement(By.className("product-box-add-to-cart-button")).click();
//		String cartMsg = driver.findElement(By.className("content")).getText();
//		System.out.println(cartMsg);
		Reporter.log(cartMsgs,true);
	}
}
