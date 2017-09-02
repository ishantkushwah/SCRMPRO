package scrmpro.testcases.com;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.CommonMethod;
import scrmpro.appmethods.com.OppMethods;
import scrmpro.pom.com.CommonPage;
import scrmpro.pom.com.OppPage;

import scrmpro.utility.com.Log;
import scrmpro.utility.com.OppExcel;

public class OppModule extends OppMethods {
	
	LeadModule lm = new LeadModule();
    CommonMethod cm =new CommonMethod();
    
	
	@Test
	
	public void NavigateOnOppModule() throws IOException, InterruptedException{
		
	DOMConfigurator.configure("log.xml");
	Log.startTestCase("start");
	
	DOMConfigurator.configure("log.xml");
	Log.startTestCase("Navigate To Opportunity Module");
	
	Log.info("Login in to the System");
	login.validLogin("Administrator", "Kaya@1234");
	
	Log.info("Click on Sales Tab");
	lm.clickSalesModule();
	
	Log.info("Click on Opportunity Tab");
	clickOpportunityTab();
	
	Assert.assertTrue(OppPage.tab_Oppotunity.isDisplayed(), "Failed: Opp Page did not found");
	Log.endTestCase("TestCase End");
	
	//common.TakeScreenshots();

	}
	
	 @Test (dependsOnMethods= "NavigateOnOppModule", enabled = false)  
	
	 public void VerifyMandatoryField() throws IOException, InterruptedException {
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("start");
		
		Log.info("Navigate to Opp module");
		NavigateOnOppModule();
		
		Log.startTestCase("Verify Mandatory Fields");
		
		Log.info("Click on Add new Opprtunity btn");
		Assert.assertTrue(OppPage.btn_AddnewOpp.isDisplayed(), "Faield: Add new button does not found");
		clickAddnewOpp();
		
		Log.info("Click on Save button");
		Assert.assertTrue(OppPage.btn_Save.isDisplayed(), "Faield: Save button did not found");
		clickSaveButton();
	}
	 
	 
	 
	
	 @Test(dependsOnMethods= "NavigateOnOppModule")
	
	 public void ConvertOpptoQuote() throws IOException, InterruptedException{
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("start");
		
		Log.info("Add Opportunity");
		NavigateOnOppModule();
		
		Log.info("Select Opportunity");
		SelOpp("Lead For Duplicate Product", 1);
		
		Log.info("Click on Moreactions");
	    cm.clkMoreAction();
		 
	    Log.info("Select on Convert");
		Assert.assertTrue(CommonPage.sel_convert.isDisplayed(), "Faield: Convert option does not found");
		cm.selFromMoreactions("Convert");
		
		Log.info("Clcik on Save Button");
		Assert.assertTrue(OppPage.btn_Save.isDisplayed(), "Faield: Save button did not found");
		clickSaveButton();
		
		Log.info("Close the Pop_up");
	    cm.popUpAccept();
		
		
	}
	
	

}
