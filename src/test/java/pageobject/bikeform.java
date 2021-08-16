package pageobject;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class bikeform {
	WebDriver driver;
	//WebElement brand;
	WebElement name1;
	
	public bikeform(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void validform(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		//Select orderby = new Select(driver.findElement(By.name("Brand_name")));
       // orderby.selectByIndex(8);
		WebElement brand1=driver.findElement(By.name("Brand_name"));
		brand1.click();
		brand1.sendKeys(string);
		WebElement model1=driver.findElement(By.name("Model"));
		model1.click();
		model1.sendKeys(string2);
		WebElement year1=driver.findElement(By.name("Year"));
		year1.click();
		year1.sendKeys(string3);
		WebElement kms=driver.findElement(By.name("Kms_Driven"));
		kms.click();
		kms.sendKeys(string4);
		WebElement city1=driver.findElement(By.name("cityName"));
		driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/span[10]")).click();
		city1.click();
		city1.sendKeys(string5);
		WebElement locality1=driver.findElement(By.name("adlocality"));
		locality1.click();
		locality1.sendKeys(string6);
		WebElement price1=driver.findElement(By.name("Price"));
		price1.click();
		price1.sendKeys(string7);
	    name1=driver.findElement(By.name("contactName"));
	   
		name1.click();
		name1.sendKeys(string8);
		
		
		WebElement mob1=driver.findElement(By.name("mobile"));
		mob1.click();
		mob1.sendKeys(string9);
		WebElement email1=driver.findElement(By.name("emailid"));
		email1.click();
		email1.sendKeys(string10);
      
		
		
	}
	
/*	public void nametest() {
		
			if(name1.getText().isEmpty())
			
			{
			
				assertTrue(false);
				System.out.println("working");
            
			}		
		
		
	} */
	
	
/*	public void invalidform(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		//Select orderby = new Select(driver.findElement(By.name("Brand_name")));
       // orderby.selectByIndex(8);
		WebElement brand1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[1]"));
		brand1.click();
		brand1.sendKeys(string);
		String expbranderror="Please Select a valid Brand_name";
		WebElement error= driver.findElement(By.xpath("//*[@id=\\\"papForm\\\"]/div[1]/div[1]/div/label[1]"));
		String actbranderror=error.getText();
		assertEquals(actbranderror,expbranderror);
		
		WebElement model1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[2]"));
		model1.click();
		model1.sendKeys(string2);
		String expmodelerror="Please Select a valid Model";
		WebElement merror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[2]"));
		String actmodelerror=merror.getText();
		assertEquals(actmodelerror,expmodelerror);
		
		WebElement year1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/div[3]/select"));
		year1.click();
		year1.sendKeys(string3);
		String expyearerror="Please select a year";
		WebElement yerror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[3]"));
		String actyearerror=yerror.getText();
		assertEquals(actyearerror,expyearerror);
		
		WebElement kms=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[3]"));
		kms.click();
		kms.sendKeys(string4);
		String expkmerror="Please Enter Kms Driven";
		WebElement kmerror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[4]"));
		String actkmerror=kmerror.getText();
		assertEquals(actkmerror,expkmerror);
		
		WebElement city1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[4]"));
		city1.click();
		city1.sendKeys(string5);
		String expcityerror="Please select valid City";
		WebElement cerror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[5]"));
		String actcityerror=cerror.getText();
		assertEquals(actcityerror,expcityerror);
		
		
		WebElement locality1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/input[6]"));
		locality1.click();
		locality1.sendKeys(string6);
		String explocerror="Please Select a valid adlocality";
		WebElement lerror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[1]/div[1]/div/label[6]"));
		String actlocerror=lerror.getText();
		assertEquals(actlocerror,explocerror);
		
		
		WebElement price1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[2]/div[1]/div/input"));
		price1.click();
		price1.sendKeys(string7);
		
		WebElement name1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[1]"));
		name1.click();
		name1.sendKeys(string8);
		
		
		WebElement mob1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/div[3]/input"));
		mob1.click();
		mob1.sendKeys(string9);
		String expmoberror="Please enter your mobile number";
		WebElement moberror= driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/div[3]/label"));
		String actmoberror=moberror.getText();
		assertEquals(actmoberror,expmoberror);
		
		WebElement email1=driver.findElement(By.xpath("//*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/input[2]"));
		email1.click();
		email1.sendKeys(string10);
		String expemailerror="Please enter your emailid";
		WebElement emerror= driver.findElement(By.xpath("///*[@id=\"papForm\"]/div[3]/div[1]/div/div[1]/label"));
		String actemailerror=emerror.getText();
		assertEquals(actemailerror,expemailerror);
       
		
		
	} */

}




