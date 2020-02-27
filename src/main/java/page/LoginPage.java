package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends AbstractPage{


    @FindBy(id = "email")
    public WebElementFacade emailAddressField;

    @FindBy(id = "pass")
    public WebElementFacade passwordField;

    @FindBy(id = "send2")
    public WebElementFacade loginButton;

    @FindBy(css = ".f-left")
    public WebElementFacade forgotYourPassword;

    @FindBy(css = ".error-msg")
    public WebElementFacade invalidPassOrEmailMessage;

    @FindBy(css = "input#email_address")
    private WebElementFacade emailAddressForgotPassword;

    @FindBy(css = "#form-validate > div.buttons-set > button > span > span")
    private WebElementFacade submitForgotPassBtn;

    @FindBy(css = ".success-msg")
    private WebElementFacade messageSuccessForgotPass;


    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickForgotYourPass(){
        passwordField.click();
    }

    public void typeEmailAddress(String emailAddress) {

        emailAddressField.type(emailAddress);
    }

    public void typeEmailAddressForgotPassword(String email){
        emailAddressForgotPassword.type(email);
    }


    public void typePassword(String password){
        passwordField.type(password);
    }

    public String getGreetMessage(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(invalidPassOrEmailMessage);
        return invalidPassOrEmailMessage.getText();
    }

    public String getMessageSuccessForgotPass(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(messageSuccessForgotPass);
        return messageSuccessForgotPass.getText();
    }

    public void forgotPassword(){
        forgotYourPassword.click();
    }

    public void submitForgotPass(){
        submitForgotPassBtn.click();
    }


}