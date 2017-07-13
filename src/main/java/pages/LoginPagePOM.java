package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	
	WebDriver driver;
	By username = By.xpath(".//*[@id='username']");
	By userpassword = By.xpath(".//*[@id='password']");
	By login = By.xpath("html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]");

	
	public LoginPagePOM(WebDriver  driver) 
        {     
		this.driver=driver;
 		}
	
	public void setUserName(String strUserName){

       driver.findElement(username).sendKeys(strUserName);

   }

    

    //Set password in password textbox

    public void setPassword(String strPassword){

         driver.findElement(userpassword).sendKeys(strPassword);

    }

    

    //Click on login button

    public void clickLogin(){

            driver.findElement(login).click();

    }
    public void logntowebmail(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        

        

    }
    
    
}
