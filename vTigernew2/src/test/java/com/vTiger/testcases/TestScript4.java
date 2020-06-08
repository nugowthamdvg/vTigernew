package com.vTiger.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
import com.vTiger.pagerepository.Contacts;
import com.vTiger.pagerepository.CreateConPage;
import com.vTiger.pagerepository.Home;

@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class TestScript4 extends Base
{
	FileLib lib = new FileLib();
	Contacts con;
	Home home;
	CreateConPage cCon;  
	
	@Test
	public void createContactsTest3() throws InterruptedException
	{
		home = PageFactory.initElements(driver, Home.class);
		home.getcontactLink().click();
		Reporter.log("Clicked on Contacts Link",true);
		
		con = PageFactory.initElements(driver, Contacts.class);
		con.getCreateCon().click();
		Reporter.log("Clicked on Create Contacts Icon",true);
		
		cCon = PageFactory.initElements(driver, CreateConPage.class);
		cCon.salutation(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 3, 0));
		Reporter.log("Salutation is Selected",true);
		
		cCon.getContactFN().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"),3, 1));
		Reporter.log("Contact First Name is Entered",true);
		
		cCon.getContactLN().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 3, 2));
		Reporter.log("Contact Last Name is Entered",true);
		
		cCon.getContactMobile().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"),3, 3));
		Reporter.log("Contact Mobile number is Entered",true);
		
		cCon.getContactPO().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 3, 4));
		Reporter.log(" Contact Mailing Post box number is Entered",true);
		
		cCon.getSaveCon().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getcontactLink().click();
		Reporter.log("Clicked on Contacts Link",true);
		
	}
	
	@Test
	public void createContactsTest4() throws InterruptedException
	{
		
		home = PageFactory.initElements(driver, Home.class);
		home.getcontactLink().click();
		Reporter.log("Clicked on Contacts Link",true);
		
		con = PageFactory.initElements(driver, Contacts.class);
		con.getCreateCon().click();
		Reporter.log("Clicked on Create Contacts Icon",true);
		
		cCon = PageFactory.initElements(driver, CreateConPage.class);
		cCon.salutation(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 4, 0));
		Reporter.log("Salutation is Selected",true);
		
		cCon.getContactFN().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 4, 1));
		Reporter.log("Contact First Name is Entered",true);
		
		cCon.getContactLN().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 4, 2));
		Reporter.log("Contact Last Name is Entered",true);
		
		cCon.getContactMobile().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 4, 3));
		Reporter.log("Contact Mobile number is Entered",true);
		
		cCon.getContactPO().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet2"), 4, 4));
		Reporter.log(" Contact Mailing Post box number is Entered",true);
		
		cCon.getSaveCon().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getcontactLink().click();
		Reporter.log("Clicked on Contacts Link",true);
		
	}
		
	
	
}
