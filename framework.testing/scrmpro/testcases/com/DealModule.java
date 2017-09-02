package scrmpro.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.OppMethods;
import scrmpro.pom.com.OppPage;
import scrmpro.utility.com.Log;

public class DealModule extends OppMethods{

	@Test
	public void createOpportunity() throws InterruptedException{
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("OppStatus");
		
//		common.flurentWait();
//		Log.info("Navigate to Opportunity");
//		login.validLogin();
//		lm.clickSalesModule();
//		
//		Log.info("Navigate to Opportunity Tab");
//		common.flurentWait();
		
		Log.info("Open Opportunity");
		clickOpportunityTab();
		
		
		Log.info("Click Edit Button");
		clickEditButton();
		
		Assert.assertTrue(OppPage.link_prodcutLink.isDisplayed(), "Failed: Product Icon did not found");
		Log.info("Select ProductLine Icon");
		clickProductLineicon();
		
		Log.info("Select Currency");
		selectProductsCurrency(3);
		common.ImplicityWait(40);
		
		Assert.assertTrue(OppPage.chk_productone.isDisplayed(), "Failed: No Product Found");
		Log.info("Select Product");
		selectProducts();
		
		common.ImplicityWait(20);
		
		Log.info("Bind Product");
		clickProductBind();
		
		common.ImplicityWait(20);
		Log.info("PriceBook");
		selectPriceBook(1);
		
		Log.info("Select PriceType");
		selectPriceType();
		
		Log.info("Select Package");
		selectPakage();
	//	common.shiftscroll();
		
		Log.info("Select Shipping Address");
		selectShipping();
		
		enterPoductQty("1");
		
		Log.info("Selct Tax");
		selectTax();
		
		Log.info("Click Save Button");
		clickSaveButton();
		
		
	}
  
}
