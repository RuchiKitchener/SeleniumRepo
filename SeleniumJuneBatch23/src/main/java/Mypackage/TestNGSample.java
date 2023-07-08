package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGSample {	
	
	WebDriver driver;
	@Parameters({"url", "time"})
	@BeforeTest
	public void setup(String url, int time) {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	@AfterTest
	public void done() {
		driver.quit();
	}
	@Parameters({"username", "password"})
	@Test(groups= {"Regression"})
	public void test1(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@Test(groups= {"Regression"})
	public void test2() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce12");
	
	}

	@Test(groups= {"smoke"})
	public void test3() {
		driver.findElement(By.id("user-name")).sendKeys("standard_u232");
		driver.findElement(By.id("password")).sendKeys("secret_sauce232");
		
	}
	
}
