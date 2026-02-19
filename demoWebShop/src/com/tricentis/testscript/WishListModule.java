package com.tricentis.testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tricentis.generic.BaseClass;
import com.tricentis.pom.HomePage;
import com.tricentis.pom.ShoesPrdPage;
import com.tricentis.pom.WishListPage;
import com.tricentis.pom.blueNgreenShoePage;
@Listeners(com.tricentis.generic.ListenerImplementation.class)
public class WishListModule extends BaseClass {
	@Test
	public void addToWlist() {
		
//		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[3]")).click();
		HomePage h = new HomePage(driver);
		h.clickAppNshoes();
//		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		ShoesPrdPage sp= new ShoesPrdPage(driver);
		sp.sneakerlink();
//		WebElement dropDown = driver.findElement(By.xpath("//select[contains(@name,'product_attribute')]"));
//		dropDown.click();
//		Select s= new Select(dropDown);
//		s.selectByValue("28");
//		driver.findElement(By.xpath("//span[@title='Green']")).click();
//		driver.findElement(By.className("add-to-wishlist-button")).click();
		blueNgreenShoePage bp= new blueNgreenShoePage(driver);
		bp.filterShoes();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement wishListMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='content']")));
//		System.out.println(wishListMsg.getText());
		String wLmsg = bp.wishListMsg();
		Reporter.log(wLmsg,true);
//		WebElement wishListLink = driver.findElement(By.xpath("//span[text()='Wishlist']"));
//		Actions a = new Actions(driver);
//		a.scrollToElement(wishListLink).perform();
//		wishListLink.click();
		bp.cwlBtn();
//		driver.findElement(By.name("removefromcart")).click();
//		WebElement clickCheckbx = driver.findElement(By.xpath("//input[@value='Update wishlist']"));
//		for(WebElement checkbox:clickCheckbx) {
//			checkbox.click();
//		}
//		String wishListText = driver.findElement(By.className("wishlist-content")).getText();
//		System.out.println(wishListText);
		WishListPage wp = new WishListPage(driver);
		wp.updateWl();
		String upMsg = wp.wlUpMsg();
		Reporter.log(upMsg,true);
		h.clickLogoutLink();
//		driver.quit();
	}
}
