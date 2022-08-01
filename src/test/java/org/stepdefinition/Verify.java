package org.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {
	public static void main(String[] args) {
		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://wwww.facebook.com/");
//		WebElement id = driver.findElement(By.id("email"));
//		id.sendKeys("sanprince246@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("Elan246#");
//		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
//		btn.click();
//		System.out.println("successfully");
//		String source = driver.getPageSource();
//		System.out.println(source);
//		driver.close();
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://wwww.facebook.com/");
		WebElement idE = driver.findElement(By.id("email"));
		idE.sendKeys("sanprince246@gmail.com");
		WebElement passE = driver.findElement(By.id("pass"));
		passE.sendKeys("Elan246#");
		WebElement btnE = driver.findElement(By.xpath("//button[@type='submit']"));
		//btnE.click();
		
		
		
		WebElement accessibleName = btnE.findElement(By.id(""));
		System.out.println(accessibleName);
		String ariaRole = btnE.getAriaRole();
		System.err.println(ariaRole);
		
		System.out.println("successfully by Edge Driver");
		driver.quit();
		
		
		
	
//	List<Integer> li = new ArrayList<Integer>();
//	li.add(12);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
