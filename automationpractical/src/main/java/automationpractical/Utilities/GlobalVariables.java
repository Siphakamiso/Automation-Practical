package automationpractical.Utilities;

import org.openqa.selenium.WebDriver;

import automationpractical.Pages.BasePage;


public class GlobalVariables extends BasePage{
    public GlobalVariables(WebDriver driver){
        super(driver);
    }

    public String username = "Testing@yahoo.com";
    public String password = "Testing@20";
}
