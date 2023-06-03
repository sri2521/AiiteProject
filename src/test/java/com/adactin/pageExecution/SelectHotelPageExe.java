package com.adactin.pageExecution;

import com.adactin.locators.SearchHotelLocators;
import com.adactin.locators.SelectHotelLocators;

import inst.aiite.baseclass.BaseClass;

public class SelectHotelPageExe extends SearchHotelPageExe{
	public static void clickRadioButton()
	{
		
		BaseClass.click_button(new SelectHotelLocators().getClickRadioButton());
	}
	public static void continueButton()
	{
		
		BaseClass.click_button(new SelectHotelLocators().getContinueButton());
	}
}
