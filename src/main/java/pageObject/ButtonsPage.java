package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ButtonsPage extends PageObject { 

	public ButtonsPage(WebDriver driver) {
		super(driver);	
	}
	
	
	
//for test - should_be_able_to_open_PaymentButtonsPage 
		@FindBy(xpath = "//h2[contains(text(),'Payment Buttons')]")
		private WebElement paymentButtonTitle;
		
		public WebElement getPaymentButtonTitle  () {
			return paymentButtonTitle;
		}
		
		
//for test - should_be_able_to_create_an_invoice() 		
		@FindBy(linkText = "MyTitle")
		private WebElement buttonTitle;
		
		@FindBy(tagName = "button") 
		private WebElement checkoutButton;
		
		@FindBy(className = "currency-card-currency-title")
		private WebElement BitcoinCurrency;
		
		@FindBy(id = "invoice-checkout-button")
		private WebElement payWithBitcoin;
		
		
		@FindBy(xpath = "//div[@class='ant-row']//div[1]//button[1]")
		private WebElement payMarkPayed;
		
		@FindBy(xpath = "//h2[contains(text(),'Paid and Confirmed')]")
		private WebElement confirmationMessage;
		
		
		public WebElement getButtonTitle () {
			return buttonTitle;
		}
		
		public WebElement getCheckoutButton () {
			return  checkoutButton;
		}	
		
		public WebElement getBitcoinCurrency () {
			return BitcoinCurrency;
		}
			
		public WebElement getPayWithBitcoin() {
			return payWithBitcoin;
		}
				
		public WebElement getMarkAsPayed() {
			return payMarkPayed;
		}
				
		public WebElement getFinalConfirmationMessage () {
			return confirmationMessage;
		}
	

	public void create () throws InterruptedException {		
		driver.get("https://dashboard-sandbox.coingate.com/account/buttons");
		this.getButtonTitle().click(); 
		this.getCheckoutButton().click();
		this.getBitcoinCurrency().click(); 
		this.getPayWithBitcoin().click(); 
		this.getMarkAsPayed().click(); 
	}

	
}	


