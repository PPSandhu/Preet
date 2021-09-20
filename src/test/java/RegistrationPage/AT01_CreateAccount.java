package RegistrationPage;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import BaseClass.openBrowser;
import junit.framework.Assert;

public class AT01_CreateAccount {
	
@Test
	public static void AccCre() throws IOException {
		
		openBrowser.NavToWebsite("url2");
		
	}
	
@Test
public static void AssertPage() {
	
	String Actual = openBrowser.driver.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText();
	
	String Expected = "Create an account";
	Assert.assertEquals(Expected, Actual); 
	
}
}
