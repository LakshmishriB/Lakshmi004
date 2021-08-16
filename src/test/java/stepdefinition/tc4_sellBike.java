package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.bikeform;
import pageobject.homepage;
import pageobject.selectcategory;

public class tc4_sellBike {
	
	WebDriver driver;
	@Given("to fill form fields user is in sell used bike page")
	public void to_fill_form_fields_user_is_in_sell_used_bike_page() throws InterruptedException {

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
		sc.clickbikeandscooter();
	    
	}
	
	@When("user enter the invalid  data in year field {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click on post ad button")
	public void user_enter_the_invalid_data_in_year_field_and_click_on_post_ad_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		
		String brand=string;
		String model=string2;
		String year=string3;
		String km=string4;
		String city=string5;
		String locality=string6;
		String price=string7;
		String name=string8;
		String mob=string9;
		String email=string10;
		
		
		bikeform bike=new bikeform(driver);
		bike.validform(brand, model, year, km, city, locality, price, name, mob, email);
		WebElement button=driver.findElement(By.xpath("/html/body/section[4]/div/div[1]/a"));
		button.click();
		String expyearerror="Please select a year";
		WebElement yerror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[3]"));
		String actyearerror=yerror.getText();
		assertEquals(actyearerror,expyearerror);
		
		
	}
	
	@Then("error message should be displayed for year")
	public void error_message_should_be_displayed_for_year() {
	    driver.quit();
	}
	   
}
 

