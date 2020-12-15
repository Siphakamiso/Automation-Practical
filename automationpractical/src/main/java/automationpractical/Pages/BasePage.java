package automationpractical.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriverWait wait;
    public WebDriver driver;

    //Base page method
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));      
    }

    //Wait method
    public void waitVisibility(By by) {  
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
