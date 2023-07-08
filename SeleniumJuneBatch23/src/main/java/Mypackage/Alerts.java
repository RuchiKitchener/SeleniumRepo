package Mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException { 
		driver = new EdgeDriver();   //Open the browser
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html"); 
		WebElement simple = driver.findElement(By.id("simple"));
		simple.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1200);
		System.out.println(alert.getText()); //Heading of the alert message
		alert.accept();
		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		alert = driver.switchTo().alert();
		Thread.sleep(1200);
		System.out.println(alert.getText());
		alert.accept();
		WebElement input = driver.findElement(By.id("prompt"));
		input.click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hi, this is for automation purpose, Thank you!!");
		Thread.sleep(1200);
		alert.accept();
		driver.quit();
	}

}
