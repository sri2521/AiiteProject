package com.adactin.finaExe;

import com.adactin.pageExecution.BookHotelPageExe;

public class HotelProjectExe extends BookHotelPageExe{

	public static void main(String[] args) {
		launchingBrowser("chrome");
		urllaunch(propRead("URL"));
		maximizeWindowSize();
		username();
		password();
		login();
		location();
		hotels();
		roomType();
		noOfRooms();
		checkIn();
		checkOut();
		adults();
		children();
		search();
		clickRadioButton();
		continueButton();
		firstName();
		lastName();
		billingAddress();
		cCNo();
		cCType();
		expiryDate();
		expiryYear();
		cvvNumber();
		bookNow();
		implicitWait(10000);
		orderNo();
		closeWindow();
	}

}
