package scrmpro.pom.com;

import java.awt.List;

import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 
 public class CommonPage extends LoginPage{
 
 	public CommonPage(WebDriver driver) {
 		super(driver);
 		// TODO Auto-generated constructor stub
 	}
 	
 	
  // 360 degree view 
	
	
 


	@FindBy(xpath="(//sup[Contains(@class,'collapse-new')]")
 	public static WebElement clk_360view_accordion;
	
 	@FindBy(id="LiLead")                                       
 	public static WebElement clk_360viewlead_tab;
 	
 	@FindBy(id="LiAccount")                                      
 	public static WebElement clk_360viewAccount_tab;
 	
 	@FindBy(id="LiOpportunity")                                  
 	public static WebElement clk_360viewOpp_tab;
 	
 	@FindBy(id="LiQuote")                                       
 	public static WebElement clk_360viewQuote_tab;
 	
 	@FindBy(id="LiContract")                                    
 	public static WebElement clk_360viewContract_tab;
 	
 	@FindBy(id="clk_360_view")                                  
 	public static WebElement clk_360viewInvoice_tab;
 	
 	@FindBy(id="LiCase")                                          
 	public static WebElement clk_360viewCase_tab;
 	
 	@FindBy(id="LiCampaign")                                      
 	public static WebElement clk_360viewCampaign_tab;
 	
 	@FindBy(id="LiProduct")                                      
 	public static WebElement clk_360viewProduct_tab;
 	
 	
 	/* @author ${Shalini Singh} 
 	 * More Action
	 * Date 8 Sep 2017
	 */
 	
 	@FindBy(linkText="More Actions")
 	public static WebElement clk_moreaction_drpdwn;
 	
 	@FindBy(xpath="//a[contains(text(),'Convert')]")
 	public static WebElement sel_convert;
 	
 	@FindBy(xpath="//a[contains(text(),'Change Owner')]")
 	public static WebElement sel_changeowner;
 	
 	@FindBy(xpath="//a[contains(text(),'Mass Edit')]")	
 	public static WebElement sel_massedit;
 	
 	@FindBy(id="//a[contains(text(),'Mass Delete')]")
 	public static WebElement sel_massdelete;
 	
 	@FindBy(xpath="//button[contains(text(),'Tools')]")
 	public static WebElement clk_tool_drpdwn;
 	
 	@FindBy(xpath="//a[contains(text(),'Custom View')]")
 	public static WebElement sel_customView_drpdwn;
 	
 	@FindBy(id="lnkShareRecord")
 	public static WebElement sel_sharerecord;
 	
	@FindBy(id ="btnforShare")
	public static WebElement clk_share_btn;
	
	@FindBy(id ="btnforUnshare")
	public static WebElement clk_unshare_btn;
	
	@FindBy(id ="btnforcancel")
	public static WebElement clk_shareRecord_cancel_btn;
	
	@FindBy(id="//button[contains(@class,'close')]")
	public static WebElement clk_close_icon;
			
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

	
	/* @author ${Shalini Singh} 
 	 * Export Functionality
	 * Date 8 Sep 2017
	 */
	
	@FindBy(id="//img[Contains(@alt,'Export')]")
	public static WebElement clk_export_btn;
		
	@FindBy(id ="cbSelectAllExport")
	public static WebElement chk_all;

	@FindBy(id ="//input[Contains(@value,'Export PDF')]")
	public static WebElement clk_exportPdf_btn;
	
	@FindBy(id ="//input[Contains(@value,'Export Excel')]")
	public static WebElement clk_exportExcel_btn;
	
	@FindBy(id ="//input[Contains(@value,'Export CSV')]")
	public static WebElement clk_exportCsv_btn;
	
 }	