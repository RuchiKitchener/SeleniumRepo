package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class completePage extends BasePage{
	
	@FindBy(name="back-to-products")
	private WebElement backHome;
	
	@FindBy(className = "complete-header")
	private WebElement completeHeader;
	
	public String getSuccessMsg() {
		return completeHeader.getText();
	}
	
	
	public completePage(WebDriver driver) {
		super(driver);
	}
	
}
