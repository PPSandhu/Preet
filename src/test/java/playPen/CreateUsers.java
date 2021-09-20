package playPen;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ExcelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateUsers {
	@Test
	public void EnterText() {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
   
        // Navigate to HN website
	   driver.get("https://www.harveynorman.com.au/customer/account/create/");
	   
	 //maximum Wait for 30 sec
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   driver.findElement(By.id("firstname")).sendKeys("software");
	   
	   Xls_Reader reader = new Xls_Reader("C:\\Users\\User\\Documents\\PreetAuto\\TestDataHN1.xlsx");
	   int rowCount = reader.getRowCount("RegTestData");
	   System.out.println("row count : " +rowCount);
	   
	   for (int rowNum=2; rowNum<=rowCount; rowNum++) {
		   
		   String FName = reader.getCellData("RegTestData", "FirstName" , rowNum);
		   driver.findElement(By.id("firstname")).clear();
		   driver.findElement(By.id("firstname")).sendKeys(FName);
		   
		   String lName = reader.getCellData("RegTestData", "LastName", rowNum);
		   driver.findElement(By.id("lastname")).clear();
		   driver.findElement(By.id("lastname")).sendKeys(lName);
		   
		   String EMail = reader.getCellData("RegTestData", "EmailAddress", rowNum);
		   driver.findElement(By.id("email_address")).clear();
		   driver.findElement(By.id("email_address")).sendKeys(EMail);
		   
		   String Pass = reader.getCellData("RegTestData", "Password", rowNum);
		   driver.findElement(By.id("password")).clear();
		   driver.findElement(By.id("password")).sendKeys(Pass);
		   
		   String RePass = reader.getCellData("RegTestData", "RePassword", rowNum);
		   driver.findElement(By.id("confirmation")).clear();
		   driver.findElement(By.id("confirmation")).sendKeys(RePass);
		   
		   
	   }
	     

	}

	
}
