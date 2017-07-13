package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.Netapi32Util.User;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPagePOM;


public class Test_Steps {
	
	//System.setProperty("webdriver.firefox.marionette","/home/vibhutigupta/Downloads/geckodriver.exe");
	public  WebDriver driver;
	
	LoginPagePOM obj;
  
	
  
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() {
	    // Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.firefox.marionette","/home/vibhutigupta/Downloads/geckodriver.exe");
		
		 driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://webmail.qainfotech.com");
		obj = new LoginPagePOM(driver);
	   
	}
	

		@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void User_enters_UserName_and_Password(String username1,String password1){
		driver.findElement(By.id("username")).sendKeys(username1);
		driver.findElement(By.id("password")).sendKeys(password1);
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		
	}
	
	//without parameter
	/*public void User_enters_UserName_and_Password()  {
	   obj.logntowebmail("vibhutigupta", "Qait@123");
}*/

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully()  {
	    // Express the Regexp above with the code you wish you had
		   System.out.println("login successfully");
		
		
	 
	}


}
