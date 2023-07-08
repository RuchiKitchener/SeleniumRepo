package Mypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();   //Open the browser
		driver.get("https://demoqa.com/browser-windows");
		WebElement newtab = driver.findElement(By.id("tabButton"));
		newtab.click();
		Set<String> windows = driver.getWindowHandles(); // it will all active ==2
		String Secondwindow = (String)windows.toArray()[1];
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		String parentWindow = (String)windows.toArray()[0]; //parent window
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(Secondwindow);
		driver.quit();
	}

}
