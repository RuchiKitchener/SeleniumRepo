package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.navigate().back(); //back 
		driver.navigate().forward(); // forward
		driver.navigate().refresh(); //refresh or F5
		driver.quit(); //Close browser
	}

}
