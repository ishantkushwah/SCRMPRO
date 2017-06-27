package scrmpro.common.com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.Function;

public class CommonMethods extends Connectivity {

	public void ImplicityWait(int timeinsec) {
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
	}

	public void ExplicityWait(int time) {

		WebDriverWait wait = new WebDriverWait(driver, time);

	}

	public void TakeScreenshots() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile
			// //method
			FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void Datepicker(By locator, String col) {
		WebElement dateWidget = driver.findElement(locator);
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals(col)) {
				cell.findElement(By.linkText(col)).click();
				break;
			}
		}
	}

	public void downscroll() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void shiftscroll() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	}

	public void uploadIage(WebElement e) {

		WebElement fileInput = e;
		fileInput.sendKeys("‪C:\\Users\\admin\\Desktop\\d1.pdf");

	}

	public void WelComeNote() {
		JOptionPane.showOptionDialog(null, "Automation Script Developed By: Ishant", "WelCome",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {}, null);

	}

	final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

	final java.util.Random rand = new java.util.Random();

	// consider using a Map<String,Boolean> to say whether the identifier is
	// being used or not
	final Set<String> identifiers = new HashSet<String>();

	public String generateAlphanumeric() {
		StringBuilder builder = new StringBuilder();
		while (builder.toString().length() == 0) {
			int length = rand.nextInt(5) + 5;
			for (int i = 0; i < length; i++) {
				builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
			}
			if (identifiers.contains(builder.toString())) {
				builder = new StringBuilder();
			}
		}
		return builder.toString();
	}

	public String FirstName() {

		String names[] = { "Jackson", "Liam", "Mason", "Jacob", "Ethan", "Michael" };
		Random Dice = new Random(); 
		int n = Dice.nextInt(6); 
		System.out.println(names[n]);
		return names[n];
		
	}
	
	public String LastName() {

		String names[] = { "Smith", "Johnson", "Jones", "Davis", "Martin", "Scott" };
		Random Dice = new Random(); 
		int n = Dice.nextInt(6); 
		System.out.println(names[n]);
		return names[n];
		
	}
	
	public String LeadTitles() {

		String names[] = { "Samsung Mobile Solutions","Oracle System solutions","Myntra Package","Amazon Products","Philps LED" };
		Random Dice = new Random(); 
		int n = Dice.nextInt(6); 
		System.out.println(names[n]);
		return names[n];
		
	}
	
	public String CompanyName() {

		String names[] = { "Dell Solutions", "Microsoft", "Parker Solutions", "Sony Electronic", "Microtech", "Micromax Mobile Pvt. Ltd" };
		Random Dice = new Random(); 
		int n = Dice.nextInt(6); 
		System.out.println(names[n]);
		return names[n];
		
	}
	
	public String MobileNumber(){
		
		String names[] = { "9856321589", "7854125890", "7458221025", "98792584125", "9911475890", "8012547890" };
		Random Dice = new Random(); 
		int n = Dice.nextInt(6); 
		System.out.println(names[n]);
		return names[n];
	}
	
	public void flurentWait(){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(10, TimeUnit.SECONDS) 			
				.pollingEvery(10, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
	}
	
	public void alertOkbutton(){
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	
	
	
	
}
