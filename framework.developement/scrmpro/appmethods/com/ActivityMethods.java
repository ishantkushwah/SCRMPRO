package scrmpro.appmethods.com;

import org.openqa.selenium.support.ui.Select;

import scrmpro.pom.com.Activity;

public class ActivityMethods extends LoginMethods {
	
	 /* @author ${Shalini Singh}
     * Method of Activity Drop down
     * Date 12 Sep 2017
    */
	
	public void clkActivityBtn(){
		Activity.clk_activity_Btn.click();
 	}
	
	public void clkActivitydrpdwn(String ActivityName){
	
		if (ActivityName.equalsIgnoreCase("Followup")){
		new Select(Activity.sel_foll_drpdwn).selectByIndex(1);	
		}
		
		else if (ActivityName.equalsIgnoreCase("Appointment")){
  	   new Select(Activity.sel_app_drpdwn).selectByIndex(2);
 	}
		else if (ActivityName.equalsIgnoreCase("ScheduleCall")){
 		new Select(Activity.sel_sch_drpdwn).selectByIndex(3);
 		
 	}
		else if (ActivityName.equalsIgnoreCase("Notes")){
        new Select(Activity.sel_notes_drpdwn).selectByIndex(4);
 	}
		else if(ActivityName.equalsIgnoreCase("Document")){
		new Select(Activity.sel_doc_drpdwn).selectByIndex(5);
		}
		
		else{
			new Select(Activity.sel_todo_drpdwn).selectByIndex(6);
		}
 	
}
	
	/* @author ${Shalini Singh}
     * Method of Add follow up Activity
     * Date 12 Sep 2017
    */
	
	
	public void enterSubject(String Subject){
		Activity.enter_subject_txt.sendKeys(Subject);
	}
	
	public void clkstartDate(){
		Activity.clk_startDate.click();
		
	}
	
	public void clkendDate(){
		Activity.clk_endDate.click();
	}
	
	public void clkstartTime(){
		Activity.clk_startTime.click();
	}
	
	public void clkendTime(){
		Activity.Clk_endTime.click();
	}
	
	public void selfollowupType(String FollowupType){
		new Select(Activity.sel_followupType_drpdwn).selectByVisibleText(FollowupType);
	}
	
	public void enterDescription(String Description){
		Activity.enter_description_txt.sendKeys(Description);
	}
	
	public void clkSubimtBtn(){
		Activity.clk_submit_btn.click();
	}
	
	public void clkCancelBtn(){
		Activity.clk_cancel_btn.click();
	}
	
	
	/* @author ${Shalini Singh}
     * Method of Add Appointment Activity
     * Date 13 Sep 2017
    */
	
	public void selAppResource(String Resource){
		new Select(Activity.sel_resources_drpdwn).selectByVisibleText(Resource);
	}
    	
	public void enterAppSubject(String AppointmentSubject){
		Activity.enter_appSubject_txt.sendKeys(AppointmentSubject);
	}
	
	public void clkAppStartDate(){
		Activity.clk_app_startDate.click();
	}
	
	public void clkAppEndDate(){
		Activity.clk_app_endDate.click();
	}
	
	public void selAppType(String AppointmentType){
		new Select(Activity.sel_Apptype_drpdwn).selectByVisibleText(AppointmentType);
	}
	
	public void clkAppReminderDate(){
		Activity.clk_reminderDate.click();
	}
	
	public void enterAddressName(String Address){
		Activity.enter_address_txt.sendKeys(Address);
	}
	
	public void enterAppDescription(String AppDescription){
		Activity.enter_AppDescription_txt.sendKeys(AppDescription);
	}
	
	public void clkAppSubmitBtn(){
		Activity.clk_AppSubmit_btn.click();
	}
	
	public void ClkPreviewBtn(){
		Activity.clk_Preview_btn.click();
	}


	/* @author ${Shalini Singh}
     * Method of Add Schedule call Activity
     * Date 13 Sep 2017
    */
	
	public void enterSchCallSubject(String SchedulecallSubject){
		Activity.enter_schCallSubject_txt.sendKeys(SchedulecallSubject);
	}
	
	public void enterContactNo(String ContactNo){
		Activity.enter_ContactNo_txt.sendKeys(ContactNo);
	}
	
	public void enterContactName(String ContactName){
		Activity.enter_contactName.sendKeys(ContactName);
	}
	
	public void clkSchCallStartDate(){
		Activity.clk_schcall_startDate.click();
	}
	
	public void selPriority(String Priority){
		new Select(Activity.sel_priority_drpdwn).selectByVisibleText(Priority);
	}
	
	public void clkSchCallReminderDate(){
		Activity.clk_schcall_reminderDate.click();
	}
	
	public void selAssigneToRole(String RoleName){
		new Select(Activity.sel_assignTorole_drpdwn).selectByVisibleText(RoleName);
	}
	
	public void selAssigneToUser(String AssignUserName){
		new Select(Activity.sel_assigneToUser_drpdwn).selectByVisibleText(AssignUserName); 
	}
	
	public void enterSchCallDecription(String SchCallDescription){
		Activity.enter_SchcallDesc_txt.sendKeys(SchCallDescription);
	}
	
	public void clkSchCallSubmitBtn(){
		Activity.clk_schcallSubmit_btn.click();
	}
	
	public void clkSchCallCancelBtn(){
		Activity.clk_schCallCancel_btn.click();
	}
	
	
	/* @author ${Shalini Singh}
     * Method of Add Note
     * Date 13 Sep 2017
    */
	
	public void enterNoteSubject(String NoteSubject){
		Activity.enter_subjectNote_txt.sendKeys(NoteSubject);
	}
	
	public void enterNotDescription(String NoteDescription){
		Activity.enter_NoteDec_txt.sendKeys(NoteDescription);
	}
	
	public void clkNoteSubmitBtn(){
		Activity.clk_NoteSubmit_btn.click();
	}
	
	public void clkNoteCancelBtn(){
		Activity.clk_noteCancel_btn.click();
	}
	
	
	
	/* @author ${Shalini Singh}
     * Method of Add To Do Activity
     * Date 13 Sep 2017
    */
	
	public void enterToDoSubject(String ToDoSubject){
		Activity.enter_toDoSubject_txt.sendKeys(ToDoSubject);
	}
	
	public void clkToDoStartDate(){
		Activity.clk_toDoStartDate.click();
	}
	
	public void clkToDoEndDate(){
		Activity.clk_toDoEndDate.click();
	}
	
	public void clkToDoReminderDate(){
		Activity.clk_toDoReminderDate.click();
	}
	
	public void clkMySelfchkbox(){
		Activity.clk_mySelf_chkbox.click();
	}
	
	public void selToDoRole(String Role){
		new Select(Activity.sel_toDoRole_drpdwn).selectByVisibleText(Role);
	}
	
	//public void sel
}