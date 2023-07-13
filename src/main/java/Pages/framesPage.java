package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class framesPage extends BasePage{
    // locators
    private By frameLocator = By.id("mce_0_ifr");
    private By frameTextFieldLocator = By.id("tinymce");
    public framesPage(WebDriver driver){
        super(driver);
    }

    // method
    public String typeInFrameTextField(String string){
        elementActions.switchToFrame(frameLocator);
        elementActions.sendStringToField(frameTextFieldLocator,string);
        elementActions.switchBackToParentFrame();

        return string;
    }
    public void clearFrameTextField(){
        elementActions.switchToFrame(frameLocator);
        elementActions.clearStringFromField(frameTextFieldLocator);
        elementActions.switchBackToParentFrame();
    }
}
