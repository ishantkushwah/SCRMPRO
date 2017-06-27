package scrmpro.appmethods.com;

import scrmpro.pom.com.AccountPage;
import scrmpro.pom.com.ContractPage;
import scrmpro.pom.com.QuotePage;

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
        ContractPage.Sel_active_on.click();  
        ContractPage.Sel_active_on.sendKeys(date,month,year);
   }
	
	public void selOppName(String OppName){
	   new Select(ContractPage.Sel_opportunity).selectByVisibleText(OppName);
	}
	
	public void selIndustryName(String IndustryName){
		new Select(ContractPage.Sel_industry).deselectByVisibleText(IndustryName);
	}

	public void enterContractTitle(String QuoteName){
		ContractPage.enter_title.sendKeys(QuoteName);
	}
	
	public void selContractStatus(String ContractStatus){
		new Select(ContractPage.Sel_state).selectByVisibleText(ContractStatus);
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
//If above method does not work than use below method
 /*
	public void selBillingEndDate(String date,String month,String year){
		ContractPage.Sel_billing_end_on.click();
		ContractPage.Sel_billing_end_on.sendKeys(date,month,year);
	}
	
	public void selExpireDate(String date,String month,String year){
		ContractPage.Sel_expires_on.click();
		ContractPage.Sel_expires_on.sendKeys(date,month,year);
	}*/
	
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
	    * Methods of Add Address of Contract 
	    * Date 2 Aug 2017
	    */ 

	public void clkAddressAccordion(){
		ContractPage.clk_contract_address_info.click();
	}
	
	public void clkNewAddressBtn(){
		ContractPage.clk_new_address_button.click();
	}
	
	public void selAddressName(String AddressName){
		new Select(ContractPage.Sel_addressName).selectByVisibleText(AddressName);
	}
	
	public void enterAddress(String Address){
		ContractPage.enter_address.sendKeys(Address);
	}
	
	public void selStreet(String Street){
 		new Select(ContractPage.sel_street).selectByVisibleText(Street);
 	}

 	public void selCity(String City){
 		new Select(ContractPage.sel_city).selectByVisibleText(City);
 	}

 	public void entrZipCode(String Zip){
 		ContractPage.enter_zipcode.sendKeys(Zip);
 	}

 	public void selQuoteState(String State){
 		new Select(ContractPage.sel_state).selectByVisibleText(State);
 	}

 	public void selQuoteCuntry(String Country){
 		new Select(ContractPage.sel_country).selectByVisibleText(Country);
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
	
	public void clkInvoicebtn(){
		ContractPage.click_invoice_btn.click();
	}
	
	/* @author ${Shalini Singh}
	    * Method of Add Product to Milestone for Contract moduel 
	    * Date 3 Aug 2017
	    */
	
	public void clkBindBtn(){
		ContractPage.clk_bind_btn.click();
	}
	
	public void enterOrderedQuantity(String OrderedQuantity){
		ContractPage.enter_ordered_quantity.sendKeys(OrderedQuantity);
	}
	
	public void enterTax(String Tax){
		ContractPage.enter_taxes.sendKeys(Tax);
	}
	
	public void enterDescription(String Description){
		ContractPage.enter_description.sendKeys(Description);
	}
	
	public void clkAddNewMilestoneBtn(){
		ContractPage.clk_add_new_milestone_btn.click();
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
