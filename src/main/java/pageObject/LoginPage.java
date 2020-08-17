package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject { 

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	
	
		@FindBy(name = "user[email]")
		private WebElement emailField;

		@FindBy(name = "user[password]")
		private WebElement passwordField;
		
		@FindBy(id = "login")
		private  WebElement submitButton;
		

		
		public WebElement getEmailField() {
			return emailField;
		}
		
		public WebElement getPasswordField() {
			return passwordField;
		}
		
		public WebElement getSubmitButton() {
			return submitButton;
		}
		
	
	
		public void login (String email, String password) {
			driver.get("https://sandbox.coingate.com/login");
			this.getEmailField().clear();
			this.getEmailField().sendKeys(email);  
			this.getPasswordField().clear();
			this.getPasswordField().sendKeys(password);
			this.getSubmitButton().click();
		}
			
		public ButtonsPage submit () {	
			this.getSubmitButton().click();
			return new ButtonsPage (driver);
		}

		
}
	
	
	



