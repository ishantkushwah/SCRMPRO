package scrmpro.reposrity.com;

import scrmpro.appmethods.com.OppMethods;
import scrmpro.common.com.CommonMethods;
import scrmpro.common.com.Scripts;
import scrmpro.testcases.com.LeadModule;
import scrmpro.testcases.com.LoginModule;

public interface Property {
	
	CommonMethods common = new CommonMethods();
	String webURL = "http://192.168.1.221:9972";  //Scripts.selectEnviorment();
	String chromeDriver = "webdriver.chrome.driver";
	String chromePath ="Z:\\SELENIUMAUTOMATION\\chromedriver.exe";	
	String TestSheet ="C:/Users/ishan/workspace/New folder/SCRMPro/SourceLocation/SCRMPROTESTDATA.xls";
	LoginModule login = new LoginModule();
	LeadModule lm = new LeadModule();
	String username= "administrator";//Scripts.enterusername();
	String password ="Admin@123!";//Scripts.enterpassword();
	
}
