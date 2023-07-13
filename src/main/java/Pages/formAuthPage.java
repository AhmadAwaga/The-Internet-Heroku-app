package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formAuthPage extends BasePage{

    // locator
    private By userNameTextField = By.xpath("//input[@id='username']");
    private By passwordTextField  = By.xpath("//input[@id='password']");
    private By loginButton= By.xpath("//form[@name='login']//button");
    private By errorMessageLocator = By.xpath("//div[@class='flash error']");



    public formAuthPage(WebDriver driver){
        super(driver);
    }
    public void enterUserName(String Email){

        elementActions.sendStringToField(userNameTextField,Email);

    }
    public void enterPassword(String password){
        elementActions.sendStringToField(passwordTextField,password);

    }
    public LandingPage ClickOnLoginButtonInCaseValidCredentials(){
        elementActions.ClickOnElement(loginButton);
        LandingPage landingPage = new LandingPage(driver);
        return landingPage;
    }
    public void ClickOnLoginButtonInCaseInValidCredentials(){
        elementActions.ClickOnElement(loginButton);
    }
    public String getLoginErrorMessage(){
        return elementActions.getTextFromElement(errorMessageLocator);
    }


}
