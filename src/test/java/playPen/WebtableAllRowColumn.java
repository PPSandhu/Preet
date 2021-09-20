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

public class WebtableAllRowColumn {
	
	@Test
	public void AllRowCol() {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("file:///C:/Users/User/Documents/PreetAuto/webtable/webtablehtml.html");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        List<WebElement> Rows = driver.findElements(By.xpath("//th[contains(@scope,'col')]"));
        int RowNum = Rows.size();
        System.out.println("number of rows : " +RowNum);
        
        List<WebElement> Col = driver.findElements(By.xpath("//th[contains(@scope,'row')]"));
        int ColNum = Col.size();
        System.out.println("number of column : " +ColNum);
        
        
       
	}

}
