package com.adactin.pageExecution;


import org.openqa.selenium.WebElement;

import com.adactin.locators.SearchHotelLocators;

import inst.aiite.baseclass.BaseClass;

public class SearchHotelPageExe extends LoginPageExe{
	public static void location()
	{
		WebElement location_element=new SearchHotelLocators().getLocation();
		BaseClass.click_button(location_element);	
		BaseClass.dropDownoptions(location_element);
		BaseClass.selectByVisisbleText(location_element,readsinglevalue(2,0,"Sheet1"));
	}
	public static void hotels()
	{
		WebElement hotel_element=new SearchHotelLocators().getHotels();
		BaseClass.click_button(hotel_element);	
		BaseClass.dropDownoptions(hotel_element);
		BaseClass.selectByVisisbleText(hotel_element,readsinglevalue(3,1,"Sheet1"));
	}
	public static void roomType()
	{
		WebElement roomType_element=new SearchHotelLocators().getRoomType();
		BaseClass.click_button(roomType_element);	
		BaseClass.dropDownoptions(roomType_element);
		BaseClass.selectByVisisbleText(roomType_element,readsinglevalue(2,2,"Sheet1"));
	}
	public static void noOfRooms()
	{
		WebElement noOfRooms_element=new SearchHotelLocators().getNoOfRooms();
		BaseClass.click_button(noOfRooms_element);	
		BaseClass.dropDownoptions(noOfRooms_element);
		BaseClass.selectByVisisbleText(noOfRooms_element,readsinglevalue(1,5,"Sheet1"));
	}
	public static void checkIn()
	{
		
		BaseClass.sendkeys(new SearchHotelLocators().getCheckInDate(), readsinglevalue(1,3,"Sheet1"));
	}
	public static void checkOut()
	{
		
		BaseClass.sendkeys(new SearchHotelLocators().getCheckOutDate(), readsinglevalue(1,4,"Sheet1"));
	}
	public static void adults()
	{
		WebElement adults_element=new SearchHotelLocators().getAdultsPerRoom();
		BaseClass.click_button(adults_element);	
		BaseClass.dropDownoptions(adults_element);
		BaseClass.selectByVisisbleText(adults_element,readsinglevalue(2,14,"Sheet1"));
	}
	public static void children()
	{
		WebElement children_element=new SearchHotelLocators().getChildrensPerRoom();
		BaseClass.click_button(children_element);	
		BaseClass.dropDownoptions(children_element);
		BaseClass.selectByVisisbleText(children_element,readsinglevalue(2,15,"Sheet1"));
		
	}
	public static void search()
	{
		
		BaseClass.click_button(new SearchHotelLocators().getSearch());
	}


}
