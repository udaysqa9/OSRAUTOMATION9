package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SaiDemo {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//	WebDriver driver = new ChromeDriver();
	@Test
  public void display()
  {
	 Properties props = new Properties();
	 try {
		props.load(new FileInputStream("D:\\SonySelenium\\OSRAUTOMATION9\\globalconfig.properties"));
       System.out.println("AUT => "+props.getProperty("AUT"));
		
	} 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
		
		Reporter.log("Opening the application",true);
		Reporter.log("Opeing google.com",true);
		
		//driver.get("http://www.google.com");
		
		
	}
	
	@AfterTest
	public void closeApplication()
	{
		Reporter.log("Closing the application",true);
		//driver.quit();
	}

}
