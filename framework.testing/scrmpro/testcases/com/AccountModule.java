package scrmpro.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import scrmpro.appmethods.com.AccountMethod;
import scrmpro.utility.com.Log;

public class AccountModule extends AccountMethod{
  
	public void navigatAccountModule (){
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Navigate to Lead Module");
		
		Log.info("Login in System");
	}
}
