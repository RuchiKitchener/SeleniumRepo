package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class overViewPage extends BasePage {
	
	
	
	public overViewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="finish")
	private WebElement finish;
	
	
	public void clickFinish() {
		finish.click();
	}

}
