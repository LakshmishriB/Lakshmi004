package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class selectcategory {
	
	WebDriver driver;
	WebElement bikeandscooter;
	
	
	public selectcategory(WebDriver driver) {
		this.driver=driver;
	}
	public void clickbikeandscooter() throws InterruptedException {
		//WebElement carandbike = driver.findElement(By.xpath("//*[@id=\"papcontainer\"]/div[1]/div[2]/div[3]"));
		//carandbike.click();
		//@FindBy(how = How.NAME, using = "logonName")
		//private WebElement logonNameField;
		driver.findElement(By.xpath("//*[@id=\"papcontainer\"]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(5000);

		//bikeandscooter=driver.findElement(By.linkText("Bikes & Scooters"));
		//bikeandscooter.click();
		driver.findElement(By.linkText("Bikes & Scooters")).click();
		Thread.sleep(5000);
					
	}
	public void clickcar() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"papcontainer\"]/div[1]/div[2]/div[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Cars")).click();
		Thread.sleep(5000);
		
	}

}




