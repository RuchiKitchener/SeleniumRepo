package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder= 'First Name']")).sendKeys("Tenzing");
	Select year = new Select(driver.findElement(By.id("yearbox")));	// ClassNAme objName = new ClassName();
	year.selectByValue("1997");
	year.selectByIndex(4); //1919
	year.selectByVisibleText("2000");
	Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
	month.selectByIndex(3);
	Select day = new Select(driver.findElement(By.id("daybox")));
	day.selectByValue("9");
	driver.quit();
	}

}
