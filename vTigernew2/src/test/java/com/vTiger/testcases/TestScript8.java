package com.vTiger.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
import com.vTiger.pagerepository.CreateVenPage;
import com.vTiger.pagerepository.Home;
import com.vTiger.pagerepository.Vendors;

@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class TestScript8 extends Base
{
	FileLib lib = new FileLib();
	Vendors ven;
	Home home;
	CreateVenPage cven;  
	
	@Test
	public void createVendorsTest1() throws InterruptedException
	{
		home = PageFactory.initElements(driver, Home.class);
		home.goToVendor(driver);
		Reporter.log("Clicked on Vendor Link",true);
		
		ven = PageFactory.initElements(driver, Vendors.class);
		ven.getCreateVen().click();
		Reporter.log("Clicked on Create Vendors Icon",true);
		
		cven = PageFactory.initElements(driver, CreateVenPage.class);
		cven.getVendorName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 1, 0));
		Reporter.log("Vendors Name is Entered",true);
		
		cven.getVendorMail().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"),1, 1));
		Reporter.log("Vendors mail id is Entered",true);
		
		cven.getVendorPhone().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 1, 2));
		Reporter.log("Vendors Phone Number is Entered",true);
		
		cven.getVendorWeb().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 1, 3));
		Reporter.log("Vendors Website is Entered",true);
		
		cven.vgl(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 1, 4));
		Reporter.log("Vendoe GL account is Selected",true);
		
		cven.getVendorPO().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 1, 5));
		Reporter.log("Vendor Post Box number is Entered",true);
		
		cven.getSaveVen().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home = PageFactory.initElements(driver, Home.class);
		home.goToVendor(driver);
		Reporter.log("Clicked on Vendor Link",true);
		
	}
	
	@Test
	public void createVendorsTest2() throws InterruptedException
	{
		
		home = PageFactory.initElements(driver, Home.class);
		home.goToVendor(driver);
		Reporter.log("Clicked on Vendor Link",true);
		
		ven = PageFactory.initElements(driver, Vendors.class);
		ven.getCreateVen().click();
		Reporter.log("Clicked on Create Vendors Icon",true);
		
		cven = PageFactory.initElements(driver, CreateVenPage.class);
		cven.getVendorName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 0));
		Reporter.log("Vendors Name is Entered",true);
		
		cven.getVendorMail().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 1));
		Reporter.log("Vendors mail id is Entered",true);
		
		cven.getVendorPhone().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 2));
		Reporter.log("Vendors Phone Number is Entered",true);
		
		cven.getVendorWeb().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 3));
		Reporter.log("Vendors Website is Entered",true);
		
		cven.vgl(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 4));
		Reporter.log("Vendoe GL account is Selected",true);
		
		cven.getVendorPO().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet5"), 2, 5));
		Reporter.log("Vendor Post Box number is Entered",true);
		
		cven.getSaveVen().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home = PageFactory.initElements(driver, Home.class);
		home.goToVendor(driver);
		Reporter.log("Clicked on Vendor Link",true);
		
	}
		
	
	
}
