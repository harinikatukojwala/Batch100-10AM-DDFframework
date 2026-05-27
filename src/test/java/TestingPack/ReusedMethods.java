package TestingPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends ExecuteTestcases{
	
	public WebElement xp(String K) {
		
		return driver.findElement(By.xpath(obj.getProperty(K)));
	}
	
	public void t(int r) throws Exception {
		
		int h = 1000 * r;
		Thread.sleep(h);
	}
	
	public void ss(String e) throws IOException {
		
		File S = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T = new File("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\TestEvidences\\" +e + ".jpg");
		FileHandler.copy(S, T);
	}
	
	public void editmul(String ln, String fn) {
		
		xp("XEdit").click();
		  xp("XLN").clear();		  
		  xp("XLN").sendKeys(ln);
		  xp("XFN").clear();
		  xp("XFN").sendKeys(fn);
		  xp("Xsave").click();
		  xp("Xback").click(); 
		  driver.switchTo().defaultContent();

	}

}
