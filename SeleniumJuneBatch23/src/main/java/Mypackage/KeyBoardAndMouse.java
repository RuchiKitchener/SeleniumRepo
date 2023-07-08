package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAndMouse {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new EdgeDriver();   //Open the browser
		driver.get("https://www.scientecheasy.com/2020/01/move-element-in-selenium.html/"); 
		//driver.get("https://demoqa.com/droppable");
		Actions action = new Actions(driver);
		//WebElement start = driver.findElement(By.id("draggable"));
		//WebElement end = driver.findElement(By.id("droppable"));
		//action.dragAndDrop(start, end).perform();
		WebElement mainmenu = driver.findElement(By.xpath("//li/a[text()='Interview']"));
		WebElement submenu = driver.findElement(By.xpath("//a[text()='Java']"));
		WebElement supersub = driver.findElement(By.xpath("(//a[text()='Core Java'])[2]"));
		//action.contextClick();   //Right click 
		//action.doubleClick();
		//action.doubleClick(end); 
		action.moveToElement(mainmenu).moveToElement(submenu).moveToElement(supersub)
		.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
