package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocators extends SearchHotelLocators{
	
	public SelectHotelLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement clickRadioButton;
	public WebElement getClickRadioButton() {
		return clickRadioButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(id="continue")
	private WebElement continueButton;
}
