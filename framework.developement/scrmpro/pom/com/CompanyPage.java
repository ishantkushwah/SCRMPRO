package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends LoginPage{

	public CompanyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@id='lBtnCrmSettings']/span")
	public static WebElement  link_setting;
	
	@FindBy(id="lBtnUserMgmt")
	public static WebElement  link_crmsetting;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_btnEdit")
	public static WebElement btn_CompanyEdit;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_txtCompanyName")
	public static WebElement txt_CompanyName;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_txtEmail")
	public static WebElement txt_CompanyEmail;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_txtContact")
	public static WebElement txt_CompanyPhone;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_txtWebsite")
	public static WebElement txt_CompanyWebSite;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_txtAddress")
	public static WebElement txt_CompanyAddress;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_ddlCountry")
	public static WebElement drpdwn_CompanyCountry;
	
	@FindBy(id="lstCurrencyList")
	public static WebElement list_CompanyCurrency;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_ddlBaseCurrency")
	public static WebElement list_BaseCurrency;
	
	@FindBy(id="ContentPlaceHolder1_CustomizeSettings1_ucCompanyProfile_btnSave")
	public static WebElement btn_CompanySave;
	
	@FindBy(id="ContentPlaceHolder1_Customize")
	public static WebElement logo_CompanyLogo;
	
	@FindBy(id="SendValue")
	public static WebElement btn_movecurrency;
	
	
	
	

}
