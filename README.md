
Creating happy path of automated test for Coingate invoice page
=================================================

Requirements
------------
- Java as the programming language
- Eclipse IDE for Enterprise JAVA Developers 
- TestNG as the assertion framework
- Maven as the build tool
- Chrome Webdriver 
- Visual Studio Code (VSC) 


Creating a project in Eclipse
--------------------------
Create a new Maven project with name Coingate_task, use TestNG automation testing framework.
Do as shown here:
https://www.youtube.com/watch?v=sNEcpw8LPpo
and here:
https://www.guru99.com/all-about-testng-and-selenium.html#5

1. Create a package with name pageObject. 
2. Create a WebDriver’s PageFactory superclass to initialize WebElements and write this code:

```bash
	protected WebDriver driver;
	
	public PageObject (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
```
  
 3. Create 3 Page Objects for: 1) login page; 2) account page; 3) buttons page. 
 
 4. In all 3 PageObject classes write constructor which takes a WebDriver object and passes it on to its superclass constructor. 
 ```bash
 public ButtonsPage(WebDriver driver) {
  		super(driver);	
	  }
```
  
### Describe WebElements and Methods in PageObjects

    
 1. Describe WebElements of each page - how to find and reach them. 
  For example in loginPage:
  
  ```bash
  @FindBy(name = "user[email]")
		private WebElement emailField;
    
    public WebElement getEmailField() {
		return emailField;
	}

```

2. Create methods to do in each page.

- In LoginPage.java describe two methods:
```bas
     public void login (String email, String password) {
			driver.get("https://sandbox.coingate.com/login");
			this.getEmailField().clear();
			this.getEmailField().sendKeys(email);  
			this.getPasswordField().clear();
			this.getPasswordField().sendKeys(password
      );
		
```

```bash
    public ButtonsPage submit () {	
			this.getSubmitButton().click();
			return new ButtonsPage (driver);
		}
```    
    
 
 - In MainPage.java describe one method:
```bash
	public void signOut () {
			this.getSelectOut().click();
			this.getSelectOut().click();
		}
``` 

    
 - In ButonsPage.java describe one method:
 ```bash
  	public void create () {		
		driver.get("https://dashboard-sandbox.coingate.com/account/buttons");
		this.getButtonTitle().click(); 
		this.getCheckoutButton().click();
		this.getBitcoinCurrency().click(); 
		this.getPayWithBitcoin().click(); 
		this.getMarkAsPayed().click(); 
	}
```

  
###  Writing tests

  
 1. Create another package called Tests.java and a class inside with name Test_Invoice.java.
 
 - Insert @Test annotations and import the package org.testng.annotations;
 - In @BeforeClass annotation create class variables to reach the methods described in each class:
```bash
    login = new LoginPage (driver);
    create = new ButtonsPage(driver);
    main = new MainPage (driver);
```
  
  2. Create 3 tests with priorities:
  
  - priority = 0 - checks ability to login;
  - priority = 1 - cecks ability to open paymentButtons page
  - priority = 2 - checks ability to create an invoice
   
   In each test describe methods to do (written in PageObjects) and insert an assertion to compare real value to expected value.
