package stepDefinitionTable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
		public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.firefox.marionette","/home/vibhutigupta/Downloads/geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://webmail.qainfotech.com");
	}



	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
		List<List<String>> data = usercredentials.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0)); 
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.xpath("html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
}