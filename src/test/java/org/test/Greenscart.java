package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greenscart extends LibGlobal2 {


	@BeforeClass
	public static void beforeclass() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Before
	public void beforemethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}

	@After
	public void aftermethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}
	
	@Test
	public void login() throws IOException {
		
	WebElement txtusername = driver.findElement(By.xpath("(//input[@id='loginEmailId'])[2]"));
	txtusername.sendKeys("Hussain");

		WebElement txtpassword = driver.findElement(By.xpath("(//input[@id='loginPassword'])[2]"));
		txtpassword.sendKeys("Saddam@0891");

		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnlogin.click();
	}

	@AfterClass
	public static void afterclass() {
		//driver.quit();

	}

}
