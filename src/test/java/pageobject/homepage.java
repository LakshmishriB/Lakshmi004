package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	WebDriver driver;
	WebElement postfreead;
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void postadbutton() {
		
		
		//postfreead=driver.findElement(By.id("postAdBtn"));
		//postfreead.click();
		//driver.findElement(By.id("postAdBtn")).click();
		//postfreead.click();
		driver.get("https://www.quikr.com/post-classifieds-ads/select-category/");
		
	}
	
	public boolean verifyTitle()
	{
		String expOutput = "Post free ads on Quikr,Advertise free online";
		String actualoutput = driver.getTitle();
		
		if(expOutput.equals(actualoutput))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
}
