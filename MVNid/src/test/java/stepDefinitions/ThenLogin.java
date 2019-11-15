package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenLogin {
	WebDriver driver = SetUpClass.driver;

	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User gets profile page");
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account", "Error");
		//driver.quit();
	}
	@Then("User should be at the forgot your password page")
	public void user_should_be_at_the_forgot_your_password_view() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User gets forgot your password page");
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=password", "Error");
	}
	@Then("User should get an error message for invalid password{string}")
	public void user_should_get_an_error_message_for_invalid_password(String InPassword) {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User gets error message for invalid password");
		String error1 = driver.findElement(By.xpath("//div[@class =  'alert alert-danger']//child::ol//child::li")).getText();
		error1.equals(InPassword);
	}
	@Then("User should get an error message for invalid email{string}")
	public void user_should_get_an_error_message_for_invalid_email(String InEmail) {
		 // Write code here that turns the phrase above into concrete actions
		//System.out.println("User gets error message for invalid password");
		String error2 = driver.findElement(By.xpath("//div[@class =  'alert alert-danger']//child::ol//child::li")).getText();
		error2.equals(InEmail);
			}
	@Then("User should get an error message {string}")
	public void user_should_get_an_error_message(String EmptyEmail) {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println("User gets error message for empty fields");
		String error3 = driver.findElement(By.xpath("//div[@class =  'alert alert-danger']//child::ol//child::li")).getText();  
		error3.equals(EmptyEmail);
	}

	
}
