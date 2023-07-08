package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class infoPage extends BasePage {
	
	@FindBy(id = "first-name")
	private WebElement fName;
	
	@FindBy(id="last-name")
	private WebElement lName;
	
	@FindBy(name="postalCode")
	private WebElement pCode;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public void enterDetails() {
		fName.sendKeys("Priya");
		lName.sendKeys("Sharma");
		pCode.sendKeys("3123432");
		cont.click();
	}

	public infoPage(WebDriver driver) {
		super(driver);
	}
	
}
