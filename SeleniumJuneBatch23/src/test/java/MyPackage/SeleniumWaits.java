package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaits {

	@Test
	public void waits() {
		WebDriver driver = new ChromeDriver();        // 1. Implicit wait(universal)
													// 2. Explicit(Certain condition to be met)										
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		WebElement e = driver.findElement(By.id("simpleLink")); 
		wait.until(ExpectedConditions.visibilityOf(e));
		driver.quit();
	}

}
