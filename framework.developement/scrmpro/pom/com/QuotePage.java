package scrmpro.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage extends OppPage{

	public QuotePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Add Quote
	
	@FindBy(id="lBtnQuotePage")
	public static WebElement Clk_Quote_tab;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lBtnAddQuote")
	public static WebElement Clk_AddNewQuote;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtQuoteNumber")
	public static WebElement Entr_Quote_Name;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtQuoteNumber")
	public static WebElement Entr_Quote_Number;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAccountName")
	public static WebElement Select_Quote_AccountName_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindOpportunity")
	public static WebElement Clickon_Opportunity_Search_Btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlOpportunity")
	public static WebElement Select_Quote_Opportunity_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindAccoun")
	public static WebElement Clickon_Account_Search_Btn;		
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlIndustryQuote")
	public static WebElement Select_Quote_Industry_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStatusCode")
	public static WebElement Select_Quote_Status_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlPaymentTermCode")
	public static WebElement Select_Quote_PaymentTerm_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbExpiresOn")
	public static WebElement txt_Quote_ValideTill;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlTransactionCurrency")
	public static WebElement Select_Quote_Currency_dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbtotalAmount")
	public static WebElement tex_Quote_total_Amount;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtDescription")
	public static WebElement Enter_Quote_Terms_Conditions;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSave")
	public static WebElement Clickon_Quote_Save_Btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_Button6")
	public static WebElement Clickon_Quote_Back_Btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSaveNew")
	public static WebElement Clickon_Quote_SaveAndNew_Btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lnkBtnCancel")
	public static WebElement Clickon_Quote_Close_Btn;
	
	// Quote line item
	
	
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_lBtnProductBind'")
    public static WebElement search_Quoteline_Item; 
	
	@FindBy(id="ddlItemCurrency")
    public static WebElement Select_Currency_Dropdown;
	
	@FindBy(xpath="//*[@id='ProductTbl']/thead/tr[1]/td[1]")
	public static WebElement Click_All_Product_checkbox;
	
	@FindBy(id="cbCheckBox2")
	public static WebElement chk_productone;
	
	@FindBy(id="cbCheckBox3")
	public static WebElement chk_producttwo;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lnkBtnBindProduct")
	public static WebElement Quote_LineItemBindButton;
	
	@FindBy(id="@id=txtSearchPCat")
	public static WebElement Text_Search_Product_category;
	
	@FindBy(id="@id=txtSearchPName")
	public static WebElement Text_Search_Product_Name;
	
	@FindBy(id="txtSearchProductQty")
	public static WebElement Text_Search_Product_Qty;
	
	@FindBy(xpath="//*[@id=ProductTbl']/tbody/tr/td[2]/a)")
	public static WebElement View_Product;

	@FindBy(xpath=".//div[@class='btn.btn-info']")
	public static WebElement QuoteLineItems_Displayed;
	
	// Address Information
	
	@FindBy(xpath="//div[2]/div[2]/div/div[4]/div/div/div")
	public static WebElement clk_Address_information;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAddressTitle")
	public static WebElement Select_AddressName_Dropdown;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_chkDefaultAdr")
	public static WebElement chk_DefaultAddress;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbAddress")
	public static WebElement Enter_Address;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStreet")
	public static WebElement Select_Street;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCity")
	public static WebElement Select_City;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbZip")
	public static WebElement Enetr_ZipCode;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlState")
	public static WebElement Select_state;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCountry")
	public static WebElement Select_Country;
	
	// Quote View,Edit and Delete
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_tdEditQuote_0")
	public static WebElement Clickon_Edit_icon;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnPreview")
	public static WebElement Clickon_Preview_Btn;
	
	@FindBy(xpath="//div[2]/div/div/div[2]/div[8]/div/div/div")
	public static WebElement Clickon_Document_accordion;
	
	@FindBy(xpath=".//*[@id='Div9']/div[2]/a")
	public static WebElement Clickon_AddDocument_Btn;
	
	@FindBy(id="fileUpload")
	public static WebElement Clickon_Browse_btn;
	
	@FindBy(id="btnupload")
	public static WebElement Clickon_Upload_btn;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ViewQuote1_lvQuote_lnkbtnRemove_0']")
	public static WebElement Clickon_Delete_Icon;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_cbSelectAll")
	public static WebElement Chk_All_Quote;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_cbCheckBox_0")
	public static WebElement Chk_Quote1;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_cbCheckBox_1")
	public static WebElement Chk_Quote2;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_tdName_0")	
	public static WebElement Clickon_View_QuoteName;
	
	@FindBy(id="btnEdit")
	public static WebElement Clickon_Edit_btn;
	
	@FindBy(xpath="//div[2]/div[4]/div/div[2]")
	public static WebElement Clickon_Review_hitory_accordion;
	
	@FindBy(xpath="(//div[2]/div[5]/div/div)")
	public static WebElement Clickon_360view_accordion;
	
	@FindBy(xpath="//div[2]/div[4]/div/div[2]")
	public static WebElement Clickon_email_accordion;
	
	@FindBy(xpath="//div[2]/div[4]/div/div[2]")
	public static WebElement Clickon_RecentUpdate_accordion;
	
	
	// More Actions and Tool
	
	@FindBy(xpath="//div[4]/button")
	public static WebElement Clickon_MoreAction_Dropdown;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lbkBtnCreateContract")
	public static WebElement Select_Quote_Convert;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkChangerOwner")
	public static WebElement Select_Quote_ChangeOwner;
	
	@FindBy(xpath="//div[4]/button")
	public static WebElement Select_Quote_MassEdit;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkMassDelete")
	public static WebElement Select_Quote_MassDelete;
	
	@FindBy(id="lnkShareRecord")
	public static WebElement Select_Quote_ShareRecord;
	
	@FindBy(xpath="//div[5]/button")
	public static WebElement Clickon_tool_dropdown;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ViewQuote1_liCustomView']/a")
	public static WebElement Select_Quote_CustomView_dropdown;	
	
	//  Activity
	
	@FindBy(xpath="//div[2]/button")
	public static WebElement Clickon_Activities_Btn;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkbtnMFollowup")
	public static WebElement Select_Followup_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkAppointment")
	public static WebElement Select_Appointment_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkScheduleCall")
	public static WebElement Select_ScheduleCall_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkQuoteNotes")
	public static WebElement Select_Notes_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkQuoteDocument")
	public static WebElement Select_Document_fromQuoteGrid;
	
	@FindBy(id="lnkToDo")
	public static WebElement Clickon_ToDo_FromQuote_Accordion;
	
	// Add Followup
	
	@FindBy(id="tbSubject")
	public static WebElement Enter_Subject;
	
	@FindBy(id="tbStartDate")
	public static WebElement select_StartDate;
	
	@FindBy(id="tbEndDate")
	public static WebElement Clickon_EndDate;
	
	@FindBy(id="tbStartTime")
	public static WebElement Clickon_StartTime;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[2]/dl/dd[2]/div")
	public static WebElement select_time_InHour;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[2]/dl/dd[3]/div")
	public static WebElement select_time_InMinute;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[3]/button[1]")
	public static WebElement Clickon_Now_btn;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[3]/button[2]")
	public static WebElement Clickon_Done_btn;
	
	@FindBy(id="tbEndTime")
	public static WebElement Clikon_EndTime;
	
	@FindBy(id="ddlFollowUpType")
	public static WebElement Clickon_FollowupType_Dropdown;
	
	@FindBy(id="ddlFollowUpType']/option[1]")
	public static WebElement Select_FollowupType1;
	
	@FindBy(id="ddlFollowUpType']/option[2]")
	public static WebElement Select_FollowupType2;
	
	@FindBy(id="txtReminderDateFollowup")
	public static WebElement Select_Followup_Reminder;
	
	@FindBy(id="txtReminderTimeFollowup")
	public static WebElement Clickon_Followup_Reminder;
	
	@FindBy(id="tbDescription")
	public static WebElement Enter_Description;
	
	@FindBy(id="btnAddFollowUp1")
	public static WebElement Clickon_Submit_btn;
	
	@FindBy(css="button.btn.btn-success")
	public static WebElement Clickon_cancel_btn;
	
	// Add Appointment
	
	@FindBy(id="ddlAptResource")
	public static WebElement Clickon_Resources_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlAptResource']/option[2]")
	public static WebElement Clickon_Resources1;
	
	@FindBy(id="tbAptSubject")
	public static WebElement Enter_Appointment_Subject;
	
	@FindBy(id="tbAptStartDate")
	public static WebElement Enter_Appointment_StartDate;
	
	@FindBy(id="tbAptStartTime")
	public static WebElement Enter_Appointment_StartTime;
	
	@FindBy(id="tbAptEndDate")
	public static WebElement Enter_Appointment_EndDate;
	
	@FindBy(id="tbAptEndTime")
	public static WebElement Enter_Appointment_EndTime;
	
	@FindBy(id="ddlAptAppointmentType")
	public static WebElement Clicon_AppointmentType_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlAptAppointmentType']/option[2]")
	public static WebElement Select_AppointmentType1;
	
	@FindBy(id="txtReminderDateAppointment")
	public static WebElement Select_Appointment_ReminderDate;
	
	@FindBy(id="txtReminderTimeAppointment")
	public static WebElement Select_Appointment_ReminderTime;
	
	@FindBy(id="'txtAppointmentAddress")
	public static WebElement Enter_Appointment_Address;
	
	@FindBy(id="tbAptDescription")
	public static WebElement Enter_App_Description;
	
	@FindBy(id="btnAddAppointment")
	public static WebElement Clickon_App_Submit_btn;
	
	@FindBy(xpath="//button[@type='button'])[7]")
	public static WebElement Clickon_Preview_btn;
	
	// Add Schedule Call
	
	@FindBy(id="tbSchCallSummary")
	public static WebElement Enter_sch_Call_Subject;

	@FindBy(id="tbSchPhone")
	public static WebElement Enter_Sch_call_Contact_Number;
	
	@FindBy(id="tbSchContactName")
	public static WebElement Enter_Sch_call_ContactName;
	
	@FindBy(id="tbSchCallDate")
	public static WebElement Enter_Sch_call_StartDate;
	
	@FindBy(id="tbSchCallTime")
	public static WebElement Enter_Sch_call_StartTime;
	
	@FindBy(id="ddlSchPriority")
	public static WebElement Clickon_Sch_Call_Priority_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlSchPriority']/option[2]")
	public static WebElement Select_Priority1;
	
	@FindBy(id="txtReminderDateScheduleCall")
	public static WebElement Enter_Sch_Call_ReminderDate;
	
	@FindBy(id="txtReminderTimeScheduleCall")
	public static WebElement Enter_Sch_Call_ReminderTime;
	
	@FindBy(id="ddlSchRole")
	public static WebElement Clickon_AssignToRole_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlSchRole']/option[2]")
	public static WebElement Select_Role1;
	
	@FindBy(id="ddlSchAssignUserName")
	public static WebElement Clickon_AssigneToUser_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlSchAssignUserName']/option[2]")
	public static WebElement Select_AssignUserName1;
	
	@FindBy(id="tbSchDescription")
	public static WebElement Enter_Sch_Call_Description;
	
	@FindBy(id="btnAddScheduleCalls1")
	public static WebElement Clickon_Sch_Call_Submit_btn;
	
	@FindBy(id="lnkBtnSchCancel")
	public static WebElement Clickon_Sch_Call_Cancel_btn;
	
	// Add Note
	
	@FindBy(id="tbSubjectNotes")
	public static WebElement Enter_Subject_Note;
	
	@FindBy(id="tbNotesText")
	public static WebElement Enter_Note_Decription;
	
	@FindBy(id="btnAddNotes")
	public static WebElement Clickon_Note_Submit_btn;
	
	@FindBy(xpath="//button[@type='button'])[12]")
	public static WebElement Clickon_Note_Cancel_btn;
	
	// Add ToDo
	
	@FindBy(id="tbToDoSubject")
	public static WebElement Enter_ToDo_Subject;
	
	@FindBy(id="txtStartDate")
	public static WebElement Enter_ToDo_StartDate;
	
	@FindBy(id="txtEndDate")
	public static WebElement Enter_ToDo_EndDate;
	
	@FindBy(id="txtTaskTime")
	public static WebElement Enter_Task_Time;
	
	@FindBy(id="txtReminderDate")
	public static WebElement Enter_ToDo_ReminderDate;
	
	@FindBy(id="tbToDoSubject")
	public static WebElement Enter_ToDo_ReminderTime;
	
	@FindBy(id="chkMyself")
	public static WebElement Clickon_MySelf_CheckBox;
	
	@FindBy(id="ddlRoles")
	public static WebElement Clickon_ToDo_Role_dropdown;
	
	@FindBy(xpath=".//*[@id='ddlRoles']/option[2]")
	public static WebElement Select_ToDo_Role1;
	
	@FindBy(id="lstAssignedTo")
	public static WebElement Click_ToDo_assigneToUser_ListBox;
	
	@FindBy(xpath=".//*[@id='lstAssignedTo']/option[2]")
	public static WebElement Select_ToDo_assigneToUser1;
	
	@FindBy(id="tbToDoDescription")
	public static WebElement Enter_ToDo_Description;
	
	@FindBy(id="btnSave")
	public static WebElement Clickon_ToDo_Save_btn;
	
	
	// Activity From Accordion
	
	
	@FindBy(id="btnSave1")
	public static WebElement Clickon_ToDo_Save_btn1;
	
	@FindBy(id="btnSave1")
	public static WebElement Clickon_ToDo_Save_btn2;
	
	@FindBy(id="btnSave1")
	public static WebElement Clickon_ToDo_Save_btn3;
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	 
	
	

}
