package com.vTiger.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
import com.vTiger.pagerepository.CreateOrgaPage;
import com.vTiger.pagerepository.Home;
import com.vTiger.pagerepository.Organisation;


@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class TestScript10 extends Base
{
	FileLib lib = new FileLib();
	Organisation org;
	Home home;
	CreateOrgaPage corg;
	
	@DataProvider
	public Object[][] readData()
	{
		return lib.getAllDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet6"));
	}
	
	@Test(dataProvider="readData")
	public void createOrganisationTest(String orgName, String orgWebsite, String orgPhone, String orgBilling,String orgIndustry) throws InterruptedException
	{
		
		home = PageFactory.initElements(driver, Home.class);
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);
		
		org = PageFactory.initElements(driver, Organisation.class);
		org.getcreateOrg().click();
		Reporter.log("Clicked on Create Organisation Icon",true);
		
		corg = PageFactory.initElements(driver, CreateOrgaPage.class);
		corg.getOrganisationName().sendKeys(orgName);
		Reporter.log("Organisation Name is Entered",true);
		
		corg.getOrganisationWeb().sendKeys(orgWebsite);
		Reporter.log("Organisation Website is Entered",true);
		
		corg.getOrganisationPhone().sendKeys(orgPhone);
		Reporter.log("Organisation Phone Number is Entered",true);
		
		corg.getBillCity().sendKeys(orgBilling);
		Reporter.log("Organisation Billing City is Entered",true);
		
		corg.industry(orgIndustry);
		Reporter.log("Organisation Industry Type is Selected",true);
		
		corg.getsaveOrg().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);

	}
}
