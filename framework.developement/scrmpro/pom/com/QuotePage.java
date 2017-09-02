package scrmpro.pom.com;

import java.awt.List;

import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import scrmpro.pom.com.LeadPage;
 
 public class QuotePage extends OppPage{
 
 	public QuotePage(WebDriver driver) {
 		super(driver);
 		// TODO Auto-generated constructor stub
 	}
 	
 	// Add Quote
 	
 	@FindBy(id="lBtnQuotePage")
 	public static WebElement clk_Quote_tab;
 	
 	@FindBy(id="ContentPlaceHolder1_lBtnAddQuote")
 	public static WebElement clk_addnewbtn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtQuoteName")
 	public static WebElement entr_quote_name;
 	
 	//@FindBy(id="ContentPlaceHolder1_AddQuote_TxtQuoteNumber")
 	//public static WebElement entr_quotenumber;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindAccoun")
 	public static WebElement clk_account_search_Btn;	
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAccountName")
 	public static WebElement sel_accountname_drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindOpportunity")
 	public static WebElement clk_opp_search_btn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlOpportunity")
 	public static WebElement sel_quote_opp_drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlIndustryQuote")
 	public static WebElement sel_quoteindustry_drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStatusCode")
 	public static WebElement sel_quotestatus_drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlPaymentTermCode")
 	public static WebElement sel_quote_paymentTerm_drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_tbExpiresOn")
 	public static WebElement clk_QuoteValidTill;
 	
 	@FindBy(id="//select[contains(@class,'ui-datepicker-month')]")
 	public static WebElement sel_month;
 	
 	@FindBy(id="//select[contains(@class,'ui-datepicker-year')]")
 	public static WebElement sel_year;
 	
 	@FindBy(linkText="//a[contains(@class,'ui-state-default')]")
 	public static WebElement clk_date;
 	
 	 
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlTransactionCurrency")
 	public static WebElement sel_quote_Currency_drpdwn;
 	
 //	@FindBy(id="ContentPlaceHolder1_AddQuote_tbtotalAmount")
 //	public static WebElement tex_Quote_total_amount;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtDescription")
 	public static WebElement entr_quoteterms_condition;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSave")
 	public static WebElement clk_quote_save_btn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_Button6")
 	public static WebElement Clk_quote_back_btn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSaveNew")
 	public static WebElement clk_quote_SavenewBtn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_lnkBtnCancel")
 	public static WebElement clk_quoteclose_btn;
 	
 	// Quote line item
 	
 	@FindBy(xpath="//a[contains(@id,'callPopUp')]")
     public static WebElement clk_qline; 
 	
 	@FindBy(id="ContentPlaceHolder1_AddOpp_lBtnProductBind")
     public static WebElement clk_search_qline_item; 
 	
 	@FindBy(id="ddlItemCurrency")
     public static WebElement sel_currency_Drpdwn;
 	
 	@FindBy(xpath="//*[@id='ProductTbl']/thead/tr[1]/td[1]")
 	public static WebElement clk_All_Product_chkbox;
 	
 	@FindBy(id="btnBindSelectedProducts")
 	public static WebElement clk_qLineItemBindbtn;
 	
 	@FindBy(id="@id=txtSearchPCat")
 	public static WebElement txt_search_product_catgry;
 	
 	@FindBy(id="@id=txtSearchPName")
 	public static WebElement txt_search_product_name;
 	
 	@FindBy(id="txtSearchProductQty")
 	public static WebElement txt_search_product_qty;
 	
 	@FindBy(xpath="//*[@id=ProductTbl']/tbody/tr/td[2]/a)")
 	public static WebElement clk_view_product;
 
 	@FindBy(xpath=".//div[@class='btn.btn-info']")
 	public static WebElement qLineItems_displayed;
 	
 	// Address Information
 	
 	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[1]")
 	public static WebElement clk_Addres_info;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAddressTitle")
 	public static WebElement sel_sddressName_Drpdwn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_chkDefaultAdr")
 	public static WebElement chk_DefaultAddress;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_tbAddress")
 	public static WebElement entr_address;
 
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStreet")
 	public static WebElement sel_street;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCity")
 	public static WebElement sel_city;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_tbZip")
 	public static WebElement entr_zipcode;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlState")
 	public static WebElement sel_state;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCountry")
 	public static WebElement sel_country;
 	
 	
 	// Quote View,Edit and Delete
 	
 
 	@FindBy(xpath="//div[@class='portlet-title-new']")
 	public static WebElement clk_ContarctInformation_accordion;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_btnPreview")
 	public static WebElement clk_preview_btn;
 	
 	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_divDocument']")
 	public static WebElement clk_Document_accordion;
 	
 	@FindBy(xpath=".//*[@id='Div9']/div[2]/a")
 	public static WebElement clk_AddDocument_Btn;
 	
 	@FindBy(id="fileUpload")
 	public static WebElement clk_browse_btn;
 	
 	@FindBy(id="btnupload")
 	public static WebElement clk_upload_btn;

 	@FindBy(id="ContentPlaceHolder1_ViewQuote1_cbselAll")
 	public static WebElement Chk_all_quote;
 	
 	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_cbCheckBox_0")
 	public static WebElement Chk_quote1;
 	
 	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_tdName_0")	
 	public static WebElement clk_view_qName;
 	
 	@FindBy(id="btnEdit")
 	public static WebElement clk_edit_btn;
 	
 	@FindBy(id="ContentPlaceHolder1_AddQuote_divRevisionHistory")
 	public static WebElement clk_review_hitory_accordion;
 	
 	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_divEmail']")
 	public static WebElement clk_email_accordion;
 	
 	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_divRecentUpdate']")
 	public static WebElement clk_recentUpdate_accordion;
 	
 	@FindBy(id="divOtherInformation")
 	public static WebElement clk_OtherInfo_accordion;
 	
 	
 	
 	
 }