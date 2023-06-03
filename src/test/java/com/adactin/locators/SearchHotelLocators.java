package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocators extends LoginPageLocators{
	
	public SearchHotelLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location; 
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy (id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy (id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildrensPerRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
		public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildrensPerRoom() {
		return ChildrensPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	}
