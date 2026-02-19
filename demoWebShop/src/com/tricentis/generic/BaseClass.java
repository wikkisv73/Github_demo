package com.tricentis.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.tricentis.pom.DashboardPage;
import com.tricentis.pom.HomePage;
import com.tricentis.pom.LoginPage;

public class BaseClass {
	public FileLib f = new FileLib();
	
	public static WebDriver driver;
	
		@BeforeTest
	public void openBrowser() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readPropertyData("url");
		driver.get(url);
		
	}
		@BeforeMethod
	public void login() throws IOException {
			
		DashboardPage d = new DashboardPage(driver);
		d.clickLoginLink();
//		driver.findElement(By.className("ico-login")).click();
		LoginPage l = new LoginPage(driver);
		String email = f.readPropertyData("email");
		String pwd = f.readPropertyData("password");
		
		l.enterLoginDetails(email, pwd);
//		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
//		driver.findElement(By.id("Password")).sendKeys("12345678");
//		driver.findElement(By.className("login-button")).click();
		
	}
		@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.clickLogoutLink();
//		driver.findElement(By.linkText("Log out")).click();
	}
		
		@AfterTest
	public void closeBrowser() {
		
		driver.quit();	
			
		}
	
}
