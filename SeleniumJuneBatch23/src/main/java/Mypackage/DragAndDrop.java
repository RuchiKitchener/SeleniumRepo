package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions; //Mouse related actions 

public class DragAndDrop {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/droppable");
	Actions actions = new Actions(driver); //ClassName obj = new ClassName();
	WebElement start = driver.findElement(By.id("draggable"));
	WebElement end = driver.findElement(By.id("droppable"));
	actions.dragAndDrop(start, end).perform();
	driver.quit();
	}

}
