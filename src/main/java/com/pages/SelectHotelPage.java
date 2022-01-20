package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal1 {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(name="radiobutton_0")
		private WebElement rdnbutton;
		
		@FindBy(name="continue")
		private WebElement clickcntinue;

		public WebElement getRdnbutton() {
			return rdnbutton;
		}

		public WebElement getClickcntinue() {
			return clickcntinue;
		}
		
		public void SelectHotel() throws Exception {
			click(getRdnbutton());
			click(getClickcntinue());
		}
		
		
		
}
