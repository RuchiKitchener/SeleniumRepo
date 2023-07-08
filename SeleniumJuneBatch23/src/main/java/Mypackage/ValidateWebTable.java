package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateWebTable {
	WebDriver driver;
	 
	 @BeforeTest
	 public void Before() {
		driver = new EdgeDriver(); // Open the browser  
	 }
	
	@Test(description = "this is a test case-1", priority=3)
	public void test1() {
		driver.get("https://www.saucedemo.com");
	}
	
	@Test(timeOut=5000)
	public void test2() {
			driver.get("https://www.google.com");
	}
	@Test(priority=2)
	public void test3() {   
			driver.get("https://www.yahoo.com");
	}
	@Test
	public void test4() {
			driver.get("https://www.bing.com");
	}
	
	@Test()
	public void test5() {
			driver.get("https://www.saucedemo.com");
	}

	@AfterTest
	public void After() {
		driver.quit();
	}
}
