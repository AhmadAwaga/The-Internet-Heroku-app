package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage extends BasePage{
    // locator
    private By ElementOnPageThatIsHiddenLocator = By.xpath("//a[@href='/dynamic_loading/1']");
    private By ElementRenderedAfterTheFact = By.xpath("//a[@href='/dynamic_loading/2']");
    private By startButtonLocator = By.xpath("//div[@id='start']/button");
    private By textLocator = By.xpath("//div[@id='finish']/h4");

    public dynamicLoadingPage(WebDriver driver){
        super(driver);
    }
    // method
    public void clickOnElementOnPageThatIsHidden(){
        elementActions.ClickOnElement(ElementOnPageThatIsHiddenLocator);
    }
    public void clickOnElementRenderedAfterTheFact(){
        elementActions.ClickOnElement(ElementRenderedAfterTheFact);
    }
    public void clickOnStartButton(){
        elementActions.ClickOnElement(startButtonLocator);
    }
    public String getText(){
        wait.WaitForVisibility(textLocator);
        return elementActions.getTextFromElement(textLocator);
    }
    public void backToDynamicallyLoadedPageElements(){
        driver.navigate().back();
    }


}
