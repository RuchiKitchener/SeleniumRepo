package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	Actions act = new Actions(driver);
	WebElement mainMenu = driver.findElement(By.xpath("//a[text()='Interactions ']"));
	WebElement SubMenu = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
	WebElement dest = driver.findElement(By.xpath("//a[text()='Static ']"));
	act.contextClick(mainMenu).perform(); //Right click
	act.moveToElement(mainMenu).moveToElement(SubMenu).moveToElement(dest).click().perform();
	driver.quit();
	}
}
