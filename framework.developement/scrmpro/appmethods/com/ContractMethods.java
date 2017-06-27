package scrmpro.appmethods.com;

import scrmpro.pom.com.AccountPage;
import scrmpro.pom.com.ContractPage;
import scrmpro.pom.com.QuotePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContractMethods extends LoginMethods  {
	
   /* @author ${Shalini Singh}
    * Methods of Add Contract module 
    * Date 1 Aug 2017
    */ 
	 
	public void clkContractTab(){
		ContractPage.clk_Contract_tab.click();
	}
	
	public void selActiveOn(String date,String month,String year){
		ContractPage.clk_ContractActiveOntab.click();
		 
   }
	
	public void selOppName(String OppName){
	   new Select(ContractPage.Sel_opportunity).selectByVisibleText(OppName);
	}
	
	public void selIndustryName(String IndustryName){
		new Select(ContractPage.Sel_industry).selectByVisibleText(IndustryName);
	}

	public void enterContractTitle(String QuoteName){
		ContractPage.enter_title.sendKeys(QuoteName);
	}
	
	public void selContractStatus(String ContractStatus){
		new Select(ContractPage.Sel_status).selectByVisibleText(ContractStatus);
	}
	
	public void selBillingStartDate(String date,String month,String year){
		ContractPage.Sel_billing_starts_on.click();
		ContractPage.Sel_billing_starts_on.sendKeys(date,month,year);
		ContractPage.Sel_billing_end_on.click();
		ContractPage.Sel_billing_end_on.sendKeys(date,month,year);
		ContractPage.Sel_expires_on.click();
		ContractPage.Sel_expires_on.sendKeys(date,month,year);
		ContractPage.Sel_cancel_on.click();
		ContractPage.Sel_cancel_on.sendKeys(date,month,year);
	}
 
	
	public void selBillingCustomer(String BillingCustomer){
		new Select(ContractPage.Sel_billing_customer).selectByVisibleText(BillingCustomer);
	}
	
	public void selCurrency(String Currency){
		new Select(ContractPage.Sel_currency).selectByVisibleText(Currency);
	}
	
	public void selDepartmentName(String DepartmentName){
		new Select(ContractPage.Sel_department).selectByVisibleText(DepartmentName);
	}
	
	public void enterTermCondition(String TearmCondition){
		ContractPage.enter_terms_and_condition.sendKeys(TearmCondition);
	}
	
	
	
 	/* @author ${Shalini Singh}
	    * Method of milestone for Contract
	    * Date 2 Aug 2017
	    */
	
	
	
	 public void clkMilestoneAccordion(){
		 ContractPage.clk_Milestone_accordion.click();
	 }
	 
	 public void enterMilstoneName(String MilstoneName){
		 ContractPage.enter_milestone_name.sendKeys(MilstoneName);
	 }
	 
	 public void enterAmmountToPaye(String AmmountToPaye){
		 ContractPage.enter_amount_to_pay.sendKeys(AmmountToPaye);
	 }
	 
	 public void enterDueDate(String date,String month,String year){
	      ContractPage.enter_due_on.click();  
          ContractPage.enter_due_on.sendKeys(date,month,year);
     }
	 
	public void enterWorkAmmount(String WorkAmmount){
		ContractPage.enter_work_amount.sendKeys(WorkAmmount);
	}
	 
	// .//*[@id='m1']/tbody/tr[2]/td[12]
	
	public void clkaddProductToMilstoneIcon(int i) {
		 
	   	  String firstPath= ".//*[@id='m";
	 	      String endPath= "']/tbody/tr[2]/td[12]"; 
	 	      String  fullpath = firstPath +i+ endPath;
	 	     driver.findElement(By.xpath(fullpath)).click();
		 }
	
	
	// .//*[@id='m1']/tbody/tr[2]/td[10]
	
	 public void clkDeleteMilstone(int i) {
		 
   	  String firstPath= ".//*[@id='m";
 	      String endPath= "']/tbody/tr[2]/td[10]"; 
 	      String  fullpath = firstPath +i+ endPath;
 	     driver.findElement(By.xpath(fullpath)).click();
	 }
	
	public void clkInvoicebtn(){
		ContractPage.clk_invoice_btn.click();
	}
	
	/* @author ${Shalini Singh}
	    * Method of Add Product to Milestone for Contract module
	    * Date 3 Aug 2017
	    */
	
	 
	// .//*[@id='chbx_m1p0']
	
		public void selQuoteProduct(String ProductName,int i,int j) {
			 
	  	  String firstPath= ".//*[@id='chbx_m";
	  	  String SecondPath = "p"; 
		      String endPath= "']"; 
		      String  fullpath = firstPath +i+SecondPath+j+ endPath;
		       List<String> newList =new ArrayList<>();
		       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[2]"));
		       for(int k=0; k < list.size(); k++)
		       {
		    	  newList.add(list.get(j).getText());
		       } 
		     	 if (newList.contains(ProductName)){
		     		WebElement checkbox = driver.findElement(By.xpath(fullpath));
		     		checkbox.click();	
		     	 }
	    }
	
	
	public void clkBindBtn(){
		ContractPage.clk_bind_btn.click();
	}
	
	public void enterOrdQut(String qut){
		ContractPage.enter_ordQut.sendKeys(qut);
	}
	
	public void enterTax(String Tax){
		ContractPage.enter_taxes.sendKeys(Tax);
	}
	
	public void enterDescription(String Description){
		ContractPage.enter_description.sendKeys(Description);
	}
	
	public void clkAddNewMilestoneBtn(){
		ContractPage.clk_newMilestone_btn.click();
	}
	
	public void clksavebtn(){
		ContractPage.clk_save_btn.click();
	}
	
	public void clkCancelbtn(){
    	ContractPage.clk_cancel_btn.click();
    }
	
	
	/* @author ${Shalini Singh}
	    * Method of Contract 360 view 
	    * Date 3 Aug 2017
	    */
	
	public void clk360viewAccordion(){
		ContractPage.clk_360_view_accordion.click();
	}
	
	public void clkLead360View(){
 	    ContractPage.clk_360_view_lead_tab.click();
	}
	
	public void clkAccount360view(){
		ContractPage.clk_360_view_account_tab.click();
	}
	
	public void clkOpportunity360View(){
 	    ContractPage.clk_360_view_opp_tab.click();
	}
	
	public void clkQuote360view(){
		ContractPage.clk_360_view_quote_tab.click();
	}
	
	public void clkContract360View(){
 	    ContractPage.clk_360_view_contract_tab.click();
	}
	
	public void clkInvoice360view(){
		ContractPage.clk_360_view_invoice_tab.click();
	}
	
	public void clkCase360view(){
		ContractPage.clk_360_view_case_tab.click();
	}
	
	public void clkCampaign360View(){
 	    ContractPage.clk_360_view_campaign_tab.click();
	}
	
	public void clkProduct360view(){
		ContractPage.clk_360_view_product_tab.click();
	}
	
	/* @author ${Shalini Singh}
	    * Method of More Action and tools Contract module
	    * Date 4 Aug 2017
	    */
	
	
 //	.//*[@id='ContractTbl']/tbody/tr[1]/td[1]
	
	 public void clkContractCheckbox(String contractName,int i){	
	     	String firstPath= ".//*[@id='ContractTbl']/tbody/tr[";
	        String endPath= "]/td[1]"; 
	       String  fullpath = firstPath +i+ endPath;
	       List<String> newList =new ArrayList<>();
	       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='ContractTbl']/tbody/tr/td[1]"));
	       for(int j=0; j < list.size(); j++)
	       {
	    	  newList.add(list.get(j).getText());
	       } 
	     	 if (newList.contains(contractName)){
	     		WebElement Checkbox = driver.findElement(By.xpath(fullpath));
	     		Checkbox.click();	 
	     		 
	     	 }
	    	} 
	
 	 
	public void clkMoreActionDrpdwn(){
		ContractPage.clk_more_actions.click();
	}
	
	public void selFromMoreactions(String actionsName){
		if(actionsName.equalsIgnoreCase("ChangeOwner")){
		
		new Select(ContractPage.sel_change_owner).selectByIndex(1);
	}
	 else{
			
		new Select(ContractPage.sel_share_record).selectByIndex(2);
		}
			
	}
	
	// To shared record on basic of Reporting user, Group , Same level.
	
	
	// .//*[@id='ddlUserList']/optgroup[]/option[]
	
	 public void selUser(String UserName,int i, int j){	
	     	String firstPath= ".//*[@id='ddlUserList']/optgroup[";
	        String SecondPath= "]/option["; 
	        String endPath= "]";
	       String  fullpath = firstPath +i+SecondPath+j+ endPath;
	       List<String> newList =new ArrayList<>();
	       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='ddlUserList']/optgroup"));
	       for(int k=0; k < list.size(); k++)
	       {
	    	  newList.add(list.get(k).getText());
	       } 
	     	 if (newList.contains(UserName)){
	     		WebElement userName = driver.findElement(By.xpath(fullpath));
	     		userName .click();	 
	     		 
	     	 }
	    	} 
	
	
	public void clkSharedbtn(){
		ContractPage.clk_share_btn.click();
	}
	
	public void clkUnsharedbtn(){
		ContractPage.clk_unshare_btn.click();
	}
	
	public void clkSharedCancelbtn(){
		ContractPage.clk_shareRecord_cancel_btn.click();
	}
	
	public void clkTooldrpdwn(){
		ContractPage.clk_tools_drpdwn.click();
	}
	
	
	
 			
    /* @author ${Shalini Singh}
     * Method of Export functionality of Contract module
     * Date 4 Aug 2017
    */
  
    public void clkExportbtn(){
	  ContractPage.clk_export_btn.click();
   }
    
    public void clkAllExport(){
    	ContractPage.clk_all_export.click();
    }
    
    public void clkExportPdfbtn(){
    	ContractPage.clk_export_pdf_btn.click();
    }
    
    public void clkclkExportExcelbtn(){
    	ContractPage.clk_export_excel_btn.click();
    }
    
    public void clkclkExportcsvbtn(){
    	ContractPage.clk_export_csv_btn.click();
    }
   
    /* @author ${Shalini Singh}
     * Method of view, edit, delete of Contract module
     * Date 4 Aug 2017
    */ 
    
    // .//*[@id='ContractTbl']/tbody/tr/td[4]
    
    public void clkAndOpenQuote(String contractName,int i){	
     	String firstPath= ".//*[@id='ContractTbl']/tbody/tr[";
        String endPath= "]/td[4]"; 
       String  fullpath = firstPath +i+ endPath;
       List<String> newList =new ArrayList<>();
       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='ContractTbl']/tbody/tr/td[4]"));
       for(int j=0; j < list.size(); j++)
       {
    	  newList.add(list.get(j).getText());
       } 
     	 if (newList.contains(contractName)){
     		WebElement contractview = driver.findElement(By.xpath(fullpath));
     		contractview.click();	 
     		 
     	 }
    	} 
    
  // .//*[@id='ContractTbl']/tbody/tr[1]/td[2]
    
    public void clkAndeEditContract(String contractName,int i){	
     	String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
        String endPath= "]/td[2]"; 
        String  fullpath = firstPath +i+ endPath;
       List<String> newList =new ArrayList<>();
       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[2]"));
       for(int j=0; j < list.size(); j++)
       {
    	  newList.add(list.get(j).getText());
       } 
     	 if (newList.contains(contractName)){
     		WebElement  contractEditicon = driver.findElement(By.xpath(fullpath));
     		contractEditicon.click();	
     	 }
	} 
    
  //  .//*[@id='ContractTbl']/tbody/tr[1]/td[2]
    
    public void clkAndDelContract(String contractName,int i){	
     	String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
        String endPath= "]/td[3]"; 
        String  fullpath = firstPath +i+ endPath;
       List<String> newList =new ArrayList<>();
       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[3]"));
       for(int j=0; j < list.size(); j++)
       {
    	  newList.add(list.get(j).getText());
       } 
     	 if (newList.contains(contractName)){
     		WebElement  contractDelIcon = driver.findElement(By.xpath(fullpath));
     		contractDelIcon.click();	
     	 }
	} 
    
    
    public void clkEditContractbtn(){
    	ContractPage.clk_edit_btn.click();
    }
    
    public void clkBackbtn(){
    	ContractPage.clk_back_btn.click();
    }
    
    public void clkClosebtn(){
    	ContractPage.clk_close_btn.click();
    }
    
    public void clkPreviewbtn(){
    	ContractPage.clk_preview_btn.click();
    }
    
    public void clkContactAccordion(){
    	ContractPage.clk_contact_information_accordion.click();
    }
    
    public void AddContactbtn(){
    	ContractPage.clk_add_contact_btn.click();
    }
    
    public void clkbrowsebtn(){
    	ContractPage.clk_browse_btn.click();
    }
    
    public void clkUploadbutton(){
    	ContractPage.clk_add_picture.click();
    }
    
    public void clkUploadbtn(){
    	ContractPage.clk_upload_btn.click();
    }
    
    public void clkSendmail(){
    	ContractPage.clk_send_mail_btn.click();
    }
    
    public void clkRecentupdateAccordion(){
    	ContractPage.clk_recent_update_accordion.click();
    }
    
    
}
