package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class carform {
	
	WebDriver driver;
	//WebElement brand;
	
	public carform(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void form(String brand, String model, String year, String km, String city, String locality, String price, String name, String mob, String email) {
		
		 WebElement brand2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[1]"));
	        brand2.click();
	        brand2.sendKeys(brand);
	        WebElement model2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[2]"));
	        model2.click();
	        model2.sendKeys(model);
	        WebElement fuel=driver.findElement(By.id("diesel"));
	        fuel.click();
	        WebElement year2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/div[3]/select"));
	        year2.click();
	        year2.sendKeys(year);
	        WebElement km2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[3]"));
	        km2.click();
	        km2.sendKeys(km);
	        WebElement city2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[4]"));
	        city2.click();
	        city2.sendKeys(city);
	        WebElement locality2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[6]"));
	        locality2.click();
	        locality2.sendKeys(locality);
	        WebElement price2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[2]/div[1]/div/input"));
	        price2.click();
	        price2.sendKeys(price);
	        WebElement name2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[1]"));
	        name2.click();
	        name2.sendKeys(name);
	        WebElement mob2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/div[3]/input"));
	        mob2.click();
	        mob2.sendKeys(mob);
	        WebElement email2=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[2]"));
	        email2.click();
	        email2.sendKeys(email);	
		
		
	}

}
