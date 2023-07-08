package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d = new EdgeDriver();   //Open the browser
		d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");  //1. 
		datePicker("28", "February", "2026");	
		d.quit();
		}
	
	
	public static String[] getDateYear(String dateYear) {
		return dateYear.split(" ");
	}
	
	public static void datePicker(String expectedDate,String month, String year) throws InterruptedException {
	
		d.findElement(By.id("datepicker")).click();
		String month_year = d.findElement(By.className("ui-datepicker-title")).getText();  //current  month and year
		while(!(getDateYear(month_year)[0].equals(month) && getDateYear(month_year)[1].equals(year))) {
			d.findElement(By.xpath("//a[@title='Next']")).click();
			month_year = d.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(month_year);
			int y = Integer.parseInt(year);
			if(y%4==0 && y%400==0 && month =="February") { 
				expectedDate = "29";
			}
		}
		d.findElement(By.xpath("//a[text()="+expectedDate+"]")).click();	
	}
}
