package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends BasePage{
	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="checkout")
	private WebElement checkOut;
	
	@FindBy(className= "item_pricebar")
	private WebElement price;

	
	public void clickCheckOut() {
		checkOut.click();
	}
	
	public String getprice() {
		return price.getText();
	}
}
