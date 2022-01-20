package com.pages;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal1 {

		protected static WebDriver driver;

		public static void launchbrowser(String url) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}

		public static void maximize() {
			driver.manage().window().maximize();
		}

		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}

		public String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		
		public void closeallwindows() {
			driver.quit();
		}
		
		public void insertValue(WebElement searchboxorderid, String orderid) {
			
		}
		
		public void closecurrentwindow() {
			driver.close();
		}

		public void sendkeys(WebElement element, String data) {
			element.sendKeys(data);
		}

		public void click(WebElement element) {
			element.click();
		}

		public WebElement findelementById(String data) {
			WebElement findElement = driver.findElement(By.id(data));
			return findElement;

		}

		public WebElement findelementByname(String data) {
			WebElement findElement = driver.findElement(By.name(data));
			return findElement;
		}

		public WebElement findelementByClassName(String data) {
			WebElement findElement = driver.findElement(By.className(data));
			return findElement;
		}

		public WebElement findelementByxpath(String data) {
			WebElement findElement = driver.findElement(By.xpath(data));
			return findElement;
		}

		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public String getAttribute(WebElement element, String value) {
			String attribute = element.getAttribute(value);
			return attribute;
		}

		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;

		}

		public File screenshot() throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File d = new File("D:\\output.jpeg");
			FileUtils.copyFile(s, d);
			return d;
		}

		public void moveToElement(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();
		}

		public void dragAndDrop(WebElement element, WebElement element1) {
			Actions a = new Actions(driver);
			a.dragAndDrop(element, element1).perform();
		}

		public void contextClick(WebElement element) {
			Actions a = new Actions(driver);
			a.contextClick(element).perform();
		}

		public void alertAccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public void dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public String gettext() {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			return text;

		}

		public String alertsendkeysgettext(String keys) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(keys);
			String text = alert.getText();
			return text;
		}

		public void navigateurl(String url) {
			driver.navigate().to(url);
		}

		public void navigateforward() {
			driver.navigate().forward();
		}

		public void navigateback() {
			driver.navigate().back();
		}

		public void navigaterefresh() {
			driver.navigate().refresh();
		}

		public void jssetAttributeValue(String value, WebElement element) {
			JavascriptExecutor a = (JavascriptExecutor) driver;
			a.executeScript("arguments[0].setAttribute('value'," + value + ")", element);
		}

		public Object jsgettAttribute(WebElement element) {
			JavascriptExecutor a = (JavascriptExecutor) driver;
			Object executeScript = a.executeScript("returnarguments[0].gettAttribute('value')", element);
			return executeScript;
		}

		public void jsclick(WebElement element) {
			JavascriptExecutor a = (JavascriptExecutor) driver;
			a.executeScript("arguments[0].click()", element);
		}

		public void jsScrollDown(WebElement element) {
			JavascriptExecutor a = (JavascriptExecutor) driver;
			a.executeScript("arguments[0].scroolIntoView(true)", element);
		}

		public void jsSrollUp(WebElement element) {
			JavascriptExecutor a = (JavascriptExecutor) driver;
			a.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public void selecOptiontByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		public void selecOptiontByValue(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

		public void selecOptiontByVisibleText(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByVisibleText(value);
		}
		
		private void selceOptionBytext(WebElement element,String data) {
			Select select = new Select(element);
			select.selectByVisibleText(gettext());

		}

		public List<WebElement> getOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;
		}

		public List<WebElement> getAllSelectedOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getAllSelectedOptions();
			return options;
		}

		public WebElement getFirstSelectedOptions(WebElement element) {
			Select select = new Select(element);
			WebElement options = select.getFirstSelectedOption();
			return options;
		}

		public WebElement findelementByTagName(WebElement element, String data) {
			WebElement findElement = element.findElement(By.tagName(data));
			return findElement;

		}

		public void insertcellvalue(String loc, String sheet, int a, int b, String c) throws Exception {
			File file = new File(loc);
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet she = workbook.getSheet(sheet);
			Row row = she.getRow(a);
			Cell cell = row.createCell(b);
			cell.setCellValue(c);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}

		public String getcellvalue(String loc, String sheet, int a, int b) throws Exception {
			File file = new File(loc);
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet1 = workbook.getSheet(sheet);
			Row row = sheet1.getRow(a);
			Cell cell = row.getCell(b);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				return stringCellValue;
			} else if (cellType == 0) {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
				return valueOf;
			} else {
				return null;
			}

		}

		public void switchtoframebyindex(int index) {
			driver.switchTo().frame(index);
		}

		public void switchtoframebyname(String name) {
			driver.switchTo().frame(name);
		}

		public void switchtoframebyid(String id) {
			driver.switchTo().frame(id);
		}

		public void getbacktowindowfromframe() {
			driver.switchTo().defaultContent();
		}

		public int sizeofframe() {
			List<WebElement> framecount = driver.findElements(By.tagName("frame"));
			int size = framecount.size();
			return size;
		}

		public String getparentwindowid() {
			String parentwindowid = driver.getWindowHandle();
			return parentwindowid;
		}
		
		public Set<String> getallwindowsid() {
			Set<String> allwindowid = driver.getWindowHandles();
			return allwindowid;		
		}
		
		public void findchildwindowid() {
			String parentwindowid = driver.getWindowHandle();
			Set<String> allwindowid = driver.getWindowHandles();
			for (String eachwindowid : allwindowid) {
				if (!parentwindowid.equals(eachwindowid)) {
				driver.switchTo().window(eachwindowid);	
				}
			}
		}
		public void assertByText(String msg, String expected, String actual) {
			assertEquals(msg, expected, actual);
			
		}
			
		public void login(String username, String password ) {
		}
}

