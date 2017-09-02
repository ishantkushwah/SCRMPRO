 package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractPage extends LoginPage{

	public ContractPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	/* @author ${Shalini Singh}
	    * Method of milestone for Contract
	    * Date 6 Sep 2017
	    */
	
	
		
	//Add Contract
	
	@FindBy(id="lBtnContractPage")
	public static WebElement clk_Contract_tab;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbActiveOn")
	public static WebElement clk_ContractActiveOn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlOpportunity")
	public static WebElement sel_opp_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlIndustryContract")
	public static WebElement sel_industry_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbTitle")
	public static WebElement enter_title_txt;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlStatusCode")
	public static WebElement sel_status_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbBillingStartOn")
	public static WebElement clk_billing_startsOn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbBillingEndOn")
	public static WebElement clk_billing_endOn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbExpiresOn")
	public static WebElement clk_expiresOn; 
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbCancelOn")
	public static WebElement clk_cancelOn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlBillingCustomer")
	public static WebElement sel_billingCustomer_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlTransactionCurrency")
	public static WebElement sel_currency_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlDepartment")
	public static WebElement sel_department_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbContractDesc")
	public static WebElement enter_termsCondition;
	
	
	/* @author ${Shalini Singh}
	    * Method of milestone for Contract
	    * Date 6 Sep 2017
	    */
	
	
	// Mile Stone
	
	
	
	@FindBy(xpath="//i[@class='fa fa-reorder collapse-new']")
	public static WebElement clk_Milestone_accordion;
	
	@FindBy(id="txtMilestoneName")
	public static WebElement enter_milestone_name;

	@FindBy(id="txtAmount")
	public static WebElement enter_amount_to_pay;
	
	@FindBy(id="txtDueOn")
	public static WebElement clk_dueOn;
	
	@FindBy(id="txtWorkAmt")
	public static WebElement enter_workAmount_txt;
	
	@FindBy(id="btnInvoice1")
	public static WebElement clk_invoice_btn;
	
	
	
	// Add Product to Milestone
	
	@FindBy(id="btnCreateTerritory")
	public static WebElement clk_bind_btn;
			
	@FindBy(id="txtQunti_m1p0")
	public static WebElement enter_ordQut_txt;
	
	@FindBy(id="txtTaxName_m1p0")
	public static WebElement sel_taxes_drpdwn;
	
	@FindBy(id="txtLineItemDescription")
	public static WebElement enter_description_txt;
			
	@FindBy(id="btnAddNewMileStone")
	public static WebElement clk_newMilestone_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_btnSave")
	public static WebElement clk_save_btn;
	
	

	
	// Contract View,Edit and Delete -- To be contd..
	
	
	@FindBy(id="ContentPlaceHolder1_AddCont_CreateContact")
	public static WebElement clk_add_contact_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ContactInfoMainDiv")      //modified by Shalini
	public static WebElement clk_contact_info_accordion;
	
	@FindBy(id="ContentPlaceHolder1_ucaddcontact_divUploadImage']/div/div/div[1]")
	public static WebElement clk_add_picture;
	
//  @FindBy(xpath="//div[@id='Div59']/div[2]/a/i")
//	public static WebElement clk_document_upload_btn;
	
	@FindBy(id="FileUpload_Control")
	public static WebElement clk_browse_btn;
	
	@FindBy(id="ContentPlaceHolder1_ucaddcontact_UploadButton")
	public static WebElement clk_upload_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_Button6")
	public static WebElement clk_back_btn;
	
	@FindBy(id="//a[contains(text(),'Close')]")         //modified by Shalini
	public static WebElement clk_close_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_btnEdit")
	public static WebElement clk_edit_btn;
		
	@FindBy(id="ContentPlaceHolder1_AddCont_btnpreview")
	public static WebElement clk_preview_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_lnkBtnSendMail")
	public static WebElement clk_send_mail_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_div41")
	public static WebElement clk_recent_update_accordion;
	
	@FindBy(id ="//a[contains(text(),'Cancel')]")             //modified by Shalini
	public static WebElement clk_cancel_btn;
	
	// Export

	
	
	
	

}

