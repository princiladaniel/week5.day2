package testngstaticdata;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
    @Parameters({"username","password","url"})
	@BeforeMethod
	public  void perCondition(String uname,String pword,String url) {
    	WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);	
		driver.findElement(By.id("password")).sendKeys(pword);
    }
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
		
	}


