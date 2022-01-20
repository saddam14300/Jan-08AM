package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends LibGlobal1 {

	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtfirstName;

	@FindBy(id = "last_name")
	private WebElement txtlastName;

	@FindBy(id = "address")
	private WebElement txtaddress;

	@FindBy(id = "cc_num")
	private WebElement ccnumber;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement btnconfirm;

	@FindBy(id = "order_no")
	private WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getTxtfirstName() {
		return txtfirstName;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnconfirm() {
		return btnconfirm;
	}

	public void Confirm(String firstname, String lastname, String address, String cardno, String cardtype, String month,
			String year, String cvv) {

		sendkeys(getTxtfirstName(), firstname);
		sendkeys(getTxtlastName(), lastname);
		sendkeys(getTxtaddress(), address);
		sendkeys(getCcnumber(), cardno);
		sendkeys(getCctype(), cardtype);
		sendkeys(getMonth(), month);
		sendkeys(getYear(), year);
		sendkeys(getCvv(), cvv);
		click(getBtnconfirm());
	}

	public String orderId() {
		String string = getAttribute(getOrderid());
		return string;

	}
}
