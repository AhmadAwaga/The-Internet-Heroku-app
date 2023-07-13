package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage{
    // locators
    private By imagesLocator = By.xpath("//div[@class='figure']//img");
     private By imagesCaptionLocator = By.xpath("//div[@class='figcaption']//h5");


    public HoversPage(WebDriver driver){
        super(driver);

    }

    public void hoverOverImageByIndex(int index){
        // driver.find element().get(index)
       WebElement image = elementActions.retrieveElements(imagesLocator).get(index);
       // hover on element
        elementActions.hoverOverWebElement(image);

    }
    public boolean isImageCaptionDisplayedOrNotByIndex(int index){
        WebElement image = elementActions.retrieveElements(imagesLocator).get(index);
        return elementActions.isElementDisplayed(image);
    }
}
