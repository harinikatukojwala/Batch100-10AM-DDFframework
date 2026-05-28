package TestingPack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scripting extends ReusedMethods {
	
	@Test
	 public void Login() throws Exception {
		 driver.get(obj.getProperty("URL"));
		 xp("XUN").sendKeys(obj.getProperty("UN"));
		 xp("XPwd").sendKeys(obj.getProperty("Pwd"));
		 xp("XSub").click();
		 ss("After Login");
		 t(1);
		 System.out.println("---Login successful----");
		 
	 }

	
	public void addemp() throws Exception {
		
		t(2);		
		Actions A = new Actions(driver);		 
		 A.moveToElement(xp("XPIM")).perform();	
		 t(1);
		 xp("XAdd").click();
		 t(1);
		 driver.switchTo().frame(xp("XF"));
		 t(1);
		 xp("XID").clear();
		 xp("XID").sendKeys("1145");
		 xp("XLN").sendKeys("aishwarya");
		 xp("XFN").sendKeys("rai");
		 xp("XMN").sendKeys("bachan");
		 xp("XNN").sendKeys("aish");
		 
		 t(1);
		 
		 A.moveToElement(xp("XPhoto")).click().perform();
			
			StringSelection ss = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\photos\\TomandJerry.JPG");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			t(1);
			
			Robot R = new Robot();
			
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_V);
			R.keyRelease(KeyEvent.VK_CONTROL);
			R.keyRelease(KeyEvent.VK_V);
			
			t(1);
			
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			t(1);
			xp("XSave").click();
			t(2);
			xp("XBack").click();
		 
	}
	
	// add one employee from excel sheet
	
	public void oneemp() throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\src\\data\\java\\Defects01.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);		  
		  XSSFSheet sht = w.getSheet("addEmp");	
			  
			  int eid = (int) sht.getRow(3).getCell(0).getNumericCellValue();
			  String eln = sht.getRow(3).getCell(1).getStringCellValue();
			  String efn = sht.getRow(3).getCell(2).getStringCellValue();
			  String emn = sht.getRow(3).getCell(3).getStringCellValue();
			  String enn = sht.getRow(3).getCell(4).getStringCellValue();
	
			Actions A = new Actions(driver);		 
			 A.moveToElement(xp("XPIM")).perform();	
			 t(1);
			 xp("XAdd").click();
			 t(1);
			 driver.switchTo().frame(xp("XF"));
			 t(1);
			 xp("XID").clear();
			 xp("XID").sendKeys(String.valueOf(eid));
			 xp("XLN").sendKeys(eln);
			 xp("XFN").sendKeys(efn);
			 xp("XMN").sendKeys(emn);
			 xp("XNN").sendKeys(enn);
			 
			 t(1);
			 
			 A.moveToElement(xp("XPhoto")).click().perform();
				
				StringSelection ss = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\photos\\rashmi.jpg");
				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				t(1);
				
				Robot R = new Robot();
				
				R.keyPress(KeyEvent.VK_CONTROL);
				R.keyPress(KeyEvent.VK_V);
				R.keyRelease(KeyEvent.VK_CONTROL);
				R.keyRelease(KeyEvent.VK_V);
				
				t(1);
				
				R.keyPress(KeyEvent.VK_ENTER);
				R.keyRelease(KeyEvent.VK_ENTER);
				t(1);
				xp("XSave").click();
				t(1);
				xp("XBack").click();	
				t(1);
				
	}	
	
	// add multiple employees
	public void addmulemp() throws Exception {
			
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\src\\data\\java\\Defects01.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);		  
		  XSSFSheet sht = w.getSheet("addEmp");	
		  
		  //for(int r=1; r<=sht.getLastRowNum(); r++) {
		  for(int r=1; r<=2; r++) {
			  int eid = (int) sht.getRow(r).getCell(0).getNumericCellValue();
			  String eln = sht.getRow(r).getCell(1).getStringCellValue();
			  String efn = sht.getRow(r).getCell(2).getStringCellValue();
			  String emn = sht.getRow(r).getCell(3).getStringCellValue();
			  String enn = sht.getRow(r).getCell(4).getStringCellValue();
	
			Actions A = new Actions(driver);		 
			 A.moveToElement(xp("XPIM")).perform();	
			 t(1);
			 xp("XAdd").click();
			 t(1);
			 System.out.println(" Navigated to PIM page");
			 driver.switchTo().frame(xp("XF"));
			 t(1);
			 xp("XID").clear();
			 xp("XID").sendKeys(String.valueOf(eid));
			 xp("XLN").sendKeys(eln);
			 xp("XFN").sendKeys(efn);
			 xp("XMN").sendKeys(emn);
			 xp("XNN").sendKeys(enn);
			 
			 t(1);
			 //System.out.println(" successfully entered the data");
			 A.moveToElement(xp("XPhoto")).click().perform();
			 
			 System.out.println("photo click happens");
				
				StringSelection S = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\photos\\" +enn + ".jpg");
				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S, null);
				t(1);
				
				System.out.println("File selection happens");
				
				Robot R = new Robot();
				
				R.keyPress(KeyEvent.VK_CONTROL);
				R.keyPress(KeyEvent.VK_V);
				R.keyRelease(KeyEvent.VK_CONTROL);
				R.keyRelease(KeyEvent.VK_V);
				
				t(1);
				
				R.keyPress(KeyEvent.VK_ENTER);
				R.keyRelease(KeyEvent.VK_ENTER);
				t(1);
				ss(enn+ " before save");
				xp("XSave").click();
				t(1);
				ss(enn+ " After save");
				xp("XBack").click();	
				t(1);
				driver.switchTo().defaultContent();
				ss(enn+ " After added");
				t(1);
				System.out.println("----Employee with " +enn + " is added successfully");
			  
		  }
	
	}
	
	// edit one employee
	public void editoneemp() throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\src\\data\\java\\Defects01.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);		  
		  XSSFSheet sht = w.getSheet("addEmp");	
		  
		  String eln = sht.getRow(1).getCell(1).getStringCellValue();
		  driver.switchTo().frame(xp("XF"));		  
		  driver.findElement(By.partialLinkText(eln)).click();  
		  xp("XEdit").click();
		  xp("XLN").clear();		  
		  xp("XLN").sendKeys("aishwry");
		  xp("XFN").clear();
		  xp("XFN").sendKeys("ray");
		  xp("Xsave").click();
		  xp("Xback").click();		  
	}
	
	public void editmulemp() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SelePractice\\src\\data\\java\\Defects01.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);		  
		  XSSFSheet sht = w.getSheet("addEmp");	
		  
		  for(int r=1; r<=sht.getLastRowNum(); r++) {
			  
			  String eln = sht.getRow(r).getCell(1).getStringCellValue();
			  driver.switchTo().frame(xp("XF"));		  
			  driver.findElement(By.partialLinkText(eln)).click(); 
			  if(r==1) {
				  editmul("aishwry","ray");
			  }
			  else if(r==2) {
				  editmul("prabas","raju");
			  }
			  else if(r==3) {
				  editmul("kajal","agarwl");
			  }
			  else if(r==4) {
				  editmul("vijaya","dev");
			  }
			  else if(r==5) {
				  editmul("rashmi","vijay");
			  }
			  else {
				  System.out.println("--no such field--");
			  }
			  
		  }
		  		  
	}
	
	// deleting one employee
	public void deloneemp() throws Exception {
		
		driver.switchTo().frame(xp("XF"));	
		t(1);
		xp("Xcb1").click();
		t(1);
		xp("XDel").click();
		t(1);
	}
	
	//deleting multiple employees
	public void delmulemp() throws Exception {
		
		driver.switchTo().frame(xp("XF"));	
		t(1);
		xp("Xcb4").click();
		xp("Xcb5").click();
		t(1);
		xp("XDel").click();
	}
	
	//deleting all employees
	public void delall() throws Exception {
		driver.switchTo().frame(xp("XF"));
		t(1);
		xp("Xallcd").click();
		t(1);
		xp("XDel").click();
	}
}
