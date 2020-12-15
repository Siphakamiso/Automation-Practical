package automationpractical.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    //Page Objects
    By emailTextBox = By.id("email");
    By passwordtextBox = By.id("passwd");
    By signInBtn = By.id("SubmitLogin");
    
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Set email method
    public void setEmailText(String emailText){
        waitVisibility(emailTextBox);
        driver.findElement(emailTextBox).clear();
        driver.findElement(emailTextBox).sendKeys(emailText);
    }

    //Set password method
    public void setPasswrdText(String PasswrdText){
        waitVisibility(passwordtextBox);
        driver.findElement(passwordtextBox).clear();
        driver.findElement(passwordtextBox).sendKeys(PasswrdText);
    }

    //Click signin button method
    public void clickSigninBtn(){
        waitVisibility(signInBtn);
        driver.findElement(signInBtn).click();
    }
}
