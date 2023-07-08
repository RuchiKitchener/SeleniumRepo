package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNGAnnotation {
	
	WebDriver driver;
	@BeforeClass
	public void Before() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@AfterClass
	public void After() {
		driver.quit();
	}
}
