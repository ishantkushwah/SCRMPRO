package scrmpro.appmethods.com;

import scrmpro.common.com.Connectivity;
import scrmpro.pom.com.LoginPage;

public abstract class LoginMethods extends Connectivity {
	
	
	public void enterUsername(String username){
		LoginPage.txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password){
		LoginPage.txt_password.sendKeys(password);
	}
	
	public void clickLogin(){
		LoginPage.login_button.click();
	}
	
	


}
