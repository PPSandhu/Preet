package playPen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneRowData {
	
	@Test
	public void OneRow() {

			
			WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--ignore-ssl-errors=yes");
	        options.addArguments("--start-maximized");
	        WebDriver driver = new ChromeDriver(options);
	        
	        driver.get("file:///C:/Users/User/Documents/PreetAuto/webtable/webtablehtml.html");
	        
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        WebElement Name =  driver.findElement(By.xpath("//table[contains(@summary,'Sample Table')]/tbody/tr[1]/td[2]"));
	        String name = Name.getText();
	        System.out.println("first name : " +name);
	        
	        String sRowValue = "Clock Tower Hotel";
	        
	        List<WebElement> Col = driver.findElements(By.xpath("//table[contains(@summary,'Sample Table')]/tbody/tr/th"));
	        int ColNum = Col.size();
	     
	        
	        List<WebElement> SA = driver.findElements(By.xpath("//table[contains(@summary,'Sample Table')]/tbody/tr[2]/td"));
	        int saSize = SA.size();
	      
	        
	        for (int i=1; i<=ColNum; i++) {
	        	
	        	String Cname = driver.findElement(By.xpath("//table[contains(@summary,'Sample Table')]/tbody/tr["+i+"]/th")).getText();
	        	
	        	System.out.println("this is :" +Cname);
	        	if(Cname.equalsIgnoreCase(sRowValue)) 
	        	
	        {
	        		
	        		for (int j=1; j<=saSize; j++) 
	        		{
	        			WebElement SAnames = driver.findElement(By.xpath("//table[contains(@summary,'Sample Table')]/tbody/tr["+i+"]/td["+j+"]"));
	        			String saName = SAnames.getText();
	        			System.out.println("row value :" +saName);
	        			
	        		}
	        		break;
	        	
	        	}
	        	
	        }
	        
	        
	}

}
