package scrmpro.utility.com;

import java.util.ArrayList;
 
import org.testng.annotations.DataProvider;
import scrmpro.reposrity.com.Property;
 

public class LeadExcel implements Property{
 
 @DataProvider(name = "Lead")
 public Object[][] getLoginDataForAllRoles() throws Exception {
 
  DataDrivenExcel userData = new DataDrivenExcel(
    TestSheet, "login");
 
  ArrayList<Object> dataList = new ArrayList<Object>();
 
  int i = 0;// excluding header row
  int totalRows = 1;
  while (i <= totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[1];
   dataLine[0] = userData.getCell(i, 0);
  // dataLine[1] = userData.getCell(i, 1);
 
 
   dataList.add(dataLine);
 
   i++;
  }
 
  Object[][] data = new Object[dataList.size()][];
  for (i = 0; i < dataList.size(); i++)
   data[i] = (Object[]) dataList.get(i);
 
  return data;
 }
 
 @DataProvider(name = "LeadCreate")
 public Object[][] fillleadetails() throws Exception {
 
  DataDrivenExcel userData = new DataDrivenExcel(
    TestSheet, "LeadData");
 
  ArrayList<Object> dataList = new ArrayList<Object>();
 
  int i = 0;// excluding header row
  int totalRows = 1;
  while (i < totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[6];
   dataLine[0] = userData.getCell(i, 0);
   dataLine[1] = userData.getCell(i, 1);
   dataLine[2] = userData.getCell(i, 2);
   dataLine[3] = userData.getCell(i, 3);
   dataLine[4] = userData.getCell(i, 4);
   dataLine[5] = userData.getCell(i, 5);
  // userData.
   
   
 
 
   dataList.add(dataLine);
 
   i++;
  }
 
  Object[][] data = new Object[dataList.size()][];
  for (i = 0; i < dataList.size(); i++)
   data[i] = (Object[]) dataList.get(i);
 
  return data;
 }
 
 
}