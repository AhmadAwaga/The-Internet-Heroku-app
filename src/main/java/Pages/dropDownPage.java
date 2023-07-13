package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dropDownPage extends BasePage{
    // locators
   private By dropDownLocator = By.xpath("//select[@id= 'dropdown']");

    public dropDownPage(WebDriver driver){
        super(driver);
    }


    public void selectFromDropDown(String option){
        elementActions.selectOptionFromDropDown(dropDownLocator,option);

    }
    public String getSelectedOptionFromDropDown(){
       return elementActions.getSelectedOptionFromDropDown(dropDownLocator);
    }


}
