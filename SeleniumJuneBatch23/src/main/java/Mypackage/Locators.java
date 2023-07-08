package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");   //8 ways
		driver.findElement(By.id("user-name"));
		driver.findElement(By.name("user-name"));
		driver.findElement(By.className("login-box"));
		driver.findElement(By.tagName("title"));
		driver.findElement(By.cssSelector("input#login-button"));    //1. tagname#id   
		driver.findElement(By.cssSelector("input.btn_action"));   //2. tagname.class
		driver.findElement(By.linkText("English"));
		driver.findElement(By.partialLinkText("Engl"));
		driver.findElement(By.xpath("//span[@class='title']"));      //tagname[@attributeName = 'AttributeValue']																		//tagname[text()='sometext']
	}
}
