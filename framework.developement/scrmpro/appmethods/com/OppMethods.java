package scrmpro.appmethods.com;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import scrmpro.pom.com.OppPage;


public abstract class  OppMethods extends LoginMethods {
	
	// CommonMethod cm = new CommonMethod();
	
	
	public void clickOpportunityTab() {

		OppPage.tab_Oppotunity.click();
	}

	public void clickAddnewOpp() {
		OppPage.btn_AddnewOpp.click();
	}

	public void clickEditButton() throws InterruptedException {

		driver.findElement(By.xpath("//a[@id='ContentPlaceHolder1_OpportunityNav1_lvOpportunity_lnkBtnEdit_0']/i"))
				.click();

	}

	public void clickProductBind() {
		OppPage.btn_ProductBind.click();
	}

	public void clickProductLineicon() {
		OppPage.link_prodcutLink.click();
	}

	public void selectProductsCurrency(int i) {
		Select sel = new Select(OppPage.drpdwn_SelectCurrency);
				sel.selectByIndex(i);
		
	}

	public void selectProducts() {

		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[1]"));

		// Scroll the browser to the element's X position

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().x + ")");

		elementToClick.click();

	}

	public void selectPriceBook(int i){
		Select sel= new Select(OppPage.select_pricebook);
		sel.selectByIndex(i);	
		
		
		
	
		
//		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='lineItemstblBody']/tr"));
//		int size = list.size();
//		if(list.size()>=1){
//			new Select(driver.findElement(By.xpath("//*[@id='lineItemstblBody']/tr[1]/td[2]"))).selectByIndex(2);
//		}else{
//			if(list.size()>=2){
//				new Select(driver.findElement(By.xpath("//*[@id='lineItemstblBody']/tr[2]/td[2]"))).selectByIndex(2);
//			}
//		}
//		
		
	}

	public void enterPoductQty(String qty) {

		OppPage.txt_qty.sendKeys(qty);
	}

	public void clickSaveButton() {
		OppPage.btn_Save.click();
	}

	public void OpenOpportunity(String OppTit) {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='OpportunityTbl1']/tbody/tr/td[4]"));
		for (WebElement oppTitle : list) {

			if (oppTitle.getText().equalsIgnoreCase(OppTit)) {
				oppTitle.click();
			}

		}

	}

	public void selectPriceType() {

		new Select(OppPage.oppLine_PriceType).selectByIndex(1);
	}

	public void selectPakage() {

		new Select(OppPage.opplinePackage).selectByIndex(1);
	}

	public void selectShipping() {

		new Select(OppPage.oppLineShipping).selectByIndex(1);
	}

	public void selectTax() {

		new Select(OppPage.oppLineTax).selectByIndex(1);
	}
	
	/***************************************************
	 * @author Shalini Singh
	 * TestCase Objective : Select Opp
	 * Date:- 22 November 2017
   * @throws InterruptedException 
   * @throws IOException 
	 ***************************************************/
	// .//*[@id='OpportunityTbl1']/tbody/tr/td[1]
	
	   public void SelOpp(String oppName,int i){	
     	String firstPath= ".//*[@id='OpportunityTbl1']/tbody/tr[";
        String endPath= "]/td[1]"; 
       String  fullpath = firstPath +i+ endPath;
       List<String> newList =new ArrayList<>();
       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='OpportunityTbl1']/tbody/tr/td[4]"));
       for(int j=0; j < list.size(); j++)
       {
    	  newList.add(list.get(j).getText());
       } 
     	 if (newList.contains(oppName)){
     		WebElement sel = driver.findElement(By.xpath(fullpath));
  			sel.click();	 
     	 }
     	 
     	 
     	 
     	 
    	} 
	
	   
	
	
	


}
