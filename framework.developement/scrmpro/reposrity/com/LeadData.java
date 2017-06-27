package scrmpro.reposrity.com;

import scrmpro.common.com.CommonMethods;

public interface LeadData extends Property{
	
	
	String Title =common.LeadTitles();
	String Company =common.CompanyName();
	String FirstName=common.FirstName();
	String LastName=common.LastName();
	String Mobile=common.MobileNumber();
	String Priority="High";
	String Status="Open";
	
	

}
