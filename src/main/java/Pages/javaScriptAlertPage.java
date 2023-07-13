package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScriptAlertPage extends BasePage{
    private By firstAlertLocator = By.xpath("//button[@onclick='jsAlert()']");
    private By secondAlertLocator = By.xpath("//button[@onclick='jsConfirm()']");


    private By resultTextFromAlert = By.xpath("//p[@id='result']");

    public javaScriptAlertPage(WebDriver driver){
        super(driver);

    }
    public void clickOnFirstAlertButton(){
        elementActions.ClickOnElement(firstAlertLocator);
    }
    public void clickOnSecondAlertButton(){
        elementActions.ClickOnElement(secondAlertLocator);
    }
    public void acceptAlert(){
        elementActions.acceptAlert();
    }
    public void dismissAlert(){
        elementActions.dismissAlert();
    }
    public String getResultMessage(){
        return  elementActions.getTextFromElement(resultTextFromAlert);
    }
}
