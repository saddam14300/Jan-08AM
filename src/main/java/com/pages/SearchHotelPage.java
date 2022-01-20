package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.test.LibGlobal2;

public class SearchHotelPage extends LibGlobal1 {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;

	@FindBy(id="room_type")
	private WebElement dDRoomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement dDnadultRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDRoomType() {
		return dDRoomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnadultRoom() {
		return dDnadultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void SearchHotels(String location, String hotels, String roomType, String noofRooms, String Checkin, String Checkout, String adultPerRoom, String childrenPerRoom) {

		sendkeys(getdDnLocation(), location);
		sendkeys(getdDnHotels(), hotels);
		sendkeys(getdDRoomType(), roomType);
		sendkeys(getNoOfRooms(), noofRooms);
		sendkeys(getTxtCheckIn(), Checkin);
		sendkeys(getTxtCheckOut(), Checkout);
		sendkeys(getdDnadultRoom(), adultPerRoom);
		sendkeys(getdDnChildRoom(), childrenPerRoom);
		click(getBtnSearch());
		
	}
}	
	
	
	
