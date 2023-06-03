package com.adactin.pageExecution;

import org.openqa.selenium.WebElement;

import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.SearchHotelLocators;

import inst.aiite.baseclass.BaseClass;

public class BookHotelPageExe extends SelectHotelPageExe{

	public static void firstName()
	{
		BaseClass.sendkeys(new BookHotelLocators().getFirstName(), readsinglevalue(1,6,"Sheet1"));
	}
	public static void lastName()
	{
		BaseClass.sendkeys(new BookHotelLocators().getLastName(), readsinglevalue(1,7,"Sheet1"));
	}
	public static void billingAddress()
	{
		
		BaseClass.sendkeys(new BookHotelLocators().getBillingAddress(), readsinglevalue(1,8,"Sheet1"));
	}
	public static void cCNo()
	{
		
		BaseClass.sendkeys(new BookHotelLocators().getcCNo(), readsinglevalue(1,9,"Sheet1"));
	}
	public static void cCType()
	{
		WebElement cCtype_element=new BookHotelLocators().getCc_type();
		BaseClass.click_button(cCtype_element);	
		BaseClass.dropDownoptions(cCtype_element);
		BaseClass.selectByVisisbleText(cCtype_element,readsinglevalue(1,10,"Sheet1"));
		
	}
	public static void expiryDate()
	{
		WebElement expiryDate_element=new BookHotelLocators().getExpiryDate();
		BaseClass.click_button(expiryDate_element);	
		BaseClass.dropDownoptions(expiryDate_element);
		BaseClass.selectByVisisbleText(expiryDate_element,readsinglevalue(1,11,"Sheet1"));
		
	}
	public static void expiryYear()
	{
		WebElement expiryYear_element=new BookHotelLocators().getExpiryYear();
		BaseClass.click_button(expiryYear_element);	
		BaseClass.dropDownoptions(expiryYear_element);
		BaseClass.selectByVisisbleText(expiryYear_element,readsinglevalue(1,12,"Sheet1"));
	}
	public static void cvvNumber()
	{
		
		BaseClass.sendkeys(new BookHotelLocators().getCvvNumber(), readsinglevalue(1,13,"Sheet1"));
	}
	public static void bookNow()
	{
		
		BaseClass.click_button(new BookHotelLocators().getBookNow());
	}
	public static void orderNo()
	{
		String orderNumber = BaseClass.getAttribute(new BookHotelLocators().getOrderNo());
		BaseClass.excelWrite(orderNumber,"orderNumber");
		System.out.println(orderNumber);
		
	}
}
