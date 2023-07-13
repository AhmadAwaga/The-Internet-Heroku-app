import Pages.dropDownPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTest{

    private dropDownPage dropDownPage;

    @Test
    public void DropDownTests(){
        dropDownPage = homePage.navigateToDropDownPage();
        dropDownPage.selectFromDropDown("Option 2");
        String actualSelected = dropDownPage.getSelectedOptionFromDropDown();
        Assert.assertEquals(actualSelected,"Option 2","selected option is not correct");

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        dropDownPage.navigateBaseUrl();
    }

}
