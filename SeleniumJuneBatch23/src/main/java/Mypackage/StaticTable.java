package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaticTable {
	static WebDriver driver;
	
	@BeforeTest
	public void before() {
		driver = new EdgeDriver(); // ClassName obj = new ClassName();
		driver.get("C:\\Users\\EB933HU\\OneDrive - EY\\Desktop\\table.html"); //faster
	}

	@Test
	public void validateHeaders() {
		List<WebElement> header = driver.findElements(By.xpath("//table[@name='Table']//th"));
		for(WebElement e: header) {
			System.out.println(e.getText());
			if(e.getText()=="Subject") {
				Assert.assertTrue(true);
			}
		}
		
	}
	
	@Test
	public void validateRows() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='Table']//tr"));
		System.out.println(rows.size());
	}
	
	@Test
	public void validateTableData() {
		List<WebElement> data = driver.findElements(By.xpath("//table[@name='Table']//td"));
		for(WebElement e: data) {
			if(e.getText()=="2000") {
				Assert.assertTrue(true);
			}
		}
	}
	
	@AfterTest
	public void After() {
		driver.quit();
	}
}
