package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetailsPage extends BasePage{
	
	//1. Page elements 2. page factory 3. page actions
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart_backPack;
	
	@FindBy(name="remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(id="shopping_cart_container")
	private WebElement shoppingCart;
	
	public void clickRemove() {
		remove.click();
	}
	
	public void clickAddToCart() {
		addToCart_backPack.click();
		shoppingCart.click();
	}
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	

}
