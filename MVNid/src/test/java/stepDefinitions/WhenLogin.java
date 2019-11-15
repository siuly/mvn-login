package stepDefinitions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.Login;
import pageObjects.MyAccountPage;
import pageObjects.WomenArticles;

public class WhenLogin {
	WebDriver driver = SetUpClass.driver;
	Login lg;
	WomenArticles wm;
	MyAccountPage ma;
	/*
	@When("User enters valid Email address {string}")
	public void user_enters_valid_Email_address(String email) {
		//System.out.println("User entered valid Email");
		//driver.findElement(By.id("email")).sendKeys(email);
		lg = new Login(driver);
		lg.sendEmail(email);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
		//System.out.println("User entered valid password");
		//driver.findElement(By.id("passwd")).sendKeys(password);
		lg.sendPass(password);
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User clicked sign in button");
		lg.clickSignIn();
	}
	@When("User enters invalid Email address {string}")
	public void user_enters_invalid_Email_address(String Inemail) {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User entered invalid Email address");
		driver.findElement(By.id("email")).sendKeys(Inemail);
				}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	  //System.out.println("User entered invalid password");
		driver.findElement(By.id("psswd")).sendKeys(password);
	}

	@When("User clicks on  forgot your password?")
	public void user_clicks_on_forgot_your_password() {
	    // Write code here that turns the phrase above into concrete actions
		// System.out.println("User clicked on forgot your password?");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
	}
	@When("User clicks on the image of a product ")
	public void user_clicks_on_the_image_of_a_product () {
	    // Write code here that turns the phrase above into concrete actions
	  //System.out.println("User entered invalid password");
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")).click();
	}
	*/
	@When("User should click on Women")
	public void user_should_click_on_Women () {
		ma = new MyAccountPage(driver);
		ma.clickWomenNav();  
	}
	@When("User add an article")
	public void user_add_an_article(){
		wm = new WomenArticles(driver);
		wm.selectArticle(1);
	}
	
	@When("User click on Proceed to check out")
	public void user_click_on_Proceed_to_check_out(){
		wm.clickProceedTo();
	}
}
