package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ButtonsPage extends PageObject { 

	public ButtonsPage(WebDriver driver) {
		super(driver);	
	}
	

		@FindBy(className = "dashboard-card-title")
		private WebElement quickStart;
		
		public WebElement getCardTitle() {
			return quickStart;
		}
	
		
		@FindBy(xpath = "//h2[contains(text(),'Paid and Confirmed')]")
		private WebElement confirmation;
		
		public WebElement getConfirmation() {
			return confirmation;
		}
		
		
		
		@FindBy(tagName = "a")
		private WebElement buttonTitle;
		
		public WebElement getButtonTitle () {
			return buttonTitle;
		}
		
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") 
		private WebElement checkoutButton;
		
		public WebElement getCheckoutButton () {
			return  checkoutButton;
		}
		
		@FindBy(xpath = "//*[@id=\"payment-new\"]/div[1]/div/div/div[1]/div/div[2]")
		private WebElement BitcoinCurrency;
		
		public WebElement getBitcoinCurrency () {
			return BitcoinCurrency;
		}
		
		
		@FindBy(id = "invoice-checkout-button")
		private WebElement payWithBitcoin;
		
		public WebElement getPayWithBitcoin() {
			return payWithBitcoin;
		}
		
		
		@FindBy(xpath = "//div[@class='ant-row']//div[1]//button[1]")
		private WebElement payMarkPayed;
		
		public WebElement getMarkAsPayed() {
			return payMarkPayed;
		}
				
		
		@FindBy(xpath = "//h2[contains(text(),'Paid and Confirmed')]")
		private WebElement confirmationMessage;
		
		public WebElement getFinalConfirmationMessage () {
			return confirmationMessage;
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
		
		

	public void create () {
		driver.get("https://sandbox.coingate.com/login");
		this.getEmailField().sendKeys("niaringa@gmail.com");  
		this.getPasswordField().sendKeys("Password9*");
		this.getSubmitButton().click();
		this.getButtonTitle().click(); 
		this.getCheckoutButton().click();
		this.getBitcoinCurrency().click(); 
		this.getPayWithBitcoin().click(); 
		this.getMarkAsPayed().click(); 
	}




}	


