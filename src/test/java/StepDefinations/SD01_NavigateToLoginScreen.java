package StepDefinations;

import java.io.IOException;

import BaseClass.openBrowser;
import RegistrationPage.AT01_CreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD01_NavigateToLoginScreen {
	
	@Given("Open browser and navigate to reg screen")
	public void open_browser_and_navigate_to_reg_screen() throws IOException {
		AT01_CreateAccount.AccCre();
		
	}

	@Then("I want to assert that i am on that screen")
	public void i_want_to_assert_that_i_am_on_that_screen() {
		AT01_CreateAccount.AssertPage();
		
	}


}
