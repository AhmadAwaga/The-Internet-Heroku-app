package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPresesPage extends BasePage{
    private By inputFieldLocator = By.xpath("//input[@id='target']");
    private By resultTextLocator = By.xpath("//p[@id='result']");
    public keyPresesPage(WebDriver driver){
        super(driver);
    }
    // method
    public void enterCharacters(Keys characters){
        elementActions.retrieveElement(inputFieldLocator).sendKeys(characters);

    }
    public void typeSpecialCharacter(){
        elementActions.retrieveElement(inputFieldLocator).sendKeys(Keys.chord(Keys.SHIFT,"h"));
    }
    public String getResultText(){
        return  elementActions.getTextFromElement(resultTextLocator);
    }
}
