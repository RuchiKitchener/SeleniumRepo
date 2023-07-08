package Mypackage;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DropDown {
	public static WebDriver driver;  //Reference variablce 
	public static void main(String[] args) throws IOException{
		driver = new ChromeDriver(); // ClassName obj = new ClassName();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html"); //faster
		WebElement e = driver.findElement(By.id("simple"));
		TakesScreenshot ts= (TakesScreenshot)driver;	
		File file = e.getScreenshotAs(OutputType.FILE);
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("./element.png"));
		Files.copy(file1, new File("./fullpage.png"));
		driver.quit();
	}
}
