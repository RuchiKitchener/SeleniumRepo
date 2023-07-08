package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("C:/Users/PC/Desktop/Register.html");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//h1[text()='Website Title']")).click();
		driver.findElement(By.xpath("//input")).sendKeys("Mango"+Keys.BACK_SPACE+Keys.BACK_SPACE+Keys.NUMPAD5);
		act.sendKeys(Keys.ENTER);//Keyboard
		//driver.quit();
	}

}
