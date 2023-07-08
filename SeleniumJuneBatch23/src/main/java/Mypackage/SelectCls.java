package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new EdgeDriver();   //Open the browser
		d.get("https://demoqa.com/select-menu");  //1.
		WebElement e = d.findElement(By.name("cars"));
		Select select = new Select(e);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByVisibleText("Audi");
		select.selectByValue("opel");
		select.deselectByIndex(1);
		List<WebElement> e2 = select.getAllSelectedOptions();
		boolean a = select.isMultiple();
		System.out.println(a);
		Thread.sleep(2000);
		d.quit();
	}

}
