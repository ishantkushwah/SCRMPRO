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
	
	
	/* @author ${Shalini Singh}
	    * Activity  
	    * Date 6 Sep 2017
	    */  
	
	@FindBy(xpath="//button[Contains(Text(),'Activities')]")
	public static WebElement clk_activity_Btn;
	
	@FindBy(id="//a[contains(text(),'Create Follow Up')]")
	public static WebElement sel_foll_drpdwn;
	
	@FindBy(id="//a[contains(text(),'Create Appointment')]")
	public static WebElement sel_app_drpdwn;
	
	@FindBy(id="//a[contains(text(),'Schedule a Call')]")
	public static WebElement sel_sch_drpdwn;
	
	@FindBy(id="//a[contains(text(),'Create a Notes')]")
	public static WebElement sel_notes_drpdwn;
	
	@FindBy(id="//a[contains(text(),'Upload a Document')]")
	public static WebElement sel_doc_drpdwn;
	
	@FindBy(id="//a[contains(text(),'To Do')]")
	public static WebElement sel_todo_drpdwn;
	
	// Add Followup
	
	@FindBy(id="tbSubject")
	public static WebElement enter_subject_txt;
	
	@FindBy(id="tbStartDate")
	public static WebElement clk_startDate;
	
	@FindBy(id="tbEndDate")
	public static WebElement clk_endDate;
	
	@FindBy(id="tbStartTime")
	public static WebElement clk_startTime;
	
	@FindBy(id="tbEndTime")
	public static WebElement Clk_endTime;
	
	@FindBy(id="ddlFollowUpType")
	public static WebElement sel_followupType_drpdwn;
	
//	@FindBy(id="txtReminderDateFollowup")
//	public static WebElement slect_followup_reminder;
	
//	@FindBy(id="txtReminderTimeFollowup")
//	public static WebElement clk_followup_reminder;
	
	@FindBy(id="tbDescription")
	public static WebElement enter_description_txt;
	
	@FindBy(id="btnAddFollowUp1")
	public static WebElement clk_submit_btn;
	
	@FindBy(css="button.btn.btn-success")
	public static WebElement clk_cancel_btn;
	
	// Add Appointment
	
	@FindBy(id="ddlAptResource")
	public static WebElement sel_resources_drpdwn;
	
	@FindBy(id="tbAptSubject")
	public static WebElement enter_appSubject_txt;
	
	@FindBy(id="tbAptStartDate")
	public static WebElement clk_app_startDate;
	
	//@FindBy(id="tbAptStartTime")
	//public static WebElement clk_app_startTime;
	
	@FindBy(id="tbAptEndDate")
	public static WebElement clk_app_endDate;
	
//	@FindBy(id="tbAptEndTime")
	//public static WebElement clk_app_endTime;
	
	@FindBy(id="ddlAptAppointmentType")
	public static WebElement sel_Apptype_drpdwn;
 
	@FindBy(id="txtReminderDateAppointment")
	public static WebElement clk_reminderDate;
	
//	@FindBy(id="txtReminderTimeAppointment")
//	public static WebElement sel_reminderTime;
	
	@FindBy(id="'txtAppointmentAddress")
	public static WebElement enter_address_txt;
	
	@FindBy(id="tbAptDescription")
	public static WebElement enter_AppDescription_txt;
	
	@FindBy(id="btnAddAppointment")
	public static WebElement clk_AppSubmit_btn;
	
	@FindBy(xpath="//button[@type='button'])[7]")
	public static WebElement clk_Preview_btn;
	
	// Add Schedule Call
	
	@FindBy(id="tbSchCallSummary")
	public static WebElement enter_schCallSubject_txt;

	@FindBy(id="tbSchPhone")
	public static WebElement enter_ContactNo_txt;
	
	@FindBy(id="tbSchContactName")
	public static WebElement enter_contactName;
	
	@FindBy(id="tbSchCallDate")
	public static WebElement clk_schcall_startDate;
	
//	@FindBy(id="tbSchCallTime")
//	public static WebElement clk_schcall_startTime;
	
	@FindBy(id="ddlSchPriority")
	public static WebElement sel_priority_drpdwn;
	
	@FindBy(id="txtReminderDateScheduleCall")
	public static WebElement clk_schcall_reminderDate;
	
//	@FindBy(id="txtReminderTimeScheduleCall")
//	public static WebElement clk_Schcall_reminderTime;
	
	@FindBy(id="ddlSchRole")
	public static WebElement sel_assignTorole_drpdwn;
	
	@FindBy(id="ddlSchAssignUserName")
	public static WebElement sel_assigneToUser_drpdwn;
	
	@FindBy(id="tbSchDescription")
	public static WebElement enter_SchcallDesc_txt;
	
	@FindBy(id="btnAddScheduleCalls1")
	public static WebElement clk_schcallSubmit_btn;
	
	@FindBy(id="lnkBtnSchCancel")
	public static WebElement clk_schCallCancel_btn;
	
	// Add Note
	
	@FindBy(id="tbSubjectNotes")
	public static WebElement enter_subjectNote_txt;
	
	@FindBy(id="tbNotesText")
	public static WebElement enter_NoteDec_txt;
	
	@FindBy(id="btnAddNotes")
	public static WebElement clk_NoteSubmit_btn;
	
	@FindBy(xpath="//button[@type='button'])[12]")
	public static WebElement clk_noteCancel_btn;
	
	// Add ToDo
	
	@FindBy(id="tbToDoSubject")
	public static WebElement enter_toDoSubject_txt;
	
	@FindBy(id="txtStartDate")
	public static WebElement clk_toDoStartDate;
	
	@FindBy(id="txtEndDate")
	public static WebElement clk_toDoEndDate;
	
//	@FindBy(id="txtTaskTime")
//	public static WebElement clk_tasktime;
	
	@FindBy(id="txtReminderDate")
	public static WebElement clk_toDoReminderDate;
	
//	@FindBy(id="tbToDoSubject")
//	public static WebElement clk_toDo_teminderTime;
	
	@FindBy(id="chkMyself")
	public static WebElement clk_mySelf_chkbox;
	
	@FindBy(id="ddlRoles")
	public static WebElement sel_toDoRole_drpdwn;
 
	@FindBy(id="lstAssignedTo")
	public static WebElement sel_toDoAssigneToUser_Listbox;

	@FindBy(id="tbToDoDescription")
	public static WebElement enter_toDodes_txt;
	
	@FindBy(id="btnSave")
	public static WebElement clk_toDoSave_btn;
	
	
	 
	 
	 
}
