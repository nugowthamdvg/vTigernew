package com.vTiger.testcases;

import org.testng.annotations.Test;

import java.util.Iterator;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
import com.vTiger.pagerepository.CreateOppPage;
import com.vTiger.pagerepository.CreateOrgaPage;
import com.vTiger.pagerepository.Home;
import com.vTiger.pagerepository.Opportunities;
import com.vTiger.pagerepository.Organisation;
import com.vTiger.pagerepository.OrganisationPopup;

@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class TestScript11 extends Base
{
	FileLib lib = new FileLib();
	Opportunities oppo;
	Home home;
	CreateOppPage cOppo; 
	Organisation org;
	CreateOrgaPage corg;  
	OrganisationPopup pop;
	
	@Test
	public void createOpportunitiesTest1() throws InterruptedException
	{
		home = PageFactory.initElements(driver, Home.class);
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);
		
		org = PageFactory.initElements(driver, Organisation.class);
		org.getcreateOrg().click();
		Reporter.log("Clicked on Create Organisation Icon",true);
		
		corg = PageFactory.initElements(driver, CreateOrgaPage.class);
		corg.getOrganisationName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 3, 0));
		Reporter.log("Organisation Name is Entered",true);
		
		corg.getOrganisationWeb().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),3, 1));
		Reporter.log("Organisation Website is Entered",true);
		
		corg.getOrganisationPhone().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 3, 2));
		Reporter.log("Organisation Phone Number is Entered",true);
		
		corg.getBillCity().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 3, 3));
		Reporter.log("Organisation Billing City is Entered",true);
		
		corg.industry(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),3, 4));
		Reporter.log("Organisation Industry Type is Selected",true);
		
		corg.getsaveOrg().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		//oppo
		home.getoppoLink().click();
		Reporter.log("Clicked on Opportunities Link",true);
		
		oppo = PageFactory.initElements(driver, Opportunities.class);
		oppo.getCreateOpp().click();
		Reporter.log("Clicked on Create Opportunities Icon",true);
		
		cOppo = PageFactory.initElements(driver, CreateOppPage.class);
		cOppo.getopportunityName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet3"), 1, 0));
		Reporter.log("Opportunity Name is Entered",true);
		
		cOppo.type(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet3"),1, 1));
		Reporter.log("Opportunity type is Selected",true);
		
		cOppo.sStage(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet3"), 1, 2));
		Reporter.log("Opportunity sale stage is Selected",true);
		
		cOppo.getopportunityAmount().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet3"), 1, 3));
		Reporter.log("Opportunity Amount is Entered",true);
		
		Thread.sleep(5000);
		cOppo.getaddOrg().click();
		Reporter.log("Clicked on add organisation icon",true);
		
		java.util.Set<String> allid = driver.getWindowHandles();
		Iterator<String> i = allid.iterator();
		String pid = i.next();
		String cid = i.next();
		driver.switchTo().window(cid);
		pop = PageFactory.initElements(driver, OrganisationPopup.class);
		pop.getOrgName().click();
		driver.switchTo().window(pid);
	
		
		cOppo.getSaveOppo().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getoppoLink().click();
		Reporter.log("Clicked on Opportunities Link",true);
		
	}		
	
	
}
