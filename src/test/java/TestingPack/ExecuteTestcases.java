package TestingPack;

import org.testng.annotations.Test;

import BasePack.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ExecuteTestcases extends BaseClass {
	 
	@Test
	
	public void MyTestcases() throws Exception {
		
		Scripting S = new Scripting();
		S.Login();
		//S.addemp();
		//S.oneemp();
		S.addmulemp();
		//S.editoneemp();
		//S.editmulemp();
		//S.deloneemp();
		//S.delmulemp();
		//S.delall();
	}
}
