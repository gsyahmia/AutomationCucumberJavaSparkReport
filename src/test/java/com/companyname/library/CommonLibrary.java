package com.companyname.library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.companyname.UIconstants.LoginPageUI;

public class CommonLibrary {
	private WebDriver driver;

	// Constructor to parse the webdriver from step definitions
	public CommonLibrary(WebDriver driver) {
		this.driver = driver;	
	}
	
	
	LoginPageUI loginUI = new LoginPageUI();
	
	
	// Functions
	public void click(String locatorClick) {
		driver.findElement(By.xpath(locatorClick)).click();
	}
	
	public void clickFirstLoginButton() {
		driver.findElement(By.xpath(loginUI.btn_first_login_xpath)).click();
	}
	
	public void setUsername(String username) {
		driver.findElement(By.xpath(loginUI.txtbox_usrnm_xpath)).sendKeys(username);
	}
	
	
	public void setUserPassword(String password) {
		System.out.println("username "+ password);	
		driver.findElement(By.xpath(loginUI.txtbox_pwd_xpath)).sendKeys(password);
	}
	
	public void clickNextButton() {
		driver.findElement(By.id(loginUI.btn_next_id)).click();
		
	}
	
	public void clickLoginButton() {
		driver.findElement(By.xpath(loginUI.btn_login_xpath)).click();
		
	}
	
	public Boolean popUpCheck() {
		Boolean popUp = driver.findElement(By.xpath(loginUI.pop_up_xpath)).isDisplayed();
		return popUp;
	}
	
	public void headerProfile() {
		String header = driver.findElement(By.xpath(loginUI.profile_header_xpath)).getText();
		System.out.println("header == "+header);
	}
	
	public String unregisteredEmailPopupInfo() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String unregisteredPopup = driver.findElement(By.xpath(loginUI.unregistered_email_xpath)).getText(); //Couldn't get the text properply because the popup above another popup
		System.out.println("unregisteredPopup=="+ driver.findElement(By.xpath(loginUI.unregistered_email_xpath)).getText());
		return unregisteredPopup;
	}
	
	public void clickOtherMethodButton() {
		driver.findElement(By.xpath(loginUI.btn_other_method_xpath)).click();
		
	}
	
	public Boolean chooseAccountTextisDisplayed() {
		Boolean chooseAccount = driver.findElement(By.xpath(loginUI.pop_up_choose_account_xpath)).isDisplayed();
		return chooseAccount;
	}
	
}
