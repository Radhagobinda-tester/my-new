package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	// declare globaly 
	
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	
	
	public WebDriverDriverUtilies driverutilies = new WebDriverDriverUtilies();
	
	@BeforeMethod
	
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFileData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	
	
	@AfterMethod
	 
	public void CloseApp() {
		
	driver.quit();
	
	}
	
	

}
