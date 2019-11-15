package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;
import pageObjects.Login;


public class GivenLogin {
	public WebDriver driver = SetUpClass.driver;
	HomePage hp;//esto es una instancia
	Login lg;
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		driver = new ChromeDriver(); 
	    //System.out.println("Browser is open!!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	@Given("User navigate to the following page {string}")
	public void user_navigate_to_the_following_page(String mainPage) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("http://automationpractice.com/index.php");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("User clicks on sign in")
	public void user_clicks_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User clicked on sing in button");
		hp = new HomePage(driver);// aqui se inicializa una instancia 
		hp.clickOnSignIn();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Given ("User should be logged")
	public void user_should_be_logged() {
		hp = new HomePage(driver);
		hp.clickOnSignIn();
		lg = new Login(driver);
		lg.loginToPage();
	}
}
