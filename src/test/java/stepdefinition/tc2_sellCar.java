package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.ExcelReader;
import pageobject.carform;
import pageobject.homepage;
import pageobject.selectcategory;

public class tc2_sellCar {
	WebDriver driver;
	@Given("user is in sell used car in India page")
	public void user_is_in_sell_used_car_in_india_page() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		//driver = new ChromeDriver();
		driver.get("https://www.quikr.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		homepage h=new homepage(driver);
		h.postadbutton();
		boolean title= h.verifyTitle();
		System.out.println(title);
		selectcategory sc=new selectcategory(driver);
		sc.clickcar();
	   
	}
	@When("user enter the data in form from given sheetname {string} and {int} for car and click on post ad button")
	public void user_enter_the_data_in_form_from_given_sheetname_and_for_car_and_click_on_post_ad_button(String sheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		
		carform car=new carform(driver);
		ExcelReader reader=new ExcelReader();
		List<Map<String, String>> testData= reader.getData("D:\\CG training\\sprint2\\sellcar.xlsx", sheetName);
		String brand= testData.get(RowNumber).get("brand");
		String model= testData.get(RowNumber).get("model");
		String year= testData.get(RowNumber).get("year");
		String km= testData.get(RowNumber).get("km");
		String city= testData.get(RowNumber).get("city");
		String locality= testData.get(RowNumber).get("locality");
		String price= testData.get(RowNumber).get("price");
		String name= testData.get(RowNumber).get("name");
		String mob= testData.get(RowNumber).get("mob");
		String email= testData.get(RowNumber).get("email");
		
		
		car.form(brand, model, year, km, city, locality, price, name, mob, email);
		
		
	}
	@Then("Ad for car should be posted into the application")
	public void ad_for_car_should_be_posted_into_the_application() {
		
		driver.quit();
	}
	   
	
}

