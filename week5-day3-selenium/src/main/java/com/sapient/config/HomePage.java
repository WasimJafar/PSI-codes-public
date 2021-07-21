package com.sapient.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Service;

@Service
public class HomePage extends BasePage{
	
	
	public HomePage() {}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.NAME, using = "ap_email")
	public WebElement textUserEmail;
	
	
	@FindBy(how = How.NAME, using = "ap_password")
	public WebElement textUserPassword;
	
//	class="a-button-input"
	
	@FindBy(how = How.CSS, using = "a-button-input")
	public WebElement btnSignIn;
	
	
	public void login(String userEmail, String password) {
		textUserEmail.sendKeys(userEmail);
		textUserPassword.sendKeys(password);
	}
	
	
	public void click_login() {
		btnSignIn.click();
	}
	
}
