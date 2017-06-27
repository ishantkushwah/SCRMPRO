package scrmpro.utility.com;

import java.util.ArrayList;
 
import org.testng.annotations.DataProvider;
import scrmpro.reposrity.com.Property;
 

public class LeadExcel implements Property{
 
 @DataProvider(name = "Lead")
 public Object[][] getLoginDataForAllRoles() throws Exception {
 
  DataDrivenExcel userData = new DataDrivenExcel(
    TestSheet, "LeadData");
 
  ArrayList<Object> dataList = new ArrayList<Object>();
 
  int i = 2;// excluding header row
  int totalRows = 2;
  while (i < totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[2];
   dataLine[0] = userData.getCell(i, 0);
   dataLine[1] = userData.getCell(i, 1);
 
 
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
 
  int i = 5;// excluding header row
  int totalRows = 1;
  while (i < totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[7];
   dataLine[0] = userData.getCell(i, 0);
   dataLine[1] = userData.getCell(i, 1);
   dataLine[2] = userData.getCell(i, 2);
   dataLine[3] = userData.getCell(i, 3);
   dataLine[4] = userData.getCell(i, 4);
   dataLine[5] = userData.getCell(i, 5);
   dataLine[6] = userData.getCell(i, 6);
   
 
 
   dataList.add(dataLine);
 
   i++;
  }
 
  Object[][] data = new Object[dataList.size()][];
  for (i = 0; i < dataList.size(); i++)
   data[i] = (Object[]) dataList.get(i);
 
  return data;
 }
 
 
}