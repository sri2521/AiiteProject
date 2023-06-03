package com.adactin.pageExecution;

import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.LoginPageLocators;
import com.adactin.locators.SearchHotelLocators;

import inst.aiite.baseclass.BaseClass;


public class LoginPageExe extends BookHotelLocators{
	
	public static void username()
	{		
		BaseClass.sendkeys(new LoginPageLocators().getUsername(), BaseClass.propRead("username"));
	}
	
	
	public static void password()
	{		
		BaseClass.sendkeys(new LoginPageLocators().getPassword(), BaseClass.propRead("password"));
	}
	
	public static void login()
	{		
		BaseClass.click_button(new LoginPageLocators().getLogin());
	}

}
