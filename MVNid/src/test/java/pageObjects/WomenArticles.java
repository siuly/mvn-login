package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenArticles {
	WebDriver driver;
	public WomenArticles(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	List<WebElement> articles;
	
	@FindBy(xpath = "//span[text() = 'Add to cart']")
	List<WebElement> addToCart;
	
	@FindBy(xpath = "//span[contains(text(), 'Proceed to')]")
	WebElement proceedTo;
	
	public void selectArticle(int index) {
		if(index <= articles.size()-1) {
			Actions ac = new Actions(driver);// es una clase que hace varias acciones como arrastrar.
			ac.moveToElement(articles.get(index)).perform();//  gracias a la clase de Actions se pudo usar l moveToElement que hace el hover sobre el producto.
			addToCart.get(index).click();//aqui solo le da click a cualquier articulo sin especificar ya que solo se le puso index y no se especifico.
		}
		else {
			System.out.println("Error");
		}
	}
	public void clickProceedTo() {
		proceedTo.click();
	}
}
