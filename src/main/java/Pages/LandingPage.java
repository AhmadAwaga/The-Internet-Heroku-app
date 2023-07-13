package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

public class LandingPage extends BasePage{
    // locators
    private By loggedInSuccessfully = By.xpath("//div[@id='flash-messages']/div");

    private By logoutButtonLocator = By.xpath("//a[@href='/logout']");
    public LandingPage(WebDriver driver){
        super(driver);
    }
    public String getLoginSuccessMSG(){
        wait.WaitForVisibility(loggedInSuccessfully);
        return elementActions.getTextFromElement(loggedInSuccessfully);
    }

    public HomePage clickOnLogoutButtonToNavigateHomePage(){
        elementActions.ClickOnElement(logoutButtonLocator);
        return new HomePage(driver);

    }

}
