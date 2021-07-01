package com.stepdef;

import com.PageObjectModel.SearchPage;
import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends Base {

	SearchPage bb;

	@Given("^user able to go homepage$")
	public void user_able_to_go_homepage() {

		getDriver();

	}

	@When("^user can write item name in search box$")
	public void user_can_write_item_name_in_search_box() throws Throwable {
		bb = new SearchPage(driver);
		bb.itemName("qa testing for beginners");
		

	}

	@When("^user can click on search icon$")
	public void user_can_click_on_search_icon() {
		
		bb.searchClk();
	}

	@When("^user can select the prefered items$")
	public void user_can_select_the_prefered_items() {

		bb.imgClk();

	}

	@When("^user can click on add to cart button$")
	public void user_can_click_on_add_to_cart_button() {

		bb.add2Cart();

	}

	@When("^user can click on Proceed to Checkout button$")
	public void user_can_click_on_Proceed_to_Checkout_button() {

		bb.ProceedCheckout();

	}

	@Then("^user can see the Sign In window$")
	public void user_can_see_the_Sign_In_window() {
		bb.signEmail("masud78md@gmail.com");
	}

}
