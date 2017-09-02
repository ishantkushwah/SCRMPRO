package scrmpro.appmethods.com;

 
import scrmpro.pom.com.CommonPage;
 import scrmpro.pom.com.QuotePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/* @author ${Shalini Singh} 
 * Date 6 Sep 2017
 */

public class CommonMethod extends LoginMethods{
	
	
	// Methods for date picker
	
	public void pickDate(String year,String month,String date){
		
	 new Select(QuotePage.sel_year).selectByVisibleText(year);
     new Select(QuotePage.sel_month).selectByVisibleText(month);
     driver.findElement(By.linkText(date)).click();
     
	}
	
	// Method of 360 view
	
	public void clk360viewAccordion(){
		CommonPage.clk_360view_accordion.click();
	}
	
	public void clkLead360View(){
		CommonPage.clk_360viewlead_tab.click();
	}
	
	public void clkAccount360view(){
		CommonPage.clk_360viewAccount_tab.click();
	}
	
	public void clkOpportunity360View(){
		CommonPage.clk_360viewOpp_tab.click();
	}
	
	public void clkQuote360view(){
		CommonPage.clk_360viewQuote_tab.click();
	}
	
	public void clkContract360View(){
		CommonPage.clk_360viewContract_tab.click();
	}
	
	public void clkInvoice360view(){
		CommonPage.clk_360viewInvoice_tab.click();
	}
	
	public void clkCase360view(){
		CommonPage.clk_360viewCase_tab.click();
	}
	
	public void clkCampaign360View(){
		CommonPage.clk_360viewCampaign_tab.click();
	}
	
	public void clkProduct360view(){
		CommonPage.clk_360viewProduct_tab.click();
	}

	
	/* @author ${Shalini Singh} 
	 * Date 8 Sep 2017
	 */

	
	// Method of More action
	
 	public void clk_Quotetool(){
 		CommonPage.clk_tool_drpdwn.click();
 	}
 	
 	public void sel_QuotecustomView(String CustomView){
 		new Select(CommonPage.sel_customView_drpdwn).selectByVisibleText(CustomView);
 	}
 	
     public void clkMoreAction(){
 		System.out.println("More Action");
 		
 		CommonPage.clk_moreaction_drpdwn.click();
 	 
 		
}
 	
 
 	public void selFromMoreactions(String actionsName){
 		
 		if(actionsName.equalsIgnoreCase("Convert")){	
 			
 		    CommonPage.sel_convert.click();
 			
 		}
 		else if(actionsName.equalsIgnoreCase("ChangeOwner")){
 			 CommonPage.sel_changeowner.click();
 				
 		}
 		else if(actionsName.equalsIgnoreCase("MassEdit")){
			CommonPage.sel_massedit.click();
			
 		}
 		
 		else if(actionsName.equalsIgnoreCase("MassDelete")){
			 CommonPage.sel_massdelete.click();
				
 		}
 		
 		else{  
 	       CommonPage.sel_sharerecord.click();
				
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
 		CommonPage.clk_share_btn.click();
 	}
 	
 	public void clkUnsharedbtn(){
 		CommonPage.clk_unshare_btn.click();
 	}
 	
 	public void clkSharedCancelbtn(){
 		CommonPage.clk_shareRecord_cancel_btn.click();
 	}
 	
 	public void clkclosepopupIcon(){
 		CommonPage.clk_close_icon.click();
 	
 	}	
 	
 	 /* @author ${Shalini Singh}
     * Method of Export functionality of Contract module
     * Date 4 Aug 2017
    */
  
    public void clkExportbtn(){
	  CommonPage.clk_export_btn.click();
   }
    
    public void clkAllExport(){
    	CommonPage.chk_all.click();
    }
    
    public void clkExportPdfbtn(){
    	CommonPage.clk_exportPdf_btn.click();
    }
    
    public void clkclkExportExcelbtn(){
    	CommonPage.clk_exportExcel_btn.click();
    }
    
    public void clkclkExportcsvbtn(){
    	CommonPage.clk_exportCsv_btn.click();
    }
    
    
    //  @author ${Shalini Singh}
    /* Pop_Up handling.
     */
 	public void popUpAccept()
 	{
 		 Alert a = 	driver.switchTo().alert();
 		a.accept();
 	}
    
    
    
   
    
}
