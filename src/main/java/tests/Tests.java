package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import pageObject.ButtonsPage;
import pageObject.HomePage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Tests {

	public WebDriver driver;
	public HomePage home;
	public ButtonsPage contact;
	
/*
	@Test
	public void should_be_able_to_login() 
	{	 
	home.login("niaringa@gmail.com", "Password9*");
	//	driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	//	WebElement startName = contact.getCardTitle ();		
	//	AssertJUnit.assertEquals(startName.getText (), "Quick Start");	
		WebElement confirmMessage = home.getCardTitle();		
		AssertJUnit.assertEquals(confirmMessage.getText(), "Thanks for submitting your information");			
	}
*/	    	
	
	
	@Test
	public void should_be_able_to_create_an_invoice() 
	{	contact.create(); 
		WebElement confirm = contact.getFinalConfirmationMessage ();		
		AssertJUnit.assertEquals(confirm.getText (), "Paid and Confirmed");			
	}

		
	@BeforeClass

	public void beforeClass() {	
		  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions(); 
		  options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		  WebDriver driver = new ChromeDriver(options); 
		//  driver = new ChromeDriver();
		  driver.get("https://sandbox.coingate.com/login");
		  driver.get("https://dashboard-sandbox.coingate.com/account/buttons");
		  driver.manage().window().maximize();
		  home = new HomePage (driver);
		  contact = new ButtonsPage(driver);
	}
  
		
	 @AfterClass
	 public void afterClass() {
		// driver.close();
	 }
	

}
