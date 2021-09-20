package BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser{
	
	public static WebDriver driver;
	
	public static void NavToWebsite(String url) throws IOException {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
   
        // Navigate to HN website
	   driver.get(ReadPropertiesFile.PropFile(url));
	   
	 //maximum Wait for 30 sec
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void CloseBrowser() {
		
		driver.close();
		driver.quit();
		
	}
}


