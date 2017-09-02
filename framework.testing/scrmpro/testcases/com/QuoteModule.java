package scrmpro.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.CommonMethod;
import scrmpro.appmethods.com.LeadMethods;
import scrmpro.pom.com.LeadPage;
import scrmpro.pom.com.OppPage;
import scrmpro.appmethods.com.OppMethods;
import scrmpro.appmethods.com.QuoteMethods;
import scrmpro.pom.com.QuotePage;
import scrmpro.utility.com.LeadExcel;
import scrmpro.utility.com.Log;
import scrmpro.utility.com.QuoteExcel;

   

public class QuoteModule extends QuoteMethods {
	
	  OppModule opp = new OppModule();
	  CommonMethod cm =new CommonMethod();
	 
	/***********************************************
	 * @author Shalini Singh
	 * Test Case Objective : Navigate to Quote Module
	 * Date:- 15 November 2017
	 * 
	 ************************************************/
 
   @Test (enabled = false)
   public void NaviagteToQuote() throws IOException, InterruptedException {
	  
	       DOMConfigurator.configure("log.xml");
	       Log.startTestCase("start");
	  
			DOMConfigurator.configure("log.xml");
			Log.startTestCase("Navigate to Quote Module");

			Log.info("Enter Login in System");
			login.validLogin("Administrator" , "Kaya@1234");
			
			Log.info("Click Sales Tab");
			clickSalesModule();

			Log.info("Click Quote Tab");
			clkQuoteTab();

			Assert.assertTrue(QuotePage.clk_Quote_tab.isDisplayed(), "Failed: Quote Page did not found");
			Log.endTestCase("TestCase End");

			common.TakeScreenshots();
				

		}
  
  /***************************************************
	 * @author Shalini Singh
	 * TestCase Objective : VerifyMandetoryField 
	 * Date:- 15 November 2017
     * @throws InterruptedException 
     * @throws IOException 
	 ***************************************************/
    @Test(dependsOnMethods="NaviagteToQuote", enabled= false)
	public void VerifyQuoteMandetoryField() throws IOException, InterruptedException {
    	
    //	Log.info("Navigate To Quote Module");
    //	NaviagteToQuote();
		
	//	common.ImplicityWait(10);

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Create a Quote from Quote Module");

		Log.info("Click on Add new Button");
		clkAddNewQuote();
		
		Log.info("Click Save Button to verify Mandatory Fields");
		Assert.assertTrue(QuotePage.clk_quote_save_btn.isDisplayed(), "Failed: quote Save Button did not found");
		clkQuoteSavebtn();
		
		
		
		
  }
  
  /***************************************************
	 * @author Shalini Singh
	 * TestCase Objective : Create a Quote from Quote Module
	 * Date:- 15 November 2017
  * @throws InterruptedException 
  * @throws IOException 
	 ***************************************************/
  
   @Test (dataProvider = "CreateQuote", dataProviderClass = QuoteExcel.class, enabled = false)
   public void CreateQuotefromQuotemodule(String Name, String Account, String ProductName, String qty) throws IOException, InterruptedException {
  
	 Log.info("Navigate To Quote Module");
		NaviagteToQuote();
		
		Log.info("Click on Add new Button");
		clkAddNewQuote();
	  
	  Log.info("Fill Quote Name");
	  Assert.assertTrue(QuotePage.entr_quote_name.isEnabled(), "Failed: Quote Name Field found disabled");
		enterQuoteName(Name);
		
		Log.info("Select Account Name");
		Assert.assertTrue(QuotePage.sel_accountname_drpdwn.isDisplayed(), "Failed: Account Name does not exist");
		selAccountName(Account);
		
		Log.info("Click on QuoteLineItem");
		clkQuoteline();
		
		Log.info("Select Currency");
		selQuoteCurrency(3);
		
		System.out.println(ProductName);
		
		Log.info("Selct Product");	
        selQuoteProduct(ProductName, 1);
		
		Log.info("Click on Bind Button");
		clkQuoteLineBind();
		
		Log.info("Select on PriceBook");
		Assert.assertTrue(QuotePage.select_pricebook.isDisplayed(), "Failed: Pricebook does not exist");
		selPriceBook(1);
		
		Log.info("Select Price Type");
		Assert.assertTrue(OppPage.oppLine_PriceType.isDisplayed(), "Faield: Price Type does not exist");
		selPriceType(1);
		
		Log.info("Select Ordered Packege");
		selPackage(1);
		
		Log.info("Enter Quantity");
		enterQuantity(qty);
		
		Log.info("Select Shiping");
		Assert.assertTrue(OppPage.oppLineShipping.isDisplayed(), "Failed: Shiping does does not exist");
		selShipping(1);
		
		Log.info("Select Tax");
		Assert.assertTrue(OppPage.oppLineShipping.isDisplayed(), "Faield: Tax does not displayed");
		seltTax(1);
		
		Log.info("Click on Save Button");
		Assert.assertTrue(QuotePage.clk_quote_save_btn.isEnabled(), "Faield: Save button does not found");
		clkQuoteSavebtn();
		Thread.sleep(3000);
		
		Log.info("Close the Pop_up");
	    cm.popUpAccept();
	    
		 
		}
  

  
   /***************************************************
	 * @author Shalini Singh
	 * TestCase Objective : Create Quote From Opportunity
	 * Date:- 17 November 2017
   * @throws InterruptedException 
   * @throws IOException 
	 ***************************************************/
   
   /*
       @Test
       public void CreateQuoteFromOpp() throws IOException, InterruptedException{
    	 
    	DOMConfigurator.configure("log.xml");
 		Log.startTestCase("Create a Quote from Opp Module"); 
 		
 		Log.info("Convert Opoortunity to Quote");
 		opp.ConvertOpptoQuote(); 
 		

 		
     }
    */  
  
  }

