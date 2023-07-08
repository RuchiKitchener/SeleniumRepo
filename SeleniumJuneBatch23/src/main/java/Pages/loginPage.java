package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {
	
	//1. Page Elements 2. Page actions 3. Page Factory(Collection of webElements) POM
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="user-name")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	public void enterUsername(String str) {
		userName.sendKeys(str);
	}
	
	public void enterPwd(String str) {
		pwd.sendKeys(str);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
}
