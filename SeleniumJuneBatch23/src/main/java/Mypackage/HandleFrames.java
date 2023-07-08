package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/nestedframes");
		WebElement parent = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parent);
		WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc]"));
		driver.switchTo().frame(child);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
