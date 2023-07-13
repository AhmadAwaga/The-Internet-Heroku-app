import Pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HoverTest extends BaseTest {
    private HoversPage hoversPage;

    @Test
    public void hoversTest(){
        hoversPage = homePage.navigateToHoversPage();
        hoversPage.hoverOverImageByIndex(1);
        Assert.assertTrue(hoversPage.isImageCaptionDisplayedOrNotByIndex(1));

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        hoversPage.navigateBaseUrl();
    }
}
