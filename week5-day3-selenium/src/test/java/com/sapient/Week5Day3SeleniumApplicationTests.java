package com.sapient;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.sapient.config.HomePage;

@SpringBootTest
class Week5Day3SeleniumApplicationTests {

	private HomePage homePage;
	
	@Value("${appUrl}")
	private String appUrl;
	
	
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		homePage = new HomePage(driver);
		driver.get("https://www.flipkart.com/");
		homePage.navigate("https://www.flipkart.com/");
//		homePage.login("9871310263", "safhsdi");
//		
//		homePage.click_login();
		
	}
	
}
