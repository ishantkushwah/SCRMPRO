package scrmpro.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import scrmpro.appmethods.com.LeadMethods;
import scrmpro.pom.com.LeadPage;
import scrmpro.reposrity.com.LeadData;
import scrmpro.utility.com.Log;

public class LeadModule extends LeadMethods {
	
	/***********************************************
	 * @author ishantKushwah
	 * Test Case Objective : Navigate to Lead Module
	 * 
	 ************************************************/

	@Test
	public void NavigateToLead() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Navigate to Lead Module");

		Log.info("Enter Login in System");
		login.validLogin();

		Log.info("Click Sales Tab");
		clickSalesModule();

		Assert.assertTrue(LeadPage.click_Lead_tab.isDisplayed(), "Failed: Lead Page did not found");
		Log.endTestCase("TestCase End");

		common.TakeScreenshots();
		
		

	}
	
	
	/***************************************************
	 * @author ishantKushwah
	 * TestCase Objective : Createalead for new customer
	 * 
	 ***************************************************/

	@Test(dependsOnMethods="NavigateToLead")
	public void CreateLeadforNewCustomer() {
		
		common.ImplicityWait(10);

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("create a lead for new customer");

		Log.info("Click on Add new Button");
		Click_AddnewBtn();
		

		Log.info("Click Save Button to verify Mandatory Fields");
		Assert.assertTrue(LeadPage.Lead_Save_button.isDisplayed(), "Failed: Lead Save Button did not found");
		Click_Save_btton();

		Log.info("Fill Lead Title");
		Assert.assertTrue(LeadPage.Lead_Title_txt.isEnabled(), "Failed: Lead Title Field found disabled");
		EnterLeadTitle(LeadData.Title);

		Log.info("Fill Company Name");
		Enter_Company(LeadData.Company);

		Log.info("Fill Contact Information");
		Enter_FirstName(LeadData.FirstName);
		Enter_LastName(LeadData.LastName);

		Log.info("Fill Mobile Number");
		Enter_lead_mobile(LeadData.Mobile);

		Log.info("Fill Lead Priority");
		Enter_LeadPriority(LeadData.Priority);

		Log.info("Fill Lead Status");
		Enter_LeadStatus(LeadData.Status);

		Log.info("Click Save Button");
		Click_Save_btton();

		actiontocreatecontact();

	//	Assert.assertFalse(LeadPage.Lead_Save_button.isDisplayed(), "Failed: Lead did not get Save");
		
	}
	
	
	/*************************************************
	 * @author ishantKushwah
	 * TestCaseObjective : View and Update a lead
	 * 
	 * 
	 ************************************************/
	
	@Test(dependsOnMethods="NavigateToLead")
	public void UpdateaLeadStatus(){
		common.ImplicityWait(10);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Update a lead");
		
		Log.info("click on lead Title");
		Assert.assertTrue(LeadPage.click_Lead_tab.isDisplayed(), "Failed : Lead Tab did not found");
		Click_LeadTab();
		
		openaleadfromgrid("test");
		
		Log.info("Click Edit Button");
		Click_edit_btn();
		
		Log.info("Update Lead Status");
		Enter_LeadStatus(LeadData.Status);
		
		Log.info("Click Save Button");
		Click_Save_btton();
		
		
		
		
	}
	
	@Test(dependsOnMethods="CreateLeadforNewCustomer")
	public void Convertanonduplicatelead(){
		
		common.ImplicityWait(10);
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Convert a lead for new customer");
		
		Log.info("Click Convert Button");
		clickLeadConvertbtn();
		
		
	}
	
	@Test
	public void createanDuplicateLead(){
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Duplicate lead creation");
		
		CreateLeadforNewCustomer();
		
		Assert.assertTrue(LeadPage.Lead_Clone_btn.isDisplayed(), "Failed : Clone button did not found");
		
		Log.info("Click clone button");
		Click_Clone_btn();
		
		Log.info("Click Save button");
		Click_Save_btton();
		
		actiontocreatecontact();
		
		Assert.assertTrue(LeadPage.duplicate_leadalert.isDisplayed(), "Failed : No warning notification found");
		clickDuplicateojbtn();

	}

}
