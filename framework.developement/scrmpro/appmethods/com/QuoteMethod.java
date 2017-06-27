package scrmpro.appmethods.com;
  

 import scrmpro.pom.com.AccountPage;
 import scrmpro.pom.com.QuotePage;
 
 import java.util.List;
 import org.openqa.selenium.By;
 import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.Select;
 
 public class QuoteMethod extends LoginMethods{

          /* @author ${Shalini Singh}
	    * Methods of Add Quote module
	    */ 
 
 
     public void clkQuoteTab(){
 
        QuotePage.clk_Quote_tab.click();
     }
 
      public void clkAddNewQuote(){
        QuotePage.clk_addnewbtn.click();
    }
 
      public void quoteName(String Name){
         QuotePage.entr_quote_name.sendKeys(Name);
    }
 
      public void clkAccountSearch() {
          QuotePage.clk_account_search_Btn.click();
    }
 
      public void selAccountName(String Account) {
         new Select(QuotePage.sel_accountname_drpdwn).selectByVisibleText(Account);
    }
 
      public void clkOppSearch() {
         QuotePage.clk_opp_search_btn.click();
    }
      public void selOppName(String Opp) {
        new Select(QuotePage.sel_quote_opp_drpdwn).selectByVisibleText(Opp);
    }
 
      public void selquoteIndusty(String Industry) {
         new Select(QuotePage.sel_quoteindustry_drpdwn).selectByVisibleText(Industry);
    }
      public void selquoteStatus(String Status) {
        new Select(QuotePage.sel_quotestatus_drpdwn).selectByVisibleText(Status);
    }
      public void sel_quotepaymentTerm(String Payment) {
        new Select(QuotePage.sel_quote_paymentTerm_drpdwn ).selectByVisibleText(Payment);
    }
 
      public void Txt_quoteValidTill(String month, String date, String year){
          QuotePage.txt_Quote_ValidTill.click();
    	  QuotePage.txt_Quote_ValidTill.sendKeys(month, date, year);
 		
    }
 
      public void sel_QuoteCurrency(int i){
     	  Select sel = new Select(QuotePage.sel_quote_Currency_drpdwn);
     	   sel.selectByIndex(i);
    }
 
      public void entrQuoteCondition(String TermCondition){
         QuotePage.entr_quoteterms_condition.sendKeys(TermCondition);
    }
 
      public void clkQuoteSave(){
         QuotePage.clk_quote_save_btn.click();
    }
 
      public void clkQuoteBack(){
         QuotePage.Clk_quote_back_btn.click();
    }
 
      public void clkQuoteSaveNew(){
          QuotePage.clk_quote_SavenewBtn.click();
    }
 
      public void clkQuoteClose(){
          QuotePage.clk_quoteclose_btn.click();
    }
 
      public void clkQuoteline(){
          QuotePage.clk_qline.click();
    }
 
      public void clkQuoteSearch(){
          QuotePage.clk_search_qline_item.click();
    }
 
      public void selQuoteCurrency(String Currency){
         new Select(QuotePage.sel_currency_Drpdwn).selectByVisibleText(Currency);
        
    }
      public void clkQuoteProductChkbox(){
         QuotePage.clk_All_Product_chkbox.click();
    }
 
      
      public void selProducts() {
 
  		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[1]"));
 
  		// Scroll the browser to the element's X position
 
  		((JavascriptExecutor) driver).executeScript("window.scrollTo(0"+ elementToClick.getLocation().x+ ")");
 
  		elementToClick.click();
 
      }
      public void entr_Search_QuoteProductCategory(String Category){
     	 QuotePage.txt_search_product_catgry.sendKeys(Category);
     	 
      }
      public void enter_Search_QuoteProductName(String ProductName){
     	 QuotePage.txt_search_product_name.sendKeys(ProductName); 
      }
       
      public void entr_Search_QuoteProductQut( CharSequence[] ProductQut){
     	 QuotePage.txt_search_product_qty.sendKeys(ProductQut);
      }
      
      public void clkQuoteLineBind(){
          QuotePage.clk_qLineItemBindbtn.click();
    }
 
      public void clkQuoteViewPrduct(){
     		QuotePage.clk_view_product.click();
     	}
 
     	public void clkQuoteLineDisplay(){
     		QuotePage.qLineItems_displayed.click();
     		
     	}
     	// Address Information
 
     	public void clkQuoteAddressInfo(){
     		QuotePage.clk_Addres_info.click();
     	}
 
     	public void selQuoteAddress(String Addressinfo){
     		new Select(QuotePage.sel_sddressName_Drpdwn).selectByVisibleText(Addressinfo);
     	}
     	public void chkQuoteDefaultAddress(){
     		QuotePage.chk_DefaultAddress.click();
     	}
 
     	public void enterQuoteAddress(String Address){
     		QuotePage.entr_address.sendKeys(Address);
     	}
 
     	public void selQuoteStreet(String Street){
     		new Select(QuotePage.sel_street).selectByVisibleText(Street);
     	}
 
     	public void selQuoteCity(String City){
     		new Select(QuotePage.sel_city).selectByVisibleText(City);
     	}
 
     	public void entrQuoteZipCode(String Zip){
     		QuotePage.entr_zipcode.sendKeys(Zip);
     	}
 
     	public void selQuoteState(String State){
     		new Select(QuotePage.sel_state).selectByVisibleText(State);
     	}
 
     	public void selQuoteCuntry(String Country){
     		new Select(QuotePage.sel_country).selectByVisibleText(Country);
     	}
     	
 // ddfdffgfg
      
     	
     	 // Quote View,Edit and Delete
     	
     	public void clkAndOpenQuote(){
     	for(int row =1; row<=20; row++) 
     	{   
     		WebElement clkonQuote = driver.findElement(By.xpath(".//*[@id='QuoteTbl']/tbody/tr["+row+"]/td[4]")); 
     		
     		clkonQuote.click();
     	}
     	
     	}
     	
     	public void clkAndeEditQuote(){
         	for(int row =1; row<=5; row++) 
         	{   
         		WebElement clkoneditIcon = driver.findElement(By.xpath("//*[@id='QuoteTbl']/tbody/tr["+row+"]/td[2]")); 
         		
         		clkoneditIcon.click();
         	}
         	
         	}
     	
     	public void clkQuotePreviewBtn(){
     		QuotePage.clk_preview_btn.click();
     	}
     	
     	String parentHandle = driver.getWindowHandle();
     	
     	public void clkQuoteDocumentAccordion(){
     		QuotePage.clk_Document_accordion.click();
     		
     	for (String winHandle : driver.getWindowHandles()) {
     	    driver.switchTo().window(winHandle);  
     	  driver.close(); 
     	  driver.switchTo().window(parentHandle);
     	}
     }
     	public void clkQuoteAddDocumentBtn(){
     		QuotePage.clk_AddDocument_Btn.click();
     	}
     	
     	public void clkQuoteBrowseBtn(){
     		QuotePage.clk_browse_btn.click();
     	}
     	
     	public void clkQuoteUploadBtn(){
     		QuotePage.clk_upload_btn.click();
     	}
     	
     	public void clkAndedeleteQuote(){
         	for(int row =1; row<=5; row++) 
         	{   
         		WebElement clkondeleteIcon = driver.findElement(By.xpath("//*[@id='QuoteTbl']/tbody/tr["+row+"]/td[1]")); 
         		
         		clkondeleteIcon.click();
         	}
         	
        }
     	 
     	 
     	public void clkQuoteview() {
     		QuotePage.clk_view_qName.click();
     	}
     	
     	public void clkQuoteEditBtn(){
     		QuotePage.clk_edit_btn.click();
     	}
     	
     	public void clkQuoteReviewAccordion(){
     		QuotePage.clk_review_hitory_accordion.click();
     	}
     	
     	public void clkQuote360View(){
     		QuotePage.clk_360view_accordion.click();
     	}
     	
     	public void clkQuoteEmailAccordion(){
     		QuotePage.clk_email_accordion.click();
     	}
     	
     	public void clk_QuoteRecent_Update_Acco(){
     		QuotePage.clk_recentUpdate_accordion.click();
     	}
    // More Actions and Tool	
     	
     	public void clkQuoteMoreActionBtn(){
     		QuotePage.clk_moreaction_drpdwn.click();
     	}
     	
     	public void selQuoteMassEdit(String MassEdit){
     		new Select(QuotePage.sel_quote_massedit).selectByVisibleText(MassEdit);
     	}
     	
     	public void selQuoteMassDelete(String MassDelete){
     	   new Select(QuotePage.sel_quote_massdelete).selectByVisibleText(MassDelete);
     	}
     	
     	public void selQuoteShareRecord(String ShareRecord){
     		new Select(QuotePage.sel_quote_sharerecord).selectByVisibleText(ShareRecord);
     	}
     	
     	public void clk_Quotetool(){
     		QuotePage.clk_tool_drpdwn.click();
     	}
     	
     	public void sel_QuotecustomView(String CustomView){
     		new Select(QuotePage.sel_quote_customView_drpdwn).selectByVisibleText(CustomView);
     	}
     	
     	public void selFromMoreactions(String actionsName){
     		if(actionsName.equalsIgnoreCase("Convert")){
     				
     		new Select(QuotePage.sel_quote_convert).selectByIndex(1);
     			
     		}
     		else if(actionsName.equalsIgnoreCase("ChangeOwner")){
     			 new Select(QuotePage.sel_quote_changeowner).selectByIndex(2);
     				
     		}
     		else if(actionsName.equalsIgnoreCase("MassEdit")){
    			new Select(QuotePage.sel_quote_massedit).selectByIndex(3);
    			
     		}
     		
     		else if(actionsName.equalsIgnoreCase("MassDelete")){
   			  new Select(QuotePage.sel_quote_massdelete).selectByIndex(4);
   				
     		}
     		
     		else{  
     	        new Select(QuotePage.sel_quote_sharerecord).selectByIndex(5);
   				
		}
     	
     	}
 }
