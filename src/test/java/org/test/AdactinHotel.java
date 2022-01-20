package org.test;

	import org.junit.AfterClass;
	import org.junit.Assert;
	import org.junit.BeforeClass;
	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

	public class AdactinHotel extends LibGlobal2 {

		@BeforeClass
		public static void start() {
			launchbrowser("http://adactinhotelapp.com");
			maximize();
		}
		@AfterClass
		public static void end() {
			//closeallwindows();
		}
		@Test
		public void login() throws Exception {
			WebElement txtusername = findelementById("username");
			String getcellvalue = getcellvalue("C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 0);
			sendkeys(txtusername, getcellvalue);
			WebElement txtpassword = findelementById("password");
			String getcellvalue1 = getcellvalue("C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 1);
			sendkeys(txtpassword, getcellvalue1);
			WebElement btnlogin = findelementById("login");
			click(btnlogin);
			
			String currentUrl = getCurrentUrl();
			boolean a = currentUrl.contains("SearchHotel");
			Assert.assertTrue("Verify Search Hotel", a);
			Thread.sleep(1500);
			
			WebElement location = findelementById("location");
			String getcellvalue2 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 2);
			sendkeys(location, getcellvalue2);

			WebElement hotels = findelementById("hotels");
			String getcellvalue3 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 3);
			sendkeys(hotels, getcellvalue3);
			
			WebElement roomtype = findelementById("room_type");
			String getcellvalue4 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 4);
			sendkeys(roomtype, getcellvalue4);

			WebElement noofrooms = findelementById("room_nos");
			String getcellvalue5 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 5);
			sendkeys(noofrooms, getcellvalue5);

			WebElement adult = findelementById("adult_room");
			String getcellvalue6 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 6);
			sendkeys(adult, getcellvalue6);

			WebElement child = findelementById("child_room");
			String getcellvalue7 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\BaseClass\\Excel\\Adactinhotelapp.xlsx", "Hussain", 1, 7);
			sendkeys(child, getcellvalue7);

			WebElement btnsearch = findelementById("Submit");
			click(btnsearch);

			
			String currentUrl1 = getCurrentUrl();
			boolean b = currentUrl1.contains("SelectHotel");
			Assert.assertTrue("Verify Select Hotel", b);
			
			WebElement radiobtn = findelementById("radiobutton_0");
			click(radiobtn);
			WebElement btncontinue = findelementById("continue");
			click(btncontinue);
			
			String currentUrl2 = getCurrentUrl();
			boolean c = currentUrl2.contains("BookHotel");
			Assert.assertTrue("Verify Book Hotel", c);
			
			WebElement txtfirstname = findelementById("first_name");
			String getcellvalue8 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 8);
			sendkeys(txtfirstname, getcellvalue8);
			WebElement txtlastname = findelementById("last_name");
			String getcellvalue9 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 9);
			sendkeys(txtlastname, getcellvalue9);
			WebElement txtaddress = findelementById("address");
			String getcellvalue10 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 10);
			sendkeys(txtaddress, getcellvalue10);
			WebElement txtcc = findelementById("cc_num");
			String getcellvalue11 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 11);
			sendkeys(txtcc, getcellvalue11);
			
			WebElement ctype = findelementById("cc_type");
			String getcellvalue12 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 12);
			sendkeys(ctype, getcellvalue12);
			
			WebElement month = findelementById("cc_exp_month");
			String getcellvalue13 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 13);
			sendkeys(month, getcellvalue13);
			
			WebElement year = findelementById("cc_exp_year");
			String getcellvalue14 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 14);
			sendkeys(year, getcellvalue14);
			
			WebElement cvv = findelementById("cc_cvv");
			String getcellvalue15 = getcellvalue(
					"C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 15);
			sendkeys(cvv, getcellvalue15);
			
			WebElement btnbook = findelementById("book_now");
			click(btnbook);
			Thread.sleep(10000);
			WebElement orderid = findelementById("order_no");
			String orderi = orderid.getAttribute("value");
			System.out.println();
			insertcellvalue("C:\\Users\\Saddu\\eclipse-workspace\\Junit\\Excel\\Adactinhotelapp1.xlsx", "Hussain", 1, 16,orderi);
			
			WebElement order = findelementByxpath("//a[contains(text(),'Booked Itinerary')]");
			click(order);
			
			
			WebElement searchBox = findelementById("order_id_text");
			sendkeys(searchBox, orderi);
			
			WebElement btngo = findelementById("search_hotel_id");
			click(btngo);
			
			WebElement checkbox = findelementByxpath("//input[contains(@value,'Cancel')]");
			click(checkbox);
			
			
			alertAccept();
			
			WebElement element = findelementByxpath("//label[@id='search_result_error']");
			
			String text = getText(element);
			
			assertByText("verify","The booking has been cancelled.",text);
			
		}
			
		}	
