package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();	
	WebElement e = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(e);
	WebElement e1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(e1.getText());
	driver.switchTo().defaultContent();
	driver.get("https://demoqa.com/nestedframes");
	WebElement parentFrame = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(parentFrame);
	WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc]"));
	driver.switchTo().frame(childFrame);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(parentFrame);
	driver.quit();
	}

}
