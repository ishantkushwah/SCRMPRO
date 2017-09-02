package scrmpro.testcases.com;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import scrmpro.appmethods.com.LoginMethods;
import scrmpro.pom.com.LeadPage;
import scrmpro.reposrity.com.Property;
import scrmpro.utility.com.Log;
import scrmpro.utility.com.LoginExcel;

public class LoginModule extends LoginMethods{
  
	/***********************************************
	 * @author ishantKushwah
	 * Test Case Objective : Navigate to Lead Module
	 * Modify by Shalini Singh 
	 ************************************************/
	@Test (dataProvider = "Login", dataProviderClass = LoginExcel.class)
	public void validLogin(String username, String password) throws IOException, InterruptedException{
		
		System.out.println("Enter username and Password");
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Login TestCase");
		
		Log.info("Enter Username");
		enterUsername(username);
		Log.info("Entred Username is: " +username);
		
		Log.info("Enter Password");
		enterPassword(password);
		Log.info("Entered Password :"+password);
		
		Log.info("Click Login Button");
		clickLogin();
		
		String exceptedResult ="http://192.168.1.221:9972/Protected/MyDashBoard.aspx";
		String actual =driver.getCurrentUrl();
		

		
	}
}
