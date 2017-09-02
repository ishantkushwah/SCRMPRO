package scrmpro.appmethods.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import scrmpro.pom.com.LeadPage;
import scrmpro.pom.com.LoginPage;

public abstract class LeadMethods extends LoginMethods {

	public void Click_LeadTab() {
		LeadPage.click_Lead_tab.click();
	}

	public void Click_AddnewBtn() {
		
		LeadPage.click_AddnewLead_btn.click();
	}

	public void EnterLeadTitle(String title) {
		LeadPage.Lead_Title_txt.sendKeys(title);
	}

	public void Enter_Company(String company) {
		LeadPage.Lead_company_txt.sendKeys(company);
	}

	public void Enter_FirstName(String Fname) {
		LeadPage.Lead_first_name.sendKeys(Fname);
	}

	public void Enter_LastName(String LName) {
		LeadPage.Lead_lastname_txt.sendKeys(LName);
	}

	public void Enter_Email(String Email) {
		LeadPage.Lead_Email_address.sendKeys(Email);
	}

	public void Enter_LeadPriority(String Priority) {
		new Select(LeadPage.Lead_Priority_Dropdown).selectByVisibleText(Priority);

	}

	public void Enter_LeadStatus(String Status) {
		new Select(LeadPage.Lead_Status_dropdwon).selectByVisibleText(Status);
	}

	public void Enter_Lead_revenue(String leadrevenue) {
		LeadPage.Lead_Revenue_txt.sendKeys(leadrevenue);
	}

	public void Enter_LeadCampaign(String campaign) {
		new Select(LeadPage.Lead_Camapin_dropwon).selectByVisibleText(campaign);
	}

	public void Enter_lead_Email(String email) {
		LeadPage.Lead_Email_address.sendKeys(email);
	}

	public void Enter_LeadSource(String Source) {
		new Select(LeadPage.Lead_Source_dropdown).selectByVisibleText(Source);
	}

	public void Click_Save_btton() {
		LeadPage.Lead_Save_button.click();
	}

	public void Click_NewSave() {
		LeadPage.Lead_Savenew_button.click();
	}

	public void Click_edit_btn() {
		LeadPage.Lead_edit_btn.click();
	}

	public void Click_Clone_btn() {
		LeadPage.Lead_Clone_btn.click();
	}

	public void Click_Sendmail() {
		LeadPage.Lead_sendmail_btn.click();
	}

	public void Sendmail_To(String To) {
		LeadPage.Sendmail_Compose_To.sendKeys(To);
	}

	public void Enter_Lead_phonenumber(CharSequence[] phone) {
		LeadPage.Lead_tele_phone.sendKeys(phone);
	}

	public void Enter_no_of_employee(String number) {
		LeadPage.nameofuser.sendKeys(number);
	}

	public void Enter_lead_mobile(String mobile) {
		LeadPage.Lead_mobile_txt.sendKeys(mobile);
	}

	public void Enter_lead_Description(String desc) {
		LeadPage.Lead_Description.sendKeys(desc);
	}

	public void Enter_lead_designations(String des) {
		LeadPage.Lead_Designation_txt.sendKeys(des);
	}

	public void Sendmail_cc(String cc) {
		LeadPage.Sendmail_Compose_cc.sendKeys(cc);
	}

	public void Select_All_Lead() {
		LeadPage.Select_All_Lead.click();
	}
	
	
	public void clickLeadConvertbtn(){
		LeadPage.btn_leadConvert.click();
		LeadPage.btn_ConvertOk.click();
	}

	

	public void Select_Lead_Source(String source) {
		new Select(LeadPage.Lead_Source_dropdown).selectByVisibleText(source);
	}

	public void Select_Lead_Campaign(String campain) {
		new Select(LeadPage.Lead_Camapin_dropwon).selectByVisibleText(campain);
	}

	public void Select_Lead_Clone() {
		LeadPage.Lead_Clone_btn.click();
	}

	public boolean actualResultAddnewLead() {
		return LeadPage.click_AddnewLead_btn.isEnabled();

	}

	public boolean actualResultForLeadModule() {
		return LeadPage.click_Lead_tab.isDisplayed();
	}
	
	public void clickSalesModule(){
		LoginPage.link_sales.click();
		LoginPage.link_salesModule.click();
	}
	
	public void actiontocreatecontact(){
		
		driver.switchTo().alert().accept();
	}
/*
	public void openaleadfromgrid(String title){
		//*[@id='LeadTbl']/tbody/tr/td[4]
	List<WebElement> list = driver.findElements(By.xpath(".//*[@id='LeadTbl']/tbody/tr/td[4]"));
	for(WebElement leadtitle:list){
		if(leadtitle.getText().equalsIgnoreCase(title)){
			leadtitle.click();
		}
	}
*/	
	public void openaleadfromgrid(String Title, int i) {
		 
  	  String firstPath= ".//*[@id='LeadTbl']/tbody/tr[";
	      String endPath= "]/td[4]"; 
	      String  fullpath = firstPath +i+ endPath;
	       List<String> newList =new ArrayList<>();
	       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='LeadTbl']/tbody/tr/td[4]"));
	       for(int j=0; j < list.size(); j++)
	       {
	    	  newList.add(list.get(j).getText());
	       } 
	     	 if (newList.contains(Title)){
	     		WebElement leadtitle = driver.findElement(By.xpath(fullpath));
	     		leadtitle.click();	
	     	 }
	}

	
	public void clickDuplicateojbtn(){
		
		LeadPage.cnfirmDuplicate.click();
	}

}
