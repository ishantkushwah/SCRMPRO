package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPage extends LoginPage{

	public LeadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id = "lBtnLeadPage")
	public static WebElement click_Lead_tab;

	@FindBy(linkText = "Add New Lead")
	public static WebElement click_AddnewLead_btn;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_btnActvities")
	public static WebElement click_Activities_btn;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkbtnMFollowup")
	public static WebElement select_followup_fromLeadGrid;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkAppointment")
	public static WebElement select_Appointment_fromLeadGrid;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkScheduleCall")
	public static WebElement select_Scheduledcall_fromLeadGrid;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkLeadNotes")
	public static WebElement select_note_fromLeadGrid;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkLeadDocument")
	public static WebElement select_document_fromLeadGrid;

	@FindBy(id = "ddlleadsOptview")
	public static WebElement select_Leadstatus_Dropdown;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_btnMoreAction")
	public static WebElement select_LeadMoreaction;
	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkChangerOwner")
	public static WebElement Lead_changeowner;
	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lBtnMassEdit")
	public static WebElement Lead_massedit;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lnkMassDelete")
	public static WebElement Lead_massDelete;

	@FindBy(id = "ContentPlaceHolder1_SalesNav1_lBtnAddNewLead")
	public static WebElement Add_new_Lead_Btn;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_lnkbtnClose")
	public static WebElement Lead_close_button;

	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public static WebElement Lead_Save_button;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_lnkBtnSaveNew")
	public static WebElement Lead_Savenew_button;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbLeadOwner")
	public static WebElement Lead_Owner_name;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbTitle")
	public static WebElement Lead_Title_txt;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbCompany")
	public static WebElement Lead_company_txt;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbFirstName")
	public static WebElement Lead_first_name;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbLastName")
	public static WebElement Lead_lastname_txt;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbDesignation")
	public static WebElement Lead_Designation_txt;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbEmail")
	public static WebElement Lead_Email_address;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_tbRevenue")
	public static WebElement Lead_Revenue_txt;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbSkypeId")
	public static WebElement Lead_Skpye_txt;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbTel1")
	public static WebElement Lead_tele_phone;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbFax")
	public static WebElement Lead_fax_txt;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbMobile")
	public static WebElement Lead_mobile_txt;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbAddress")
	public static WebElement Lead_address;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbDesc")
	public static WebElement Lead_Description;
	
	

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_ddlPriority")
	public static WebElement Lead_Priority_Dropdown;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_ddlCampaign")
	public static WebElement Lead_Camapin_dropwon;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_ddlLeadSource")
	public static WebElement Lead_Source_dropdown;

	@FindBy(id = "ContentPlaceHolder1_ucAddLead_ddlLeadStatus")
	public static WebElement Lead_Status_dropdwon;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_lnkBtnEdit")
	public static WebElement Lead_edit_btn;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_lnkBtnSendMail")
	public static WebElement Lead_sendmail_btn;
	
	@FindBy(id="tbEmailTo")
	public static WebElement Sendmail_Compose_To;
	
	@FindBy(id="tbEmailCC")
	public static WebElement Sendmail_Compose_cc;
	
	@FindBy(id="tbEmailBcc")
	public static WebElement Sendmail_Compose_bcc;
	
	@FindBy(id="tbEmailSubject")
	public static WebElement Sendmail_Compose_Subject;
	
	@FindBy(id="tbDesc_tbl")
	public static WebElement Sendmail_Compose_Message;
	
	
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_lnkBtnClone")
	public static WebElement Lead_Clone_btn;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_lnkbtnConvert")
	public static WebElement Lead_Convert_btn;
	
	@FindBy(id="ContentPlaceHolder1_SalesNav1_cbSelectAll")
	public static WebElement Select_All_Lead;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_tbEmpNos")
	public static WebElement No_of_Employee_txtbox;
	
	@FindBy(xpath="//tr['i']/td/div/input")
	public static WebElement Select_Grid_CheckBox;
	
	@FindBy(xpath="//div[8]/table/tbody/tr['i']/td['j']")
	public static WebElement Click_On_raw;
	
	@FindBy(xpath="//*[@id='duplicateLeadFoundModal']/div/div[2]")
	public static WebElement duplicate_leadalert;
	
	@FindBy(id="ContentPlaceHolder1_ucAddLead_btnContinue")
	public static WebElement cnfirmDuplicate;
	
	
	

	


}
