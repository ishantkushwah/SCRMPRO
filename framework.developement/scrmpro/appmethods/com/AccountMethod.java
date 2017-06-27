package scrmpro.appmethods.com;

import org.openqa.selenium.support.ui.Select;

import scrmpro.pom.com.AccountPage;

public abstract class AccountMethod extends LoginMethods{
	
	
	public void Click_On_AccountPagecountTab() {
		AccountPage.Clickon_Account_tab.click();
	}

	public void Click_Add_newAccountPageunt() {
		AccountPage.Click_on_AddNewAccount.click();
	}

	public void Enter_AccountName(String AccountPageountname) {
		AccountPage.Enter_Account_Name.sendKeys(AccountPageountname);

	}
	
	public void Select_Exiting_ContactforAccountPageount(int i){
	Select select = new Select(AccountPage.Select_Account_contact_Dropdown);
	select.selectByIndex(i);
	}
	
	public void Select_Exiting_LeadforAccountPageount(int i){
		Select select = new Select(AccountPage.Select_Account_LeadTitle_dropdown);
		select.selectByIndex(i);
		}
	public void Select_Exiting_CampaignforAccountPageount(int i){
		new Select(AccountPage.Select_Account_Campaign).selectByIndex(i);
		}
	
	public void Select_Exiting_PaymentMdeforAccountPageount(int i){
		new Select(AccountPage.Select_Account_paymenet_Type).selectByIndex(i);
		}
	
	public void Enter_AccountBillTo(String billTo){
		AccountPage.Enter_Account_Address_BillTo.sendKeys(billTo);
	}
	
	public void Enter_Account_Address(String address){
		AccountPage.Enter_Account_Address.sendKeys(address);
	}
	
	public void Click_AccountPageount_Save(){
		AccountPage.Click_Account_Save_btn.click();
	}
	
	public void Click_AccountPageount_Close(){
		AccountPage.Clickon_Account_Close_btn.click();
	}
	
	public void Enter_Account_City(String city){
		AccountPage.Enter_Account_city.sendKeys(city);
	}
	
	public void Enter_Account_PostBox(String PostBox){
		AccountPage.Enter_Account_PostBox.sendKeys(PostBox);
	}
	
	public void Enter_Account_Pin(String pin){
		AccountPage.Enter_Account_Pincode.sendKeys(pin);
	}
	
	public void Enter_Account_Country(String Country){
		AccountPage.Enter_Account_Country.sendKeys(Country);
	}
	


}
