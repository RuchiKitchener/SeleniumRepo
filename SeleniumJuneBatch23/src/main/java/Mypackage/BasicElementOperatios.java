package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicElementOperatios {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); //Enter key in our keyboard
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();
		driver.findElement(By.id("password")).submit();// Pressing the enter key
		System.out.println(s);
		boolean x = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed(); //true or false
		System.out.println(x);
		
		driver.quit(); // close the browser
	}

}
