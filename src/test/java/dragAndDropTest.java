import Pages.dragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class dragAndDropTest extends BaseTest{
    private dragAndDropPage dragAndDropPage;
    @Test
    public void dragAndDropTest(){
        dragAndDropPage = homePage.navigateToDragAndDropPage();
        dragAndDropPage.dragElement();
        dragAndDropPage.dropElement();
        dragAndDropPage.dragAndDropElement();
        String text = dragAndDropPage.getTextFromDrop();

        System.out.println(text);
        Assert.assertEquals(text,"B","doesn't match");

    }
    @AfterMethod
    public void navigateToHomePageURL(){
        dragAndDropPage.navigateBaseUrl();
    }
}
