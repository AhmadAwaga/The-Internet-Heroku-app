import Pages.addRemoveElementPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class addRemoveElementTest extends BaseTest{
    private addRemoveElementPage addRemoveElementPage;
    @Test
    public void addRemoveElementTest(){
        addRemoveElementPage = homePage.navigateToAddRemoveElementPage();
        addRemoveElementPage.addElement();
        String AddText = addRemoveElementPage.getTextFromAddButton();
        Assert.assertEquals(AddText,"Add Element","text doesn't match");
        String DeleteText = addRemoveElementPage.DeleteElement();
        Assert.assertEquals(DeleteText,"Delete","Delete text on button doesn't match");

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        addRemoveElementPage.navigateBaseUrl();
    }
}
