package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo extends TestNGAnnotation{
	
	//@BeforeTest	
	public void Precondition() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@Test(groups= {"Regression"})
	public void test1() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ruchi");
		
	}
	@Test(groups= {"Regression"})
	public void test2() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("231232");
	}
	
	@Test(groups= {"Critical"})
	public void test3() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Jaspreet");
	}
	@Test(groups= {"Critical"})
	public void test4() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("%&*^%#$");
	}

	//@AfterTest
	public void postCondition() {
		driver.quit();
	}
	
}
