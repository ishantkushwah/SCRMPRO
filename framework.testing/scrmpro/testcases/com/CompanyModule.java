package scrmpro.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.CompanyMethods;
import scrmpro.pom.com.CompanyPage;
import scrmpro.utility.com.Log;

public class CompanyModule extends CompanyMethods{
  @Test
  public void UpdateCompanyInformatio() throws IOException, InterruptedException {
	  
	  LoginModule login = new LoginModule();

		common.ImplicityWait(10);

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Update Company Information");
		
		login.validLogin("shalini" , "Kaya@1234");

		Log.info("Navigate to Setting");
		clickSettingtab();
//
//		Log.info("Click on CRM Setting");
//		clickCrmsettingtab();

//		Log.info("Verify Filed");
//		Assert.assertFalse(CompanyPage.txt_CompanyName.isEnabled(), "Failed: Field Found Enabled");
//		Assert.assertFalse(CompanyPage.txt_CompanyAddress.isEnabled(), "Failed: Field Found Enabled");

		Log.info("Validate CurrencyMove Button no clickable");
		moveCurrencybtn();
		
		if(CompanyPage.list_BaseCurrency.getText().equalsIgnoreCase("")&&CompanyPage.list_BaseCurrency.getText().equalsIgnoreCase("--Select--")){
			
			Assert.assertTrue(CompanyPage.btn_CompanySave.isDisplayed(),"Failed: Base Currency field get reset");
		}
		
		Log.info("Click Edit Button");
		clickCompanyEditButton();

		Log.info("Validate Field get Enabled");
		Assert.assertTrue(CompanyPage.txt_CompanyName.isEnabled(), "Failed: Field Found Enabled");
		Assert.assertTrue(CompanyPage.txt_CompanyAddress.isEnabled(), "Failed: Field Found Enabled");

//		Log.info("Fill Company Name");
//		enterCompanyName(CompanyData.CompanyName);
//
//		Log.info("Fill Company Email Address");
//		enterCompanyEmail(CompanyData.Email);
//
//		Log.info("Select Currenyfromlist");
//		selectCompanyCurreny(CompanyData.Currency1, CompanyData.Currency2, CompanyData.Currency3, CompanyData.Currency4,
//				CompanyData.Currency5);
//		
  }
}
