package org.stepdefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {

	WebDriver driver;

	@Given("User is on the adactin Login page")
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://adactinhotelapp.com/");
	}
	       
	@When("User should login {string} and {string}")
	public void login(String userName, String password) {
		WebElement txtUerName = driver.findElement(By.id("username"));
		txtUerName.sendKeys(userName);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@When("User should search hotels {string},{string},{string},{string},{string},{string},{string},{string}")
	public void searchHotels(String locationData, String hotelData, String roomTypeData, String roomNoData,
			String inData, String outData, String adultRoomData, String childRoomData) {
		WebElement locaton = driver.findElement(By.id("location"));
		locaton.sendKeys(locationData);

		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys(hotelData);

		WebElement roomType = driver.findElement(By.id("room_type"));
		roomType.sendKeys(roomTypeData);

		WebElement roomNo = driver.findElement(By.id("room_nos"));
		roomNo.sendKeys(roomNoData);

		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.sendKeys(inData);

		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		dateOut.sendKeys(outData);

		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		adultRoom.sendKeys(adultRoomData);

		WebElement childRoom = driver.findElement(By.id("child_room"));
		childRoom.sendKeys(childRoomData);

		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();

	}

	@When("User should select hotel")
	public void selectHotel() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
		WebElement submitBtn = driver.findElement(By.id("continue"));
	    submitBtn.click();
	}

	@When("User should book hotel {string},{string},{string},{string},{string}{string},{string},{string}")
	public void bookHotel(String firstNameData, String lastNameData, String addressData, String ccNumData,
			String ccTypeData, String ccMonthData, String ccYearData, String ccvNoData) {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(firstNameData);

		WebElement lastName =driver.findElement(By.id("last_name"));
		lastName.sendKeys(lastNameData);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(addressData);

		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(ccNumData);

		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.sendKeys(ccTypeData);

		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		ccExpMonth.sendKeys(ccMonthData);

		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		ccExpYear.sendKeys(ccYearData);

		WebElement ccvNoYear = driver.findElement(By.id("cc_cvv"));
		ccvNoYear.sendKeys(ccvNoData);

		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
	}

	@Then("User should confirm hotel")
	public void confirmHotel() {
		WebElement idBook = driver.findElement(By.id("order_no"));
		String orderId = idBook.getAttribute("value");
		System.out.println(orderId);
		driver.close();;
	}
}
