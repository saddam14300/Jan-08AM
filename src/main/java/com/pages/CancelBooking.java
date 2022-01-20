package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends LibGlobal1 {

	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement bookItinerary;
	
		@FindBy(id="order_id_text")
		private WebElement searchboxorderid;
		
		@FindBy(id="search_hotel_id")
		private WebElement btngo;
		
		@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
		private WebElement btncancel;

		public WebElement getBook() {
			return bookItinerary;
		}

		public WebElement getSearchboxorderid() {
			return searchboxorderid;
		}

		public WebElement getBtngo() {
			return btngo;
		}

		public WebElement getBtncancel() {
			return btncancel;
		}

		
		public void cancelBooking(String orderid) {
			click(getBook());
			insertValue(searchboxorderid,orderid);
			click(getBtncancel());
			
			
			
			
		}

		










}
