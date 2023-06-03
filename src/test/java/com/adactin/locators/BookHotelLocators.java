package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelLocators extends SelectHotelLocators {
	public BookHotelLocators()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getcCNo() {
		return cCNo;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getcCType() {
		return cCType;
	}
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}

	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement billingAddress;
	@FindBy(id="cc_num")
	private WebElement cCNo;
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_type")
	private WebElement cCType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryDate;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id="book_now")
	private WebElement bookNow;
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderNo;
	}
