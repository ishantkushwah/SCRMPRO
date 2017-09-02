package scrmpro.appmethods.com;
  

 import scrmpro.pom.com.AccountPage;
import scrmpro.pom.com.OppPage;
import scrmpro.pom.com.QuotePage;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
 import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import scrmpro.appmethods.com.LeadMethods;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.Select;
 
 public abstract class QuoteMethods extends LeadMethods{
	 
	OppPage Opp = new OppPage(driver);

          /* @author ${Shalini Singh}
	    * Methods of Add Quote module
	    */ 
	  
 
     public void clkQuoteTab(){
 
        QuotePage.clk_Quote_tab.click();
     }
 
      public void clkAddNewQuote(){
        QuotePage.clk_addnewbtn.click();
    }
 
      public void enterQuoteName(String Name){
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
 
      public void Txt_quoteValidTill(){
          QuotePage.clk_QuoteValidTill.click();
                  
      }
 
      public void sel_QuoteCurrency(int i){
     	  Select sel = new Select(QuotePage.sel_quote_Currency_drpdwn);
     	   sel.selectByIndex(i);
    }
 
      public void entrQuoteCondition(String TermCondition){
         QuotePage.entr_quoteterms_condition.sendKeys(TermCondition);
    }
 
      public void clkQuoteSavebtn(){
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
 
      public void selQuoteCurrency(int i){
    	  Select sel = new Select(QuotePage.sel_currency_Drpdwn);
    	  sel.selectByIndex(i);
        
    }
      public void clkQuoteProductChkbox(){
         QuotePage.clk_All_Product_chkbox.click();
    }
 

      public void selQuoteProduct(String ProductName, int i ) {
    	  // .//*[@id='ProductTbl']/tbody/tr/td[1]
    	   String firstPath= ".//*[@id='ProductTbl']/tbody/tr[";
  	      String endPath= "]/td[1]"; 
  	      String  fullpath = firstPath +i+ endPath;
  	       List<String> newList =new ArrayList<>();
  	       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[3]")); 
  	        
  	       for(int j=0; j < list.size(); j++)
  	       {
  	    	 
  	    	  newList.add(list.get(j).getText());  
  	       } 
  	       
  	     	 if (newList.contains(ProductName)){ 
  	     	WebElement checkbox = driver.findElement(By.xpath(fullpath)); 
  	     		checkbox.click();	
  	     	 }
      }	
  
      public void enter_Search_QuoteProductCategory(String Category){
     	 QuotePage.txt_search_product_catgry.sendKeys(Category);
     	 
      }
      public void enter_Search_QuoteProductName(String ProductName){
     	 QuotePage.txt_search_product_name.sendKeys(ProductName); 
      }
       
      public void entr_Search_QuoteProductQut(String ProductQut){
     	 QuotePage.txt_search_product_qty.sendKeys(ProductQut);
      }
      
      public void clkQuoteLineBind(){
          QuotePage.clk_qLineItemBindbtn.click();
    }
      
      public void selPriceBook(int i){
  		Select sel= new Select(OppPage.select_pricebook);
  		sel.selectByIndex(i);
     }
      
      public void selPriceType(int i){
  		Select sel = new Select(OppPage.oppLine_PriceType);
  				sel.selectByIndex(i);
  	}

  	public void selPackage(int i) {
  		Select sel =new Select(OppPage.opplinePackage);
  		sel.selectByIndex(i);
  	}
  	
  	public void enterQuantity(String qty){
  	   OppPage.txt_qty.sendKeys(qty);
  	
  	}
  	public void selShipping(int i) {
  		Select sel = new Select(OppPage.oppLineShipping);
  		sel.selectByIndex(i);
  	}

  	 public void seltTax(int i) {
      Select sel =new Select(OppPage.oppLineTax);
  		sel.selectByIndex(i);
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
     	

      
     	
     	 // Quote View,Edit and Delete
     	
     	
     	// .//*[@id='QuoteTbl']/tbody/tr[]/td[4]
     	
     	/*
     	public void clkAndOpenQuote(String quoteName,int i){
     	 
     	 String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
         String endPath= "]/td[4]"; 
         String  fullpath = firstPath +i+ endPath;
        
         List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[4]"));
         for(WebElement quote:list){
        	 if (quote.getText().equalsIgnoreCase(String.valueOf(quoteName))){
        		 
        	WebElement quoteview = driver.findElement(By.xpath(fullpath));
     			quoteview.click();
        	 }
        	 else
        	   driver.findElement(By.id("ContentPlaceHolder1_ViewQuote1_btnSearchMain")).click(); 
        	 
              
     	 
    	 }

     	}
     
     */	 
     	
     // .//*[@id='QuoteTbl']/tbody/tr[]/td[4]
     	
    	public void clkAndOpenQuote(String quoteName,int i){	
     	String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
        String endPath= "]/td[4]"; 
       String  fullpath = firstPath +i+ endPath;
       List<String> newList =new ArrayList<>();
       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[4]"));
       for(int j=0; j < list.size(); j++)
       {
    	  newList.add(list.get(j).getText());
       } 
     	 if (newList.contains(quoteName)){
     		WebElement quoteview = driver.findElement(By.xpath(fullpath));
  			quoteview.click();	 
     		 
     	 }
    	} 
    	// .//*[@id='QuoteTbl']/tbody/tr[]/td[2]
    	
    	 public void clkAndeEditQuote(String quoteName,int i){	
         	String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
            String endPath= "]/td[2]"; 
            String  fullpath = firstPath +i+ endPath;
           List<String> newList =new ArrayList<>();
           List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[4]"));
           for(int j=0; j < list.size(); j++)
           {
        	  newList.add(list.get(j).getText());
           } 
         	 if (newList.contains(quoteName)){
         		WebElement quoteediticon = driver.findElement(By.xpath(fullpath));
      			quoteediticon.click();	
         	 }
    	} 
     	 
     	
     	public void clkQuotePreviewBtn(){
     		QuotePage.clk_preview_btn.click();
     	}
     	
     	 
     	
     	public void clkQuoteDocumentAccordion(){
     		QuotePage.clk_Document_accordion.click();
     	  
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
     	
     // Closed the window pop up
     	 
     	public void Closedpopupwindow(){
     	
     	for (String winHandle : driver.getWindowHandles()) {
     	    driver.switchTo().window(winHandle);  
     	}
     	
     	  driver.close(); 
     	  
     	}
     	
     	public void clkAndDeleteQuote(String quoteName,int i){	
         	String firstPath= ".//*[@id='QuoteTbl']/tbody/tr[";
            String endPath= "]/td[3]"; 
            String  fullpath = firstPath +i+ endPath;
           List<String> newList =new ArrayList<>();
           List<WebElement> list = driver.findElements(By.xpath(".//*[@id='QuoteTbl']/tbody/tr/td[4]"));
           for(int j=0; j < list.size(); j++)
           {
        	  newList.add(list.get(j).getText());
           } 
         	 if (newList.contains(quoteName)){
         		WebElement quoteDeleteicon = driver.findElement(By.xpath(fullpath));
      			quoteDeleteicon.click();	
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
  
     	public void clkQuoteEmailAccordion(){
     		QuotePage.clk_email_accordion.click();
     	}
     	
     	public void clk_QuoteRecent_Update_Acco(){
     		QuotePage.clk_recentUpdate_accordion.click();
     	}
     	
     	

     	
     	
 }
