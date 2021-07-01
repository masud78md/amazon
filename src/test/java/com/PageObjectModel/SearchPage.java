package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.lu.wann;

public class SearchPage {

	public WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchItem;

	public void itemName(String tt) throws Throwable {
		searchItem.sendKeys(tt);

	}

	@FindBy(id = "nav-search-submit-button")
	WebElement searchClick;

	public void searchClk() {
		searchClick.submit();
	}

	@FindBy(partialLinkText = "Unit")
	WebElement imgClick;

	public void imgClk() {
		imgClick.click();
	}

	@FindBy(id = "add-to-cart-button")
	WebElement addToCart;

	public void add2Cart() {
		addToCart.click();
	}

	@FindBy(id = "hlb-ptc-btn-native")
	WebElement proCheckout;

	public void ProceedCheckout() {
		proCheckout.click();
	}

	@FindBy(id = "ap_email")
	WebElement signIn;

	public void signEmail(String email) {
		signIn.sendKeys(email);
	}

}
