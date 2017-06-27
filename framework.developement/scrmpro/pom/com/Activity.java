package scrmpro.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activity {
	
	public Activity(WebDriver driver) {
	//	super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[2]/button")
	public static WebElement Clk_activity_Btn;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkbtnMFollowup")
	public static WebElement Selct_followup_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkAppointment")
	public static WebElement slect_appointment_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkScheduleCall")
	public static WebElement slect_scheduleCall_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkQuoteNotes")
	public static WebElement slect_notes_fromQuoteGrid;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkQuoteDocument")
	public static WebElement slect_document_fromQuoteGrid;
	
	@FindBy(id="lnkToDo")
	public static WebElement clk_todo_fromQuote_accordion;
	
	// Add Followup
	
	@FindBy(id="tbSubject")
	public static WebElement entr_subject;
	
	@FindBy(id="tbStartDate")
	public static WebElement slect_startDate;
	
	@FindBy(id="tbEndDate")
	public static WebElement clk_endDate;
	
	@FindBy(id="tbStartTime")
	public static WebElement clk_startTime;
	
	@FindBy(id="tbEndTime")
	public static WebElement Clk_endTime;
	
	@FindBy(id="ddlFollowUpType")
	public static WebElement clk_followupType_dropdown;
	
	@FindBy(id="ddlFollowUpType']/option[1]")
	public static WebElement slect_followupType1;
	
	@FindBy(id="ddlFollowUpType']/option[2]")
	public static WebElement slect_followupType2;
	
	@FindBy(id="txtReminderDateFollowup")
	public static WebElement slect_followup_reminder;
	
	@FindBy(id="txtReminderTimeFollowup")
	public static WebElement clk_followup_reminder;
	
	@FindBy(id="tbDescription")
	public static WebElement entr_description;
	
	@FindBy(id="btnAddFollowUp1")
	public static WebElement clk_submit_btn;
	
	@FindBy(css="button.btn.btn-success")
	public static WebElement clk_cancel_btn;
	
	// Add Appointment
	
	@FindBy(id="ddlAptResource")
	public static WebElement clk_resources_drpdwn;
	
	@FindBy(xpath=".//*[@id='ddlAptResource']/option[2]")
	public static WebElement clk_resources1;
	
	@FindBy(id="tbAptSubject")
	public static WebElement entr_app_subject;
	
	@FindBy(id="tbAptStartDate")
	public static WebElement entr_app_startDate;
	
	@FindBy(id="tbAptStartTime")
	public static WebElement entr_app_startTime;
	
	@FindBy(id="tbAptEndDate")
	public static WebElement entr_app_endDate;
	
	@FindBy(id="tbAptEndTime")
	public static WebElement entr_app_endTime;
	
	@FindBy(id="ddlAptAppointmentType")
	public static WebElement clk_Apptype_drpdwn;
	
	@FindBy(xpath=".//*[@id='ddlAptAppointmentType']/option[2]")
	public static WebElement slect_appType1;
	
	@FindBy(id="txtReminderDateAppointment")
	public static WebElement slect_reminderDate;
	
	@FindBy(id="txtReminderTimeAppointment")
	public static WebElement slect_reminderTime;
	
	@FindBy(id="'txtAppointmentAddress")
	public static WebElement entr_address;
	
	@FindBy(id="tbAptDescription")
	public static WebElement entr_App_description;
	
	@FindBy(id="btnAddAppointment")
	public static WebElement clk_App_Submit_btn;
	
	@FindBy(xpath="//button[@type='button'])[7]")
	public static WebElement clk_Preview_btn;
	
	// Add Schedule Call
	
	@FindBy(id="tbSchCallSummary")
	public static WebElement entr_schCall_subject;

	@FindBy(id="tbSchPhone")
	public static WebElement entr_schcall_contactno;
	
	@FindBy(id="tbSchContactName")
	public static WebElement entr_schcall_contactName;
	
	@FindBy(id="tbSchCallDate")
	public static WebElement entr_schcall_startDate;
	
	@FindBy(id="tbSchCallTime")
	public static WebElement entr_schcall_startTime;
	
	@FindBy(id="ddlSchPriority")
	public static WebElement clk_schCall_priority_drpdwn;
	
	@FindBy(xpath=".//*[@id='ddlSchPriority']/option[2]")
	public static WebElement slect_priority1;
	
	@FindBy(id="txtReminderDateScheduleCall")
	public static WebElement entr_schcall_reminderDate;
	
	@FindBy(id="txtReminderTimeScheduleCall")
	public static WebElement entr_Schcall_reminderTime;
	
	@FindBy(id="ddlSchRole")
	public static WebElement clk_assignTorole_drpdwn;
	
	@FindBy(xpath=".//*[@id='ddlSchRole']/option[2]")
	public static WebElement slect_role1;
	
	@FindBy(id="ddlSchAssignUserName")
	public static WebElement clk_assigneToUser_drpdwn[];
	
	@FindBy(xpath=".//*[@id='ddlSchAssignUserName']/option[2]")
	public static WebElement slect_assignUserName1;
	
	@FindBy(id="tbSchDescription")
	public static WebElement entr_Schcall_Description;
	
	@FindBy(id="btnAddScheduleCalls1")
	public static WebElement clk_schcall_submit_btn;
	
	@FindBy(id="lnkBtnSchCancel")
	public static WebElement clk_schCall_cancel_btn;
	
	// Add Note
	
	@FindBy(id="tbSubjectNotes")
	public static WebElement entr_subjectNote;
	
	@FindBy(id="tbNotesText")
	public static WebElement entr_NoteDecription;
	
	@FindBy(id="btnAddNotes")
	public static WebElement clk_NoteSubmit_btn;
	
	@FindBy(xpath="//button[@type='button'])[12]")
	public static WebElement clk_noteCancel_btn;
	
	// Add ToDo
	
	@FindBy(id="tbToDoSubject")
	public static WebElement entr_toDoSubject;
	
	@FindBy(id="txtStartDate")
	public static WebElement entr_toDoStartDate;
	
	@FindBy(id="txtEndDate")
	public static WebElement entr_toDoEndDate;
	
	@FindBy(id="txtTaskTime")
	public static WebElement entr_tasktime;
	
	@FindBy(id="txtReminderDate")
	public static WebElement entr_toDo_reminderDate;
	
	@FindBy(id="tbToDoSubject")
	public static WebElement entr_toDo_teminderTime;
	
	@FindBy(id="chkMyself")
	public static WebElement clk_mySelf_chkBox;
	
	@FindBy(id="ddlRoles")
	public static WebElement clk_toDoRole_drpdwn;
	
	@FindBy(xpath=".//*[@id='ddlRoles']/option[2]")
	public static WebElement slect_toDoRole1;
	
	@FindBy(id="lstAssignedTo")
	public static WebElement Click_toDoassigneToUser_LitBox;
	
	@FindBy(xpath=".//*[@id='lstAssignedTo']/option[2]")
	public static WebElement slect_toDoassigneToUser1;
	
	@FindBy(id="tbToDoDescription")
	public static WebElement entr_toDodescription;
	
	@FindBy(id="btnSave")
	public static WebElement clk_toDoSave_btn;
	
	
	// Activity From Accordion 
	 
	 
}
