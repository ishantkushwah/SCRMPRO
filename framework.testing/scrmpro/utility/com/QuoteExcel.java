package scrmpro.utility.com;


import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import scrmpro.reposrity.com.Property;

/***************************************************
 * @author Shalini Singh
 * TestCase Objective : To Pickup quote value from excel sheet
 * Date:- 15 November 2017
* @throws InterruptedException 
* @throws IOException 
 ***************************************************/

 public class QuoteExcel implements Property{
	
	@DataProvider(name= "CreateQuote")
	public Object[][] getQuoteDataForallRoles() throws Exception {
		
		
		DataDrivenExcel userData= new DataDrivenExcel(TestSheet, "Quote");
		
	ArrayList<Object> dataList = new ArrayList<Object>();
	
	int i = 0; //
	int totalRows = 0;
	while (i <= totalRows) {
		System.out.println("FillAllQuoteField : " +i);
		
		Object[] dataLine = new Object[4];
		dataLine[0] = userData.getCell(i, 0);
		dataLine[1] = userData.getCell(i, 1);
	    dataLine[2] = userData.getCell(i, 2);
		dataLine[3] = userData.getCell(i, 3);
		
		dataList.add(dataLine);
		
		i++;
	}
	
	Object[][] data = new Object[dataList.size()][];
	  for (i = 0; i < dataList.size(); i++)
	   data[i] = (Object[]) dataList.get(i);
	 
	  return data;
	
 }
}
