package Mypackage;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
	for(WebElement e: headers) {
		System.out.println(e.getText());
	}
	List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']//td"));
	for(WebElement e: allData) {
		System.out.println(e.getText());
	}
	List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
	for(WebElement e: secondColumn) {
		System.out.println(e.getText());
	}
	
	driver.quit();
	}

}
