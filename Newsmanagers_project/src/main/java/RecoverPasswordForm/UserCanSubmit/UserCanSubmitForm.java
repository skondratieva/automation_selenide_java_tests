package RecoverPasswordForm.UserCanSubmit;

import NewsletterForm.UserCanSubmitForm.Form;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserCanSubmitForm {

    SelenideElement openPopinLink = $("a[data-drupal-link-system-path='user/login']");
    SelenideElement recoverPasswordLink = $("a.reset-pass-link");
    SelenideElement submitButton = $(".ui-dialog-buttonset");
    SelenideElement emailField  = $(By.name("name"));
    SelenideElement popinTitle = $(".ui-dialog-title");

    public UserCanSubmitForm open(){
        Selenide.open("/");
        return this;
    }

    public UserCanSubmitForm openLoginPopin(){
        openPopinLink.click();
        return this;
    }

    public UserCanSubmitForm checkPopinOpenedF(String PopinTitle){
        popinTitle.shouldHave(Condition.text(PopinTitle));
        return this;
    }

    public UserCanSubmitForm getPopin(){
        recoverPasswordLink.click();
        return this;
    }

    public UserCanSubmitForm checkPopinOpened(String PopinTitle){
        popinTitle.shouldHave(Condition.text(PopinTitle));
        return this;
    }

    public UserCanSubmitForm submitForm(String ValidEmail){
        emailField.setValue(ValidEmail);
        submitButton.click();
        return this;
    }

}
