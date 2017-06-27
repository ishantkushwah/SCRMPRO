package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends LoginPage{

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="lBtnAccountPage")
	public static WebElement Clickon_Account_tab;
	
	@FindBy(id="ContentPlaceHolder1_Add_btnGoBack")
	public static WebElement Clickon_Account_Back_Btn;
	
	@FindBy(id="ContentPlaceHolder1_Add_lnkBtnCancel")
	public static WebElement Clickon_Account_Close_btn;
	
	@FindBy(id="ContentPlaceHolder1_Add_lnkBtnSave")
	public static WebElement Click_Account_Save_btn;
	
	@FindBy(id="ContentPlaceHolder1_Add_lnkBtnSaveNew")
	public static WebElement Clickon_Account_SaveandNew_btn;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbName")
	public static WebElement Enter_Account_Name;
	
	@FindBy(id="ContentPlaceHolder1_Add_ddlLeadSubject")
	public static WebElement Select_Account_LeadTitle_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_Add_ddlContactList")
	public static WebElement Select_Account_contact_Dropdown;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbNumberofEmp")
	public static WebElement Enter_Account_noofEmployee_txtfield;
	
	@FindBy(id="ContentPlaceHolder1_Add_ddlPaymenttermCode")
	public static WebElement Select_Account_paymenet_Type;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbEmail1")
	public static WebElement Enetr_Account_Email_address;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbEmail2")
	public static WebElement Enter_Account_Aletrantive_Email;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbWebsiteUrl")
	public static WebElement Enter_Account_URL;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbTelephone")
	public static WebElement Enter_Account_Telephone;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbCity")
	public static WebElement Enter_Account_City;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbCountry")
	public static WebElement Enter_Account_Countty;
	
	@FindBy(id="ContentPlaceHolder1_Add_ddlCampaign")
	public static WebElement Select_Account_Campaign;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressBillTo")
	public static WebElement Enter_Account_Address_BillTo;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressAddressLine")
	public static WebElement Enter_Account_Address;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressCity")
	public static WebElement Enter_Account_city;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressState")
	public static WebElement Enter_Account_State;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressPostboxOffice")
	public static WebElement Enter_Account_PostBox;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressCountry")
	public static WebElement Enter_Account_Country;
	
	@FindBy(id="ContentPlaceHolder1_Add_tbAddressPostboxCode")
	public static WebElement Enter_Account_Pincode;
	
	@FindBy(id="ContentPlaceHolder1_UserAccount1_lnkBtnAddAccount")
	public static WebElement Click_on_AddNewAccount;


}
