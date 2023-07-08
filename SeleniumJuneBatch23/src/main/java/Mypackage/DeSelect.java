package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.name("cars")));
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.deselectAll();

	}

}
