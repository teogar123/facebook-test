package com.tecgurus.utils;

import org.openqa.selenium.By;

public class Locators {

	public static final By SEARCH_BOX_ID = By.id("navbar-query");
	public static final By SEARCH_BUTTON_ID = By.id("navbar-submit-button");
	public static final CharSequence ESO_MOVIE_INI = ("IT");
	public static final By MOVIE_RESULT_LIST = By.xpath("//h3[contains(text(),'Titles')]/following-sibling::table//tr");
	public static final By MOVIE_LINK_XPATH = By.xpath(".//a");
	public static final String RICHARD_LOCATOR = ("//table[@class='cast_list']//span[text()='Richard Thomas']");
	public static final String TIM_LOCATOR = ("//table[@class='cast_list']//span[text()='Tim Reid']");
	public static final String ANNETTE_LOCATOR = ("//table[@class='cast_list']//span[text()='Annette O'Toole']");
	public static final String FULL_CAST = ("//a[contains(text(), 'full cast')]");
	public static final String ROYAL_LOGIN_BUTTON = ("//*[@data-testid='royal_login_button']");
	public static final String FB_EMAIL_BOX = ("//input[@type='email']");
	public static final String FB_PASSBOX = ("//*[@data-testid='royal_pass']");
	public static final String FACEBOOK_SEARCHBOX = ("//*[@placeholder='Busca en Facebook']");
	public static final String FACEBOOK_SEARCHBUTTON = ("//i[@class='_585_']");
	public static final String TEDDY_PROFILE = ("//div[@class='_1k67 _4q39']");
	
	
	

	
	
}
