import Pages.ABTextPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ABTextTest extends BaseTest {

    private ABTextPage abTextPage;
    @Test
    public void getTextFromParagraphTest(){
        abTextPage = homePage.navigateToABTextPage();
        String result = abTextPage.getTextFromTitle();
        System.out.println(result);
       // Assert.assertEquals(result,"A/B Test Variation 1","text doesn't match");


    }
    @AfterMethod
    public void navigateToHomePageURL(){
       abTextPage.navigateBaseUrl();
    }
}
