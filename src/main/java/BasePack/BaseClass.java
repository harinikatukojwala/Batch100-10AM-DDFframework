package BasePack;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties obj;
	
	 @BeforeClass
	  public void openBrow() throws IOException {
		 System.setProperty("webdriver.edge.driver","C:/Users/Admin/eclipse-workspace/SelePractice/MyBrowser/msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 
		 FileInputStream f = new FileInputStream("C:/Users/Admin/eclipse-workspace/SelePractice/src/data/java/InputData");
		 
		 obj = new Properties();
		 obj.load(f);

	  }
	 
	
	  
//	 @AfterMethod
//	 public void closeBrow() {
//		 driver.quit();
//		 System.out.println("Test cases are executed successfully");
//	 }

}
