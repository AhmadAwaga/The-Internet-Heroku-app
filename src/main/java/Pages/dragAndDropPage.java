package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropPage extends BasePage{
    //locator
    private By dragLocator = By.xpath("//div[@id='column-a']");
    private By dropLocator = By.xpath("//div[@id='column-b']");

    public dragAndDropPage(WebDriver driver){
        super(driver);
    }
    // method
    public WebElement dragElement(){
        wait.WaitForClickbility(dragLocator);
        return elementActions.retrieveElement(dragLocator);

    }
    public WebElement dropElement(){
        wait.WaitForClickbility(dropLocator);
         return elementActions.retrieveElement(dropLocator);
    }
    public void dragAndDropElement(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement(),dropElement()).perform();
    }
    public String getTextFromDrag(){
        return elementActions.getTextFromElement(dragLocator);

    }
    public String getTextFromDrop(){
        return elementActions.getTextFromElement(dropLocator);
    }

}
