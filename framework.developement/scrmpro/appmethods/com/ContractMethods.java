package scrmpro.appmethods.com;


import scrmpro.pom.com.ContractPage;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
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
		ContractPage. clk_ContractActiveOn.click();
		 
   }
	
	public void selOppName(String OppName){
	   new Select(ContractPage.sel_opp_drpdwn).selectByVisibleText(OppName);
	}
	
	public void selIndustryName(String IndustryName){
		new Select(ContractPage.sel_industry_drpdwn).selectByVisibleText(IndustryName);
	}

	public void enterContractTitle(String QuoteName){
		ContractPage.enter_title_txt.sendKeys(QuoteName);
	}
	
	public void selContractStatus(String ContractStatus){
		new Select(ContractPage.sel_status_drpdwn).selectByVisibleText(ContractStatus);
	}
	
	public void selBillingStartDate(){
		ContractPage.clk_billing_startsOn.click();
		 
	}
	
	public void selBillingendtDate(){
		ContractPage.clk_billing_endOn.click();
		 
	}	
	
	public void selExpireDate(){
		ContractPage.clk_expiresOn.click();
	}
	
	public void selcanceldate(){
		ContractPage.clk_cancelOn.click();
		 
	}
 
	
	public void selBillingCustomer(String BillingCustomer){
		new Select(ContractPage.sel_billingCustomer_drpdwn).selectByVisibleText(BillingCustomer);
	}
	
	public void selCurrency(String Currency){
		new Select(ContractPage.sel_currency_drpdwn).selectByVisibleText(Currency);
	}
	
	public void selDepartmentName(String DepartmentName){
		new Select(ContractPage.sel_department_drpdwn).selectByVisibleText(DepartmentName);
	}
	
	public void enterTermCondition(String TearmCondition){
		ContractPage.enter_termsCondition.sendKeys(TearmCondition);
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
	 
	 public void enterDueDate(){
	      ContractPage.clk_dueOn.click();  
           
     }
	 
	public void enterWorkAmmount(String WorkAmmount){
		ContractPage.enter_workAmount_txt.sendKeys(WorkAmmount);
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
		ContractPage.enter_ordQut_txt.sendKeys(qut);
	}
	
	public void enterTax(String Tax){
		ContractPage.sel_taxes_drpdwn.sendKeys(Tax);
	}
	
	public void enterDescription(String Description){
		ContractPage.enter_description_txt.sendKeys(Description);
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
    	ContractPage.clk_contact_info_accordion.click();
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
    
   public void Closedpopupwindow(){
     	
     	for (String winHandle : driver.getWindowHandles()) {
     	    driver.switchTo().window(winHandle);  
     	}
     	
     	  driver.close(); 
     	  
     	}
    public void clkRecentupdateAccordion(){
    	ContractPage.clk_recent_update_accordion.click();
    }
    
    
}
