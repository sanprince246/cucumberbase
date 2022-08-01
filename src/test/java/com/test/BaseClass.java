package com.test;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void cleardata(WebElement element){
		element.clear();
	}
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public WebElement locatorId(String attributevalue) {
		WebElement id = driver.findElement(By.id(attributevalue));
		return id;
	}

	public WebElement locatorName(String attributevalue) {
		WebElement name = driver.findElement(By.name(attributevalue));
		return name;

	}

	public WebElement loactorClassName(String attributevalue) {
		WebElement classname = driver.findElement(By.className(attributevalue));
		return classname;
	}

	public WebElement locatorxpath(String attributevalue) {
		WebElement xpath = driver.findElement(By.xpath(attributevalue));
		return xpath;
	}

	public void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttributeValue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	// 99%
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void quit() {
		driver.quit();
	}

	public void close() {
		driver.close();
	}

	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void cancelalert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public void selectvisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}

	// 1%
	public void selectAttributeValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void selectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement element, WebElement element1) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element1).perform();
	}

	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void jsSetAttribute(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value + "')", element);
	}

	public void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void getAttribute(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value + "')", element);
	}

	public void sendKeysEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);
	}

	public List<WebElement> selectGetIptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public List<WebElement> selectGetOptionsIterateCreateRow(WebElement element,int j) throws IOException {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		File file = new File("C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		//FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		Row row = sheet.createRow(j);
		for (int i =0; i < options.size(); i++) {
			WebElement t = options.get(i);
			String text = t.getText();
			Cell cell = row.createCell(i);
			cell.setCellValue(text);
		
		}
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		return options;
	}
	public List<WebElement> selectGetOptionsIterateGetRow(WebElement element,int j) throws IOException {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		File file = new File("C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.createRow(j);
		for (int i =0; i < options.size(); i++) {
			WebElement t = options.get(i);
			String text = t.getText();
			Cell cell = row.createCell(i);
			cell.setCellValue(text);
		
		}
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		return options;
	}
	

	public List<WebElement> getAllSelectedoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsAll = select.getAllSelectedOptions();
		return optionsAll;
	}

	public WebElement getFirstSelectedoptions(WebElement element) {
		Select select = new Select(element);
		WebElement optionFirst = select.getFirstSelectedOption();
		return optionFirst;
	}

	public void deselectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deselectValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public boolean selectIsMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void switchToFrameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToFrameId(String id) {
		driver.switchTo().frame(id);
	}

	public int size(List<WebElement> element) {
		int size = element.size();
		return size;
	}

	public void windowHandle(String element) {
		driver.switchTo().window(element);
	}

	public String getWondowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWondowHandles() {
		Set<String> windowHandle = driver.getWindowHandles();
		return windowHandle;
	}

	public void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public File screenshot(WebElement element) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = element.getScreenshotAs(OutputType.FILE);
		return s;
	}

	public void screenshotCopyFile(File source) throws IOException {
		File destination = new File("C:\\Users\\Elaravasan.E\\eclipse-workspace\\JavaProgram\\Screenshot\"+\".jpg");
		FileUtils.copyFile(source, destination);
	}

	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		String res = null;
		File file = new File(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dcv = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
				res = format.format(dcv);
			} else {
				double ncv = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(ncv);
				res = valueOf.toString();
			}
			break;

		default:
			break;
		}
		return res;
	}
	public void createCell(String sheetName, int rowNum, int cellNum,String cellValue) throws IOException {
		File file = new File(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(cellValue);
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		
	}

	public void updateData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String scv = cell.getStringCellValue();
		if (scv.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
	}

	public void createData(String sheetName, int rowNum, int cellNum, String Data) throws IOException {
		File file = new File(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\MavenPractise\\Excel Sheet\\AdactinHotelBook.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(Data);
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);

	}



}
