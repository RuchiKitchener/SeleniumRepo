package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleDatePicker {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new EdgeDriver();   //Open the browser
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"); 
		datePicker("30", "February", "2024");
		driver.quit();
	}

	public static String[] getMonthYear(String month_year) {
		return month_year.split(" ");
	}
	
	public static void datePicker(String date, String month, String year) throws InterruptedException {
	driver.findElement(By.id("datepicker")).click();
	String month_year = driver.findElement(By.className("ui-datepicker-title")).getText();
	if(month.equals("February") && Integer.parseInt(date)>29) {
		System.out.println("Please enter correct date and month"+ date+ " " + month);
	}
	while(!(getMonthYear(month_year)[0].equals(month) && getMonthYear(month_year)[1].equals(year))) {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		month_year = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(month_year);		
	}
	driver.findElement(By.xpath("//a[text()="+date+"]")).click();
	}
}
