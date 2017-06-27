package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "uclogin_tbUserName")
	public static WebElement txt_username;

	@FindBy(id = "lblouterusername")
	public static WebElement nameofuser;
	
	@FindBy(xpath="//input[@value='LeadConvert']")
	public static WebElement btn_leadConvert;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_Button1")
	public static WebElement btn_ConvertOk;

	@FindBy(id = "uclogin_tbPassword")
	public static WebElement txt_password;

	@FindBy(id = "aForgotPwd")
	public static WebElement forgetpassowrd;

	@FindBy(id = "uclogin_cbRememberMe")
	public static WebElement remeberme_checkbox;

	@FindBy(id = "uclogin_btnLogin")
	public static WebElement login_button;

	@FindBy(id = "uclogin_txtEmailID")
	public static WebElement email;

	@FindBy(id = "aBackToLogin")
	public static WebElement login_here_button;

	@FindBy(id = "uclogin_a")
	public static WebElement forgetpasswordinvalidmessage;

	@FindBy(id = "uclogin_btnemailreset")
	public static WebElement submit_button;
	
	@FindBy(id="lnkBtnSales")
	public static WebElement link_sales;
	
	@FindBy(id="lnkBtnSalesModule")
	public static WebElement link_salesModule;

	// ********************************************** MESSAGES ON MODULES
		// *******************************************************************

		// **************************************************LOGIN MODULE
		// ***************************************************************************
		@FindBy(id = "uclogin_RequiredFieldValidator3")
		public static WebElement blank_emailaddressmsg;
		String Blank_Email_AddressMessage = "Email!";

		@FindBy(id = "uclogin_RegularExpressionValidator1")
		public static WebElement invalid_emailadressmsg;
		String Invalid_EMail_Message = "Enter a valid Email";

		@FindBy(id = "uclogin_lblmessage")
		public static WebElement Wrong_EmailID;
		String Wrong_Email_Address_Message = "Email Id does not exist. Please try again!";

		@FindBy(id = "uclogin_RequiredFieldValidator1")
		public static WebElement blank_username_Message;
		String actual_message_For_Blank_Username = "User Name!";

		@FindBy(id = "uclogin_RequiredFieldValidator2")
		public static WebElement blank_password_Message;
		String Excepted_Blank_password_Message = "Password!";

		@FindBy(id = "uclogin_divError")
		public static WebElement invalid_Login_Message;
		String Invalid_login_message = "Invalid User name or Password";

		@FindBy(id = "uclogin_RequiredFieldValidator3")
		public static WebElement blank_Email_Message;
		String blank1_Email_Message = "Email";

}
