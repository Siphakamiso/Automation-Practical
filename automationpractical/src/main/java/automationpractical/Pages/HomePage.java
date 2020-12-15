package automationpractical.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage extends BasePage{

    //Page Objects
    By searchTextBox = By.id("search_query_top");
    By searchBtn = By.name("submit_search");
    By searchResult = By.xpath("(//div[contains(@class, 'right-block')])[1]");
    By signInBtn = By.className("login");
    By addToCartBtn = By.xpath("//span[contains(.,'Add to cart')]");
    By itemImage = By.xpath("(//div[contains(@class, 'left-block')])[1]");
    By viewCartBtn = By.xpath("//a[contains(@class, 'button-medium')]");
    By categoty = By.className("sf-with-ul");
    By subcategory = By.xpath("//a[contains(.,'Evening Dresses')]");
    By categogyName = By.className("cat-name");


    public HomePage(WebDriver driver){
        super(driver);
    }

    //Set search text method
    private void setSearchText(String searchText){
        waitVisibility(searchTextBox);
        driver.findElement(searchTextBox).clear();
        driver.findElement(searchTextBox).sendKeys(searchText);
    }

    //Click search button method
    private void clickSearchBtn(){
        waitVisibility(searchBtn);
        driver.findElement(searchBtn).click();
    }

    //Searching method
    public void search(String searchText){
        this.setSearchText(searchText);
        this.clickSearchBtn();
    }

    //Get search results method
    public String getSearchResults () {
        waitVisibility(searchResult);
        return driver.findElement(searchResult).getText();
    }

    //Go to login page method
    public void goToLoginPage(){
        waitVisibility(signInBtn);
        driver.findElement(signInBtn).click();
    }

    //Add item to cart method
    public void addItemToCart(){
        Actions action = new Actions(driver);
        waitVisibility(itemImage);
        action.moveToElement(driver.findElement(itemImage)).moveToElement(driver.findElement(addToCartBtn)).build().perform();
        driver.findElement(addToCartBtn).click();
    }

    //View cart method
    public void viewCart(){
        waitVisibility(viewCartBtn);
        driver.findElement(viewCartBtn).click();
    }

    //Navigate page method
    public void navigate(){
        Actions action = new Actions(driver);
        waitVisibility(categoty);
        action.moveToElement(driver.findElement(categoty)).moveToElement(driver.findElement(subcategory)).build().perform();
        driver.findElement(subcategory).click();
    }

    //Get category name method
    public String getCategoryName () {
        waitVisibility(categogyName);
        return driver.findElement(categogyName).getText();
    }
}