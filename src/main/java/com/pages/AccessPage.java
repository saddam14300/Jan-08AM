package com.pages;

import java.io.IOException;

import org.bouncycastle.jcajce.provider.keystore.BC;
import org.bouncycastle.operator.bc.BcAESSymmetricKeyUnwrapper;
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

public class AccessPage extends LibGlobal1 {


	@BeforeClass
	public static void beforeclass() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void login() throws Exception{
		
		LoginPage page = new LoginPage();
		page.login("saddam143000","D75C6F");
		
	SearchHotelPage hotelPage = new SearchHotelPage();
	hotelPage.SearchHotels("New York", "Hotel Sunshine", "Super Deluxe", "1 - One", "15/01/2022", "16/01/2022", "1 - One", "1 - One");
		
	SelectHotelPage select = new SelectHotelPage();
	select.SelectHotel();
	
	BookingConfirm Bc = new BookingConfirm();
	Bc.Confirm("SADDAM", "HUSSAIN", "NAWAB NAGAR, VISAKHAPATNAM", "1234567891234567", "VISA", "january", "2022", "555");
	
	Thread.sleep(8000);
	
	WebElement id = Bc.findelementById("order_no");
	String data = id.getAttribute("value");
	
	CancelBooking cancel = new CancelBooking();
	
	cancel.cancelBooking(data);
	
	Bc.alertAccept();
	}
	
	
	
	
	
	
	
	
}	
		
		
		
	
		
		
		
		
		
//		WebElement txtusername = driver.findElement(By.xpath("(//input[@id='loginEmailId'])[2]"));
//		txtusername.sendKeys("Hussain");
//
//		WebElement txtpassword = driver.findElement(By.xpath("(//input[@id='loginPassword'])[2]"));
//		txtpassword.sendKeys("Saddam@0891");
//
//		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
//		btnlogin.click();
//	}

//	@AfterClass
//	public static void afterclass() {
//		//driver.quit();

//	}
//
//}
