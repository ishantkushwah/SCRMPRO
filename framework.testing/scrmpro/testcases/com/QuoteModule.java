package scrmpro.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.OppMethods;
import scrmpro.appmethods.com.QuoteMethod;
import scrmpro.utility.com.Log;

public class QuoteModule extends QuoteMethod{
 
  @Test
  public void createQuote() {
	  
	  DOMConfigurator.configure("log.xml");
	  Log.startTestCase("start");
	  
	  quoteConvert();
	  
	  clickSaveButton();
  }
}
