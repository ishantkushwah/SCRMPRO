package scrmpro.appmethods.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import scrmpro.pom.com.CompanyPage;

public abstract class CompanyMethods extends LoginMethods {
	
	public void clickSettingtab(){
		driver.navigate().to("http://demo2.scrmpro.com/Protected/CustomizeSettings.aspx");
		//CompanyPage.link_setting.click();
	}
	
	public void clickCrmsettingtab(){
		CompanyPage.link_crmsetting.click();
	}
	
	public void clickCompanyEditButton(){
		CompanyPage.btn_CompanyEdit.click();
	}
	
	public void enterCompanyName(String companyName){
		CompanyPage.txt_CompanyName.sendKeys(companyName);
	}
	
	public void enterCompanyEmail(String email){
		CompanyPage.txt_CompanyEmail.sendKeys(email);
	}
	
	public void selectCompanyCurreny(String CurrencyOne,String CurrenyTwo,String CurrencyThree,String CurrencyFour,String CurrencyFive){
		new Select(CompanyPage.list_CompanyCurrency).selectByVisibleText(CurrencyOne);
		new Select(CompanyPage.list_CompanyCurrency).selectByVisibleText(CurrenyTwo);
		new Select(CompanyPage.list_CompanyCurrency).selectByVisibleText(CurrencyThree);
		new Select(CompanyPage.list_CompanyCurrency).selectByVisibleText(CurrencyFour);
		new Select(CompanyPage.list_CompanyCurrency).selectByVisibleText(CurrencyFive);
	}
	
	public void enterCompanyPhoneNumber(String phone){
		CompanyPage.txt_CompanyPhone.sendKeys(phone);
	}
	
	public void enterCompanyAddress(String address){
		CompanyPage.txt_CompanyAddress.sendKeys(address);
	}
	
	public void selectCompanyBaseCurrncy(String BaseCurrency){
		
		new Select(CompanyPage.list_BaseCurrency).selectByVisibleText(BaseCurrency);
	}
	
	public void selectcompanyCountry(String Country){
		
		new Select(CompanyPage.drpdwn_CompanyCountry).selectByVisibleText(Country);
	}
	
	public void uploadCompanyLogo(String url){
		
		CompanyPage.logo_CompanyLogo.sendKeys(url);
	}
	
	public void clickCompanySave(){
		CompanyPage.btn_CompanySave.click();
	}
	
	public void moveCurrencybtn(){
		CompanyPage.btn_movecurrency.click();
	}
	
	
	
	
}
