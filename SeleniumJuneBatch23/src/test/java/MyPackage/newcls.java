package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class newcls {

	@Test(enabled=false,invocationCount=2, priority=1)
	public void xyz() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");		
		driver.quit();
	}
	
	@Test(timeOut = 7000, description = "this is a special regression tests", priority=2)
	public void vip() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}
	
	@Test(priority=3, dependsOnMethods= {"vip"}, groups= {"Regression"})
	public void abc() {
		System.out.println("TestCase");
	}
	
	

}
