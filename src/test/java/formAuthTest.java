import Pages.LandingPage;
import Pages.formAuthPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class formAuthTest extends BaseTest{
    private formAuthPage formAuthPage;
    private LandingPage landingPage;
    @Test(priority = 1)
    public void loginWithValidCredentials(){
        formAuthPage = homePage.navigateToFormAuth();
        formAuthPage.enterUserName("tomsmith");
        formAuthPage.enterPassword("SuperSecretPassword!");
        landingPage = formAuthPage.ClickOnLoginButtonInCaseValidCredentials();
        String textMSG = landingPage.getLoginSuccessMSG();
        // assert
        Assert.assertEquals(textMSG,"You logged into a secure area!\n" +
                "×","success login msg doesn't match");
        landingPage.clickOnLogoutButtonToNavigateHomePage();


    }
    @Test(priority = 0)
    public void LoginWithInvalidCredentials(){
        formAuthPage = homePage.navigateToFormAuth();
        formAuthPage.enterUserName("ahmedawaga43@gmail.com");
        formAuthPage.enterPassword("1234554321");
        formAuthPage.ClickOnLoginButtonInCaseInValidCredentials();
        String errorMSG = formAuthPage.getLoginErrorMessage();
        // assert

        Assert.assertEquals(errorMSG,"Your username is invalid!\n" +
                "×","error msg doesn't match");

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        formAuthPage.navigateBaseUrl();
    }
}
