import Pages.framesPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class frameTests extends BaseTest{
    private framesPage framesPage;
    @Test
    public void  frameTests(){
        framesPage = homePage.navigateToFramePage();
        framesPage.clearFrameTextField();
        String res = framesPage.typeInFrameTextField("helle its me ahmed");
        Assert.assertEquals(res,"helle its me ahmed","text doesn't match");
    }
    @AfterMethod
    public void navigateToHomePageURL(){
        framesPage.navigateBaseUrl();
    }
}
