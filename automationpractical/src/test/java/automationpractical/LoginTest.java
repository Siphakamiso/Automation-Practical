package automationpractical;

import org.junit.Test;

import automationpractical.Pages.HomePage;
import automationpractical.Pages.LoginPage;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void logInTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.goToLoginPage();

        loginPage.setEmailText("emailText");
        loginPage.setPasswrdText("PasswrdText");
        loginPage.clickSigninBtn();
    }
}
