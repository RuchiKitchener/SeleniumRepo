package MyPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
				//   3. Where to save
		TakesScreenshot scrShot =((TakesScreenshot)driver); // 1. take screen
        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); // 2. Which file format(.png)
            //Move image file to new destination
                File DestFile=new File("C:\\Users\\PC\\work\\SeleniumJuneBatch23\\Screenshots\\"+getDateTime()+"SC"+".png");
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
                driver.quit();
	}
	
	public static String getDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
	    Date date = new Date();  
	    return formatter.format(date);  
	}

}
