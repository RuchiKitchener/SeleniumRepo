package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement backPack;
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addtoCart_backPack;
	
	@FindBy(xpath= "//div[text()='29.99']")
	private WebElement backPack_price;
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack_item;

	
	public void clickOnBackPack() {
		backPack_item.click();
	}
	
	public void clickBackPack() {
		backPack.click();
	}
	
	public void AddToCart_backPack() {
		addtoCart_backPack.click();
	}
	
	public String getPrice() {
		return backPack_price.getText();
	}
	

}
