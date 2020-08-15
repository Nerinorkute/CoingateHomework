package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject { 

	public HomePage(WebDriver driver) {
		super(driver);	
	}
	
		@FindBy(name = "user[email]")
		private WebElement emailField;
		
		public WebElement getEmailField() {
			return emailField;
		}
		
		
		@FindBy(name = "user[password]")
		private WebElement passwordField;
		
		public WebElement getPasswordField() {
			return passwordField;
		}
		
		
		@FindBy(id = "login")
		private  WebElement submitButton ;
		
		public WebElement getSubmitButton() {
			return submitButton;
		}
		
		
		@FindBy(className = "dashboard-card-title")
		private WebElement quickStart;
		
		public WebElement getCardTitle () {
			return quickStart;
		}
		
	/*	

		public void login (String email, String password) {
			driver.get("https://sandbox.coingate.com/login");
			this.getEmailField().sendKeys(email);  
			this.getPasswordField().sendKeys(password);
			this.getSubmitButton().click();
		}

*/



}
	
	
	



