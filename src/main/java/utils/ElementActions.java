package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class ElementActions {
    private WebDriver driver;
    private waits wait;

    //  Constructor
    public ElementActions(WebDriver driver){
        this.driver = driver;
        wait = new waits(driver);
    }
    // action method

    public WebElement retrieveElement(By locator){
        // waits for present
        wait.WaitForPresents(locator);
        return driver.findElement(locator);

    }
    public List<WebElement> retrieveElements(By locator){
        // waits for present
        wait.WaitForPresents(locator);
        return driver.findElements(locator);

    }

    public void ClickOnElement(By locator){
        // scroll to the element
        scrollElementToView(locator);
        wait.WaitForClickbility(locator);
        //driver.findElement(locator).click();
        retrieveElement(locator).click();

    }
    public void ClickOnElement(WebElement element){
        // scroll to the element
        scrollElementToView(element);
        wait.WaitForClickbility(element);
        //driver.findElement(locator).click();
        element.click();                                  //don't need to retrieve

    }
    public void sendStringToField(By locator, String string){
        // scroll to the element
        scrollElementToView(locator);
        wait.WaitForClickbility(locator);
        retrieveElement(locator).sendKeys(string);
    }
    public void clearStringFromField(By locator){
        // scroll to the element
        scrollElementToView(locator);
        wait.WaitForClickbility(locator);
        retrieveElement(locator).clear();
    }
    public void clearStringFromField(WebElement element){
        // scroll to the element
        scrollElementToView(element);
        wait.WaitForClickbility(element);
        element.clear();
    }

    public void sendStringToField(WebElement element, String string){
        // scroll to the element
        scrollElementToView(element);
        wait.WaitForClickbility(element);
        element.sendKeys(string);
    }
    public void scrollElementToView(By locator){
        WebElement element = retrieveElement(locator);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,element);
    }
    public void scrollElementToView(WebElement element){
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,element);
    }
    public String getTextFromElement(By locator){
        scrollElementToView(locator);
        wait.WaitForVisibility(locator);
        String errorMsg = retrieveElement(locator).getText();
        return errorMsg;
    }
    public String getTextFromElement(WebElement element){
        scrollElementToView(element);

        wait.WaitForVisibility(element);
        String errorMsg = element.getText();
        return errorMsg;
    }
    public void selectOptionFromDropDown(By locator, String option){
        scrollElementToView(locator);
        wait.WaitForClickbility(locator);
        //WebElement element = retrieveElement(locator);          can use  this
        Select dropDownElement = new Select(retrieveElement(locator));
        dropDownElement.selectByVisibleText(option);


    }
    public String getSelectedOptionFromDropDown(By locator){
        scrollElementToView(locator);
        wait.WaitForClickbility(locator);
        Select dropDownElement = new Select(retrieveElement(locator));
        return dropDownElement.getFirstSelectedOption().getText();

    }
    public void hoverOverWebElement(WebElement element){
        Actions action = new Actions(driver);
        scrollElementToView(element);
        wait.WaitForVisibility(element);
        action.moveToElement(element).perform();
    }
    public void hoverOverWebElement(By locator){
        Actions action = new Actions(driver);
        scrollElementToView(locator);
        wait.WaitForVisibility(locator);
        action.moveToElement(retrieveElement(locator)).perform();
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public boolean isElementDisplayed(By locator){
        return retrieveElement(locator).isDisplayed();
    }
    public void acceptAlert(){
        wait.waitForAlert();
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        wait.waitForAlert();
        driver.switchTo().alert().dismiss();
    }
    public void switchToFrame(By locator){
        scrollElementToView(locator);
        driver.switchTo().frame(retrieveElement(locator));     // switch to driver

    }
    public void switchToFrame(WebElement element){
        scrollElementToView(element);
        driver.switchTo().frame(element);                         // switch to driver

    }
    public void switchBackToParentFrame(){
        driver.switchTo().parentFrame();
    }
//    public void dragAndDropElement(){
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(dragElement(),dropElement()).perform();
//
//    }



}
