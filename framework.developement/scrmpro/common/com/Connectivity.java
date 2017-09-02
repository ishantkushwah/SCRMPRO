package scrmpro.common.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import scrmpro.pom.com.CommonPage;
import scrmpro.pom.com.CompanyPage;
import scrmpro.pom.com.LeadPage;
import scrmpro.pom.com.LoginPage;
import scrmpro.pom.com.OppPage;
import scrmpro.pom.com.QuotePage;
import scrmpro.reposrity.com.Property;

public class Connectivity implements Property{
	
	public static WebDriver driver= null;
	
	@BeforeMethod
	public void launchBrowser(){
		System.setProperty(chromeDriver, chromePath);
		driver = new ChromeDriver();
		System.out.println(webURL);
		driver.get(webURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize(); 
		new LoginPage(driver);
		new LeadPage(driver);
		new CompanyPage(driver);
		new OppPage(driver);
		new QuotePage(driver);
		new CommonPage(driver);
	}

}
