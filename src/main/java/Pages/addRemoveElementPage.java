package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addRemoveElementPage extends BasePage{

    // locators
    private By addElement = By.xpath("//div[@id='content']//button[not(contains(@class,'added-manually'))]");
    private By createdButtonsLocator = By.xpath("//div[@id='elements']//button");


    public addRemoveElementPage(WebDriver driver){
        super(driver);
    }
    // method
    public void addElement(){
        elementActions.retrieveElement(addElement);

        for (int i=0; i<5; i++){
            elementActions.ClickOnElement(addElement);
        }
    }
    public String getTextFromAddButton(){
        return elementActions.getTextFromElement(addElement);
    }
    public String DeleteElement(){
        //elementActions.retrieveElements(createdButtonsLocator);
        //System.out.println(elementActions.retrieveElements(createdButtonsLocator).size()); //get size
         elementActions.retrieveElements(createdButtonsLocator).get(0).click();
         return elementActions.getTextFromElement(createdButtonsLocator);

    }



}
