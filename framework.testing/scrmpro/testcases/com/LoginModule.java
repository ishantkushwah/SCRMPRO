package scrmpro.testcases.com;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import scrmpro.appmethods.com.LoginMethods;
import scrmpro.pom.com.LeadPage;
import scrmpro.reposrity.com.Property;
import scrmpro.utility.com.Log;
import scrmpro.utility.com.LoginExcel;

public class LoginModule extends LoginMethods{
  
	
	@Test()
	public void validLogin(){
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Login TestCase");
		
		Log.info("Enter Username");
		enterUsername(Property.username);
		Log.info("Entred Username is: " +Property.username);
		
		Log.info("Enter Password");
		enterPassword(Property.password);
		Log.info("Entered Password :"+Property.password);
		
		Log.info("Click Login Button");
		clickLogin();
		
		String exceptedResult ="http:192.168.1.221:9972/Protected/MyDashboard.aspx";
		String actual =driver.getCurrentUrl();
		

		
	}
}
