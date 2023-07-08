package Mypackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleWebTable {
	WebDriver driver;
	
	@Test
	public void verifyHeaders() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.findElement(By.id("customers")); // whole table
		List<WebElement> list = driver.findElements(By.xpath("//tbody//tr//th"));  // 5 headers
		for(WebElement e: list) {   
			if(e.getText().equalsIgnoreCase("Status")) {
				Assert.assertTrue(true);
			}
		}		
	}
		@Test
		public void verifyRowcount() {
			driver= new EdgeDriver();
			driver.get("http://seleniumpractise.blogspot.com/");
			driver.findElement(By.id("customers")); // whole table
			List<WebElement> list2 = driver.findElements(By.xpath("//tbody//tr"));  // 5 headers
			System.out.println(list2.size());
		}



}
