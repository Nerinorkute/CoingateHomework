package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pageObject.ButtonsPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test_Invoice {



	public WebDriver driver;
	public LoginPage login;
	public ButtonsPage create;
	public MainPage main;
	
	@Test (priority=0)
	public void should_be_able_to_login_ () throws InterruptedException 
	{ 
		login.login("user@gmail.com", "Password9*");
		login.submit();	
		Thread.sleep(60000);	
		WebElement start = main.getAccountPageTitle();		
		Assert.assertEquals(start.getText (), "Quick Start");
		main.signOut();	
	}
	
	@Test (priority=1)
	public void should_be_able_to_open_PaymentButtonsPage () throws InterruptedException 
	{ 
		login.login("user@gmail.com", "Password9*");
		login.submit();
		Thread.sleep(60000);
		WebElement buttonsPage = create.getPaymentButtonTitle ();		
		Assert.assertEquals(buttonsPage.getText (), "Payment Buttons");
		main.signOut();	
	}
	
	@Test (priority=2)
	public void should_be_able_to_create_an_invoice() throws InterruptedException 
	{	
		login.login ("user@gmail.com", "Password9*"); 
		login.submit();
		Thread.sleep(60000);
		create.create();
		WebElement confirm = create.getFinalConfirmationMessage ();		
		Assert.assertEquals(confirm.getText (), "Paid and Confirmed");	
	}
	
	@BeforeClass
	public void beforeClass() {	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sandbox.coingate.com/login");		
		driver.manage().window().maximize();
		login = new LoginPage (driver);
		create = new ButtonsPage(driver);
		main = new MainPage (driver);
	}
  
	

	@AfterMethod
	 public void cleanUp() {
		driver.manage().deleteAllCookies();
	 }
		
	
	 @AfterClass
	 public void afterClass() {
		driver.close();
	 }
	 
	 
	

}
