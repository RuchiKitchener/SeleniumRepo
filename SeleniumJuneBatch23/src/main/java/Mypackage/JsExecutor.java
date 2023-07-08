package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JsExecutor {
	
	static WebDriver driver;
	public static void main(String[] args)  {
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id("hobbies-checkbox-1")));	//Clicking	
		WebElement e1 = driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].setAttribute('value', 'Selenium')", e1); //Send Keys using JS
		js.executeScript("window.scrollBy(0,250)");    // not recommended ,mobile, tablet, ipad 
		WebElement e2 = driver.findElement(By.id("stateCity-label"));
		js.executeScript("arguments[0].scrollIntoView(true);", e2);
		//driver.quit();
	}

}
