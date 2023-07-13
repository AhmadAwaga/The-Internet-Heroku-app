import Pages.keyPresesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest{

    private keyPresesPage keyPresesPage;
    @Test
    public void keyPressesTest(){
        keyPresesPage = homePage.navigateToKeyPresesPage();
        keyPresesPage.enterCharacters(Keys.ALT);
        Assert.assertEquals(keyPresesPage.getResultText(),"You entered: ALT","actual doesn't match expected");
       keyPresesPage.typeSpecialCharacter();

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        keyPresesPage.navigateBaseUrl();
    }
}
