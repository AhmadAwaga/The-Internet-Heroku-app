package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    // locators
    private By dropDownPageLocator = By.xpath("//a[@href='/dropdown']");
    private By HoversPageLocator = By.xpath("//a[@href='/hovers']");
    private By keyPresesPageLocator = By.xpath("//a[@href='/key_presses']");
    private By javaScriptAlertPageLocator = By.xpath("//a[@href='/javascript_alerts']");
    private By fileUploaderPageLocator = By.xpath("//a[@href='/upload']");
    private By framesPageLocator = By.xpath("//a[@href='/tinymce']");
    private By ABTextLocator = By.xpath("//a[@href='/abtest']");
    private By addRemoveLocator = By.xpath("//a[@href='/add_remove_elements/']");
    private By formAuthLocator = By.xpath("//a[@href='/login']");
    private By dynamicLoadingLocator = By.xpath("//a[@href='/dynamic_loading']");
    private By dragAndDropLocator = By.xpath("//a[@href='/drag_and_drop']");
    private By checkBoxLocator = By.xpath("//a[@href='/checkboxes']");

    // By enterAdPageLocator = By.xpath("//a[@href='/entry_ad']");


    public HomePage(WebDriver driver){
        super(driver);

    }
    // methods to navigate landing Pages
     public dropDownPage navigateToDropDownPage(){
        elementActions.ClickOnElement(dropDownPageLocator);
        return new dropDownPage(driver);
     }
    public HoversPage navigateToHoversPage(){
        elementActions.ClickOnElement(HoversPageLocator);
        return new HoversPage(driver);
    }
    public keyPresesPage navigateToKeyPresesPage(){
        elementActions.ClickOnElement(keyPresesPageLocator);
        return new keyPresesPage(driver);
    }
    public javaScriptAlertPage navigateToJavaScriptAlertPage(){
        elementActions.ClickOnElement(javaScriptAlertPageLocator);
        return new javaScriptAlertPage(driver);
    }
    public fileUploaderPage navigateToFileUploaderPage(){
        elementActions.ClickOnElement(fileUploaderPageLocator);
        return new fileUploaderPage(driver);
    }
    public framesPage navigateToFramePage(){
        elementActions.ClickOnElement(framesPageLocator);
        return new framesPage(driver);
    }
    public ABTextPage navigateToABTextPage(){
        elementActions.ClickOnElement(ABTextLocator);
        return new ABTextPage(driver);
    }
    public addRemoveElementPage navigateToAddRemoveElementPage(){
        elementActions.ClickOnElement(addRemoveLocator);
        return new addRemoveElementPage(driver);
    }
    public formAuthPage navigateToFormAuth(){
        elementActions.ClickOnElement(formAuthLocator);
        return new formAuthPage(driver);
    }
    public dynamicLoadingPage navigateToDynamicLoading(){
        elementActions.ClickOnElement(dynamicLoadingLocator);
        return new dynamicLoadingPage(driver);
    }
    public dragAndDropPage navigateToDragAndDropPage(){
        elementActions.ClickOnElement(dragAndDropLocator);
        return new dragAndDropPage(driver);
    }
    public checkBoxPage navigateToCheckBobPagePage(){
        elementActions.ClickOnElement(checkBoxLocator);
        return new checkBoxPage(driver);
    }




}
