package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe"); 
		WebDriver d = new ChromeDriver();   //Open the browser
		d.get("https://demoqa.com/checkbox");  //1. 
		d.findElement(By.cssSelector("span.rct-checkbox")).click();
		Thread.sleep(1000);
		boolean b = d.findElement(By.cssSelector("span.rct-checkbox")).isEnabled();
		System.out.println(b);  
//
//		String s = d.getTitle(); System.out.println(s); String url =
//				d.getCurrentUrl(); String html = d.getPageSource(); System.out.println(url);
//				System.out.println(html);
//				String s = d.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();
//				System.out.println(s);
//						d.findElement(By.name("user-name")).sendKeys("standard_user");
//						d.findElement(By.name("user-name")).sendKeys("standard_user");
//						d.findElement(By.name("password")).sendKeys("secret_sauce");
//						d.findElement(By.name("login-button")).submit();
//						d.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//						d.findElement(By.className("shopping_cart_badge")).click();
//						d.findElement(By.cssSelector("button#checkout")).click();	// tagname.classname, tagname#id 
//						d.findElement(By.tagName("title"));

				d.quit();  //close the browser
	}
}
