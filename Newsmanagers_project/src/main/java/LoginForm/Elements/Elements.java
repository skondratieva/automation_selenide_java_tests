package LoginForm.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Elements {


    SelenideElement openPopinLink = $("a[data-drupal-link-system-path='user/login']");
    SelenideElement popinTitle = $(".ui-dialog-title");
    SelenideElement emailPlaceholder = $("input[name='name']");
    SelenideElement passwordPlaceholder = $("input[name='pass']");
    SelenideElement recoverPasswordLink = $("a.reset-pass-link");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");
    String language;

    public Elements(String language) {

        this.language = language;
    }


    public Elements open(){
        Selenide.open("/" + language + "/");
        return this;
    }

    public Elements openPopin(){
        openPopinLink.click();
        return this;
    }

    public Elements checkElements(String PopinTitle, String EmailPlaceholder, String PasswordPlaceholder, String RecoverPaswordLink, String ButtonTitle){
        popinTitle.shouldHave(Condition.text(PopinTitle));
        emailPlaceholder.shouldHave(attribute("placeholder",EmailPlaceholder));
        passwordPlaceholder.shouldHave(attribute("placeholder",PasswordPlaceholder));
        recoverPasswordLink.shouldHave(Condition.text(RecoverPaswordLink));
        buttonTitle.shouldHave(Condition.text(ButtonTitle));
        return this;
    }


}