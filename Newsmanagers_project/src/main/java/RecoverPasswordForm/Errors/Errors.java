package RecoverPasswordForm.Errors;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement openPopinLink = $("a[data-drupal-link-system-path='user/login']");
    SelenideElement recoverPasswordLink = $("a.reset-pass-link");
    SelenideElement submitButton = $(".ui-dialog-buttonset");
    SelenideElement emailField  = $(By.name("name"));
    SelenideElement error = $(".messages");
    SelenideElement popinTitle = $(".ui-dialog-title");

    public Errors openFR(){
        Selenide.open("/");
        return this;
    }

    public Errors openLoginPopin(){
        openPopinLink.click();
        return this;
    }

    public Errors checkPopinOpenedFR(String PopinTitleFR){
        popinTitle.shouldHave(Condition.text(PopinTitleFR));
        return this;
    }

    public Errors getPopin(){
        recoverPasswordLink.click();
        return this;
    }

    public Errors requredFieldErrorFR(String RequredFieldErrorFR){
        submitButton.click();
        error.shouldHave(Condition.text(RequredFieldErrorFR));
        return this;

    }

    public Errors invalidFieldErrorFR(String InvalidEmail, String InvalidFieldErrorFR){
        emailField.setValue(InvalidEmail);
        submitButton.click();
        error.shouldHave(Condition.text(InvalidFieldErrorFR));
        return this;

    }

    public Errors nonexistentEmailFR(String NonexistentEmail, String NonexistentEmailFR){
        emailField.setValue(NonexistentEmail);
        submitButton.click();
        error.shouldHave(Condition.text(NonexistentEmailFR));
        return this;

    }


    public Errors openEN(){
        Selenide.open("/en");
        return this;
    }


    public Errors checkPopinOpenedEN(String PopinTitleEN){
        popinTitle.shouldHave(Condition.text(PopinTitleEN));
        return this;
    }

    public Errors clickButton(){
        submitButton.click();
        return this;
    }


    public Errors requredFieldErrorEN(String RequredFieldErrorEN){
        error.shouldHave(Condition.text(RequredFieldErrorEN));
        return this;

    }
    public Errors invalidFieldErrorEN(String InvalidEmail, String InvalidFieldErrorEN){
        emailField.setValue(InvalidEmail);
        submitButton.click();
        error.shouldHave(Condition.text(InvalidFieldErrorEN));
        return this;

    }

    public Errors nonexistentEmailEN(String NonexistentEmail, String NonexistentEmailEN){
        emailField.setValue(NonexistentEmail);
        submitButton.click();
        error.shouldHave(Condition.text(NonexistentEmailEN));
        return this;

    }

}
