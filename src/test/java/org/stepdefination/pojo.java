package org.stepdefination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends baseclass{
	public pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "i-icon-profile")
	private WebElement icon;
	@FindBy(xpath = "//li[@class='config-options ']" )
	private WebElement signin;
	@FindBy(id = "mobileNoInp")
	private WebElement num;
	@FindBy(xpath = "//input[@tabindex='1']")
	private WebElement from;
	@FindBy(xpath = "//li[text()='Erode']")
	private WebElement erode;
	@FindBy(xpath = "//input[@tabindex='2']")
	private WebElement to;
	@FindBy(xpath = "//li[text()='Bangalore']")
	private WebElement ban;
	@FindBy(xpath = "//input[@tabindex='3']")
	private WebElement date;
	public WebElement getFrom() {
		return from;
	}
	public WebElement getErode() {
		return erode;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getBan() {
		return ban;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath = "//td[text()='20']")
	private WebElement day;
	@FindBy(xpath = "//button[@class='fl button']")
	private WebElement search;
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getNum() {
		return num;
	}	
	@FindBy(xpath = "//input[@placeholder='BOARDING POINT']")
	private WebElement board;
	@FindBy(xpath = "//label[@title='Erode Bypass']")
	private WebElement ero;
	@FindBy(xpath = "//div[text()='APPLY']")
	private WebElement app;
	public WebElement getBoard() {
		return board;
	}
	public WebElement getEro() {
		return ero;
	}
	public WebElement getApp() {
		return app;
	}
	@FindBy(xpath = "//input[@placeholder='DROPPING POINT']")
	private WebElement drop;
	@FindBy(xpath = "//label[@title='Bommanahalli']")
	private WebElement bom;
	@FindBy(xpath = "//div[text()='APPLY']")
	private WebElement apply;
	public WebElement getDrop() {
		return drop;
	}
	public WebElement getBom() {
		return bom;
	}
	public WebElement getApply() {
		return apply;
	}
	@FindBy(xpath = "//div[@class='button view-seats fr']")
	private WebElement seat;
	public WebElement getSeat() {
		return seat;
	}
	@FindBy(xpath = "//canvas[@data-type='upper']")
	private WebElement busseat;
	public WebElement getBusseat() {
		return busseat;
	}
}
