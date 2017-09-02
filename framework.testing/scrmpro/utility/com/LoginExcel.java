package scrmpro.utility.com;

import java.util.ArrayList;
 
import org.testng.annotations.DataProvider;
import scrmpro.reposrity.com.Property;
 

public class LoginExcel implements Property{
 
 @DataProvider(name = "Login")
 public Object[][] getLoginDataForAllRoles() throws Exception {
 
  DataDrivenExcel userData = new DataDrivenExcel(
    TestSheet , "login");
 
  ArrayList<Object> dataList = new ArrayList<Object>();
 
  int i = 0;// excluding header row
  int totalRows = 2;
  while (i <= totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[2];
   dataLine[0] = userData.getCell(i, 0);
   dataLine[1] = userData.getCell(i, 1);
  // dataLine[2] = userData.getCell(i, 2);
 
   dataList.add(dataLine);
 
   i++;
  }
 
  Object[][] data = new Object[dataList.size()][];
  for (i = 0; i < dataList.size(); i++)
   data[i] = (Object[]) dataList.get(i);
 
  return data;
 }
 
 
}