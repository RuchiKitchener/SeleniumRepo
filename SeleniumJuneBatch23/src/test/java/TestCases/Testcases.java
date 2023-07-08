package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ProductsPage;
import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overViewPage;
import Pages.productDetailsPage;
import ReadData.ReadingData;

public class Testcases {
	
	WebDriver driver;
	@BeforeMethod
	public void Before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	
	@Test
	public void loginTest() throws IOException {
		loginPage lp = new loginPage(driver);
		ProductsPage pp = new ProductsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver); //className obj = new className(param);
		cartPage cp = new cartPage(driver);
		infoPage ip = new infoPage(driver);
		overViewPage op = new overViewPage(driver);
		completePage completepage = new completePage(driver);
		lp.enterUsername(new ReadingData().getUsername());
		lp.enterPwd(new ReadingData().getPassword());
		lp.clickLogin();
		pp.clickOnBackPack();
		pdp.clickAddToCart();
		String price = cp.getprice();
		Assert.assertNotEquals(price, "$29.99");
		cp.clickCheckOut();
		ip.enterDetails();
		op.clickFinish();
		String successMsg = completepage.getSuccessMsg();
		Assert.assertEquals(successMsg, "Thank you for your order!"); 		//ExpectedResult=ActualResult
	}
	@Test
	public void getData() throws IOException {
		
		System.out.println(new ReadingData().getFName());
		System.out.println(new ReadingData().getlName());
	}
	
	@AfterMethod
	public void After() {
		driver.quit();
	}

}
