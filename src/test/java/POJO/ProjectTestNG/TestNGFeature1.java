package POJO.ProjectTestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGFeature1 
{
	public static WebDriver driver;
	

	//Commit 6

	//Changed in GIT

	
	@BeforeClass //Should be public
	public void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		System.out.println("=====   BeforeClass  ====");

	}
	
	@BeforeMethod
	private void BeforeMethod() {
		Date d = new Date();
		
		System.out.println("=====   BeforeMethod ======");
		System.out.println("Start Time"+d);

	}
	
	@Test
	private void Test1() {
		System.out.println("=====   Test1  ====");
		WebElement txtBxUserName = driver.findElement(By.id("email"));
		txtBxUserName.sendKeys("Greens");
		Assert.assertEquals("Greens", txtBxUserName.getAttribute("value"));

	}
	
	@Test
	private void Test2() throws InterruptedException {
		System.out.println("=====   Test2  ====");
		WebElement txtBxPassword = driver.findElement(By.id("pas"));
		txtBxPassword.sendKeys("Greens");
		Thread.sleep(3000);

	}
	
	@AfterMethod
	private void AfterMethod() {
		Date d = new Date();
		
		System.out.println("=====   AfterMethod  ====");
		System.out.println("End Time "+d);


	}
	
	@AfterClass //Public
	public void AfterClass() {
		driver.quit();
		System.out.println("=====   AfterClass  ====");

	}
	
	

}
