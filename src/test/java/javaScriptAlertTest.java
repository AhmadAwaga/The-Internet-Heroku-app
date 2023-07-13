import Pages.javaScriptAlertPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class javaScriptAlertTest extends BaseTest{
    private javaScriptAlertPage javaScriptAlertPage;


    @Test
    public void alertTest(){
        javaScriptAlertPage = homePage.navigateToJavaScriptAlertPage();
        javaScriptAlertPage.clickOnFirstAlertButton();
        javaScriptAlertPage.acceptAlert();
        Assert.assertEquals(javaScriptAlertPage.getResultMessage(),
                "You successfully clicked an alert","message is not correct");

        javaScriptAlertPage.clickOnSecondAlertButton();
        javaScriptAlertPage.dismissAlert();
        Assert.assertEquals(javaScriptAlertPage.getResultMessage(),
                "You clicked: Cancel","message is not correct for second alert");

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        javaScriptAlertPage.navigateBaseUrl();
    }
}
