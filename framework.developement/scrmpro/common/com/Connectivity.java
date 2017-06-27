package scrmpro.common.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import scrmpro.pom.com.CompanyPage;
import scrmpro.pom.com.LeadPage;
import scrmpro.pom.com.LoginPage;
import scrmpro.pom.com.OppPage;
import scrmpro.reposrity.com.Property;

public class Connectivity implements Property{
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void launchBrowser(){
		System.setProperty(chromeDriver, chromePath);
		driver = new ChromeDriver();
		System.out.println(webURL);
		driver.get(webURL);
		driver.manage().window().maximize();
		new LoginPage(driver);
		new LeadPage(driver);
		new CompanyPage(driver);
		new OppPage(driver);
	}

}
