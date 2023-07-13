import Pages.dynamicLoadingPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class dynamicLoadingTest extends BaseTest{
    private dynamicLoadingPage dynamicLoadingPage;
    @Test
    public void dynamicLoadingTest(){

        dynamicLoadingPage = homePage.navigateToDynamicLoading();
        dynamicLoadingPage.clickOnElementOnPageThatIsHidden();
        dynamicLoadingPage.clickOnStartButton();
        String text = dynamicLoadingPage.getText();
        // assert
        Assert.assertEquals(text,"Hello World!","text1 doesn't match");
        // back to dynamicLoading loading elements Page.
        dynamicLoadingPage.backToDynamicallyLoadedPageElements();
        dynamicLoadingPage.clickOnElementRenderedAfterTheFact();
        dynamicLoadingPage.clickOnStartButton();
        String text2 = dynamicLoadingPage.getText();
        Assert.assertEquals(text,"Hello World!","text2 doesn't match");
    }
    @AfterMethod
    public void navigateToHomePageURL(){
        dynamicLoadingPage.navigateBaseUrl();
    }
}
