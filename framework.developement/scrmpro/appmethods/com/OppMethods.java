package scrmpro.appmethods.com;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.condition.Condition;

import scrmpro.pom.com.LoginPage;
import scrmpro.pom.com.OppPage;

public abstract class  OppMethods extends LoginMethods {

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

	public void selectProductsCurrency() {
		new Select(OppPage.drpdwn_SelectCurrency).selectByIndex(1);
		
	}

	public void selectProducts() {

		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[1]"));

		// Scroll the browser to the element's X position

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().x + ")");

		elementToClick.click();

	}

	public void selectPriceBook(){
		new Select(OppPage.select_pricebook).selectByIndex(1);	
		
	
		
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
	


}
