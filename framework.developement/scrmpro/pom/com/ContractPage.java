 package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractPage extends QuotePage{

	public ContractPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	//Add Contract
	
	@FindBy(id="lBtnContractPage")
	public static WebElement clk_Contract_tab;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbActiveOn")
	public static WebElement clk_ContractActiveOntab;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlOpportunity")
	public static WebElement Sel_opportunity;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlIndustryContract")
	public static WebElement Sel_industry;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbTitle")
	public static WebElement enter_title;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlStatusCode")
	public static WebElement Sel_status;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbBillingStartOn")
	public static WebElement Sel_billing_starts_on;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbBillingEndOn")
	public static WebElement Sel_billing_end_on;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbExpiresOn")
	public static WebElement Sel_expires_on; 
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbCancelOn")
	public static WebElement Sel_cancel_on;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlBillingCustomer")
	public static WebElement Sel_billing_customer;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlTransactionCurrency")
	public static WebElement Sel_currency;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlDepartment")
	public static WebElement Sel_department;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbContractDesc")
	public static WebElement enter_terms_and_condition;
	
	
	
	
    //  Address Information
	
	/*
	
	@FindBy(xpath="//div[@class='padding_allsideSales']/div[2]/div[4]/div/div[1]")
	public static WebElement clk_contract_address_info;

	@FindBy(id="btnNewAddress")
	public static WebElement clk_new_address_button;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlAddressTitle")
	public static WebElement Sel_addressName ;
	
//	@FindBy(id="ContentPlaceHolder1_AddCont_chkDefaultAdr")
	//public static WebElement check_DefaultAddress;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbAddress")
	public static WebElement enter_address;

	@FindBy(id="ContentPlaceHolder1_AddCont_ddlStreet")
	public static WebElement Sel_street;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlCity")
	public static WebElement Sel_city;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_tbZip")
	public static WebElement enter_zipcode;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlState")
	public static WebElement Sel_state;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ddlCountry")
	public static WebElement Sel_country;
	
	*/
	
	
	// Mile Stone
	
	
	
	@FindBy(xpath="//div[@class='padding_allsideSales']/div[5]/div/div/div[1]")
	public static WebElement clk_Milestone_accordion;
	
	@FindBy(id="txtMilestoneName")
	public static WebElement enter_milestone_name;

	@FindBy(id="txtAmount")
	public static WebElement enter_amount_to_pay;
	
	@FindBy(id="txtDueOn")
	public static WebElement enter_due_on;
	
	@FindBy(id="txtWorkAmt")
	public static WebElement enter_work_amount;
	
	@FindBy(id="btnInvoice1")
	public static WebElement clk_invoice_btn;
	
	
	
	// Add Product to Milestone
	
	
	
	
//	@FindBy(id="chbx_m1p0")
	//public static WebElement Sel_checkbox;
	
	@FindBy(id="btnCreateTerritory")
	public static WebElement clk_bind_btn;
			
	@FindBy(id="txtQunti_m1p0")
	public static WebElement enter_ordQut;
	
	@FindBy(id="txtTaxName_m1p0")
	public static WebElement enter_taxes;
	
	@FindBy(id="txtLineItemDescription")
	public static WebElement enter_description;
			
	@FindBy(id="btnAddNewMileStone")
	public static WebElement clk_newMilestone_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_btnSave")
	public static WebElement clk_save_btn;
	
	
	
	// 360 degree view 
	
	
	
		
	@FindBy(xpath="//div[@class='padding_allsideSales']/div[6]/div/div[1]")
	public static WebElement clk_360_view_accordion;
	
	@FindBy(id="LiLead")                                       //modified by Shalini
	public static WebElement clk_360_view_lead_tab;
	
	@FindBy(id="LiAccount")                                     //modified by Shalini
	public static WebElement clk_360_view_account_tab;
	
	@FindBy(id="LiOpportunity")                                 //modified by Shalini
	public static WebElement clk_360_view_opp_tab;
	
	@FindBy(id="LiQuote")                                       //modified by Shalini
	public static WebElement clk_360_view_quote_tab;
	
	@FindBy(id="LiContract")                                    //modified by Shalini
	public static WebElement clk_360_view_contract_tab;
	
	@FindBy(id="clk_360_view")                                  //modified by Shalini
	public static WebElement clk_360_view_invoice_tab;
	
	@FindBy(id="LiCase")                                         //modified by Shalini
	public static WebElement clk_360_view_case_tab;
	
	@FindBy(id="LiCampaign")                                     //modified by Shalini
	public static WebElement clk_360_view_campaign_tab;
	
	@FindBy(id="LiProduct")                                      //modified by Shalini
	public static WebElement clk_360_view_product_tab;
	
	
	
	// Contract View,Edit and Delete -- To be contd..
	
	
	@FindBy(id="ContentPlaceHolder1_AddCont_CreateContact")
	public static WebElement clk_add_contact_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddCont_ContactInfoMainDiv")      //modified by Shalini
	public static WebElement clk_contact_information_accordion;
	
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
		
	
	

	// More Actions
	
	
	
	@FindBy(xpath="//div[@class='padding_allsideSales']/div/div[2]/div/div/div[4]")
	public static WebElement clk_more_actions;
	
	@FindBy(id="ContentPlaceHolder1_Viewcontract1_lnkChangerOwner")
	public static WebElement sel_change_owner;

	@FindBy(id ="lnkShareRecord")
	public static WebElement sel_share_record;
 
	@FindBy(id ="btnforShare")
	public static WebElement clk_share_btn;
	
	@FindBy(id ="btnforUnshare")
	public static WebElement clk_unshare_btn;
	
	@FindBy(id ="btnforcancel")
	public static WebElement clk_shareRecord_cancel_btn;
			
	@FindBy(xpath="//div[@class='padding_allsideSales']/div/div[2]/div/div/div[5]")
	public static WebElement clk_tools_drpdwn;
	
//	@FindBy(id="ContentPlaceHolder1_Viewcontract1_lnlBtnCustomView")
 //   public static WebElement clk_custom_view;
//
 //  @FindBy(id="ContentPlaceHolder1_Viewcontract1_lbFields")
 //   public static WebElement clk_contract_custom_view_field;

 //  @FindBy(id="ContentPlaceHolder1_Viewcontract1_btnAddField")
 //  public static WebElement clk_frwd_arrow_btn;

 //  @FindBy(id="ContentPlaceHolder1_Viewcontract1_btnRemoveField")
 //  public static WebElement clk_bckwd_arrow_btn;


 //  @FindBy(id="ContentPlaceHolder1_Viewcontract1_btnAddCustomView")
  // public static WebElement clk_Customesave_btn;

 //  @FindBy(id="ContentPlaceHolder1_Viewcontract1_upLeadCustomView")
  // public static WebElement clk_custmer_view_cancel_btn;

	
	
	// Export

	
	
	@FindBy(id="ContentPlaceHolder1_Viewcontract1_aimgExport")
	public static WebElement clk_export_btn;
		
	@FindBy(id ="cbSelectAllExport")
	public static WebElement clk_all_export;

	@FindBy(id ="ContentPlaceHolder1_Viewcontract1_btnExport1")
	public static WebElement clk_export_pdf_btn;
	
	@FindBy(id ="ContentPlaceHolder1_Viewcontract1_btnExport2")
	public static WebElement clk_export_excel_btn;
	
	@FindBy(id ="ContentPlaceHolder1_Viewcontract1_btnExportCSV")
	public static WebElement clk_export_csv_btn;
	
	@FindBy(id ="//a[contains(text(),'Cancel')]")             //modified by Shalini
	public static WebElement clk_cancel_btn;
	

}

