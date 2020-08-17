package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends PageObject { 

	public MainPage(WebDriver driver) {
		super(driver);	
	}
	
		@FindBy(className = "dashboard-card-title")
		private WebElement accountPage;
	
		@FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle']")
		private WebElement selectOut;

		@FindBy(xpath = "//button[@class='ant-btn ant-btn-sm']")
		private WebElement signOutButton;
		
		
		
		public WebElement getAccountPageTitle() {		
			return accountPage;
		}
	
		public WebElement getSelectOut() {
			return selectOut;
		}
		
		public WebElement getSignOutButton() {
			return signOutButton;
		}
			
	
		
		public void signOut () {
			this.getSelectOut().click();
			this.getSelectOut().click();
		}

		
		

}
	
	
	



