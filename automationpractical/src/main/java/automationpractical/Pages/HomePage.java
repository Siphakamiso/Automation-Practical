package automationpractical.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    By searchTextBox = By.id("search_query_top");
    By searchBtn = By.name("submit_search");
    By searchResult = By.xpath("(//div[contains(@class, 'right-block')])[1]");
    By signInBtn = By.className("login");


    public HomePage(WebDriver driver){
        super(driver);
    }

    private void setSearchText(String searchText){
        waitVisibility(searchTextBox);
        driver.findElement(searchTextBox).clear();
        driver.findElement(searchTextBox).sendKeys(searchText);
    }

    private void clickSearchBtn(){
        waitVisibility(searchBtn);
        driver.findElement(searchBtn).click();
    }

    public void search(String searchText){
        this.setSearchText(searchText);
        this.clickSearchBtn();
    }

    public String getSearchResults () {
        waitVisibility(searchResult);
        return driver.findElement(searchResult).getText();
    }

    public void goToLoginPage(){
        waitVisibility(signInBtn);
        driver.findElement(signInBtn).click();
    }


}