package scrmpro.appmethods.com;

import scrmpro.pom.com.QuotePage;

public class QuoteMethod extends OppMethods{
	
	public void clickEditButtn(){
		
		QuotePage.Clickon_Edit_btn.click();
	}
	
	public void clkSavebtn(){
		QuotePage.Clickon_Quote_Save_Btn.click();
	}
	
	public void clkQuotelin(){
		QuotePage.QuoteLineItems_Displayed.click();
	}

	
	public void quoteConvert(){
		
		QuotePage.Select_Quote_Convert.click();
		{
			
		}
	}
}
