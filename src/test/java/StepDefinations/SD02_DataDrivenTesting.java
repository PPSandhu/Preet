package StepDefinations;

import org.openqa.selenium.By;

import BaseClass.openBrowser;
import io.cucumber.java.en.Then;

public class SD02_DataDrivenTesting {
	
	@Then("enter Firstname as {string}")
	public void enter_firstname_as(String Firstname) {
		openBrowser.driver.findElement(By.id("firstname")).clear();
		openBrowser.driver.findElement(By.id("firstname")).sendKeys(Firstname);
		
	}

	@Then("enter Lastname as {string}")
	public void enter_lastname_as(String Lastname) {
		openBrowser.driver.findElement(By.id("lastname")).clear();
		openBrowser.driver.findElement(By.id("lastname")).sendKeys(Lastname);

		
	}

	@Then("enter EmailAddress as {string}")
	public void enter_email_address_as(String EmailAddress) throws InterruptedException {
		openBrowser.driver.findElement(By.id("email_address")).clear();
		openBrowser.driver.findElement(By.id("email_address")).sendKeys(EmailAddress);
		openBrowser.CloseBrowser();
		Thread.sleep(5000);
	}

}
