package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.http.HttpRequest;

public class ABTextPage extends BasePage{
    // locators
    private By textTitle = By.xpath("//div[@class='example']/h3");

    public ABTextPage(WebDriver driver){
        super(driver);
    }

    public String getTextFromTitle(){
        wait.WaitForVisibility(textTitle);
        return  elementActions.getTextFromElement(textTitle);
    }




}
