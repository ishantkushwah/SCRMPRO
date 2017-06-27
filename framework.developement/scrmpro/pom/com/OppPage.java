package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OppPage extends LoginPage{

	public OppPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="lBtnOppPage")
	public static WebElement tab_Oppotunity;
	
	@FindBy(linkText="Add New Opportunity")
	public static WebElement btn_AddnewOpp;
	
	@FindBy(xpath="//a[contains(text(),'Save')]")
	public static WebElement btn_Save;
	
	
	@FindBy(id="id=ContentPlaceHolder1_AddOpp_tbName")
	public static WebElement txt_OpportunityTitle;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_ddlAccountName")
	public static WebElement drpdwn_Account;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_ddlIndustryOpp")
	public static WebElement drpdwn_Industry;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_ddlStatusCode")
	public static WebElement drpdwn_Status;
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_AddOpp_lBtnProductBind']/i")
	public static WebElement link_prodcutLink;
	
	@FindBy(id="ddlItemCurrency")
	public static WebElement drpdwn_SelectCurrency;
	
	@FindBy(id="cbCheckBox2")
	public static WebElement chk_productone;
	
	@FindBy(id="cbCheckBox3")
	public static WebElement chk_producttwo;
	
	@FindBy(xpath="//input[@value='Bind']")
	public static WebElement btn_ProductBind;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_btnGoBack")
	public static WebElement btn_Back;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_lnkBtnEdit")
	public static WebElement btn_Edit;
	
	@FindBy(id="PriceBook-selected0")
	public static WebElement select_pricebook;
	
	@FindBy(id="txtTotalOrderQnty0")
	public static WebElement txt_qty;
	
	@FindBy(id="PriceType-selected0")
	public static WebElement oppLine_PriceType;
	
	@FindBy(id="ddlPackage0")
	public static WebElement opplinePackage;
	
	@FindBy(id="ddlShipping0")
	public static WebElement oppLineShipping;
	
	@FindBy(id="ddlTax0")
	public static WebElement oppLineTax;
	
	
	

}
