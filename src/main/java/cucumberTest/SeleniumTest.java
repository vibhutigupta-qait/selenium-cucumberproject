package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	
		// TODO Auto-generated method stub
	private static WebDriver driver = null;
	
	 
		
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.firefox.marionette","/home/vibhutigupta/Downloads/geckodriver.exe");
		
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://webmail.qainfotech.com");
 
        // Find the element that's ID attribute is 'account'(My Account) 
 
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("vibhutigupta");
        
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Qait@123"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
 
        driver.findElement(By.xpath("html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
        
        System.out.println("login successfully");
 
        
        // Close the driver session
 
        driver.quit();
 

	}

}
