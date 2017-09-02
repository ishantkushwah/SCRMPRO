package scrmpro.reposrity.com;

import scrmpro.appmethods.com.OppMethods;
import scrmpro.common.com.CommonMethods;
import scrmpro.common.com.Scripts;
import scrmpro.testcases.com.LeadModule;
import scrmpro.testcases.com.LoginModule;
import scrmpro.testcases.com.QuoteModule;

public interface Property {
	
	CommonMethods common = new CommonMethods();
	String webURL = "http://192.168.1.221:9975";  //Scripts.selectEnviorment();
	String chromeDriver = "webdriver.chrome.driver";
	String chromePath ="Z://SELENIUMAUTOMATION//chromedriver.exe";	
	String TestSheet ="Z://SELENIUMAUTOMATION//testdata.xls";
	LoginModule login = new LoginModule();
	LeadModule lm = new LeadModule();
	QuoteModule qm = new QuoteModule();
	String username= "Administrator";//Scripts.enterusername();
	String password ="Kaya@1234";//Scripts.enterpassword();
	
}
