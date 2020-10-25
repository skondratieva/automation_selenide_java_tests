package RecoverPasswordForm.Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    SelenideElement openLoginPopinLink = $("a[data-drupal-link-system-path='user/login']");
    SelenideElement recoverPasswordLink = $("a.reset-pass-link");
    SelenideElement popinTitle = $(".ui-dialog-title");
    SelenideElement emailFieldlaceholder = $("input[name='name']");
    SelenideElement description = $(".user-pass");
    SelenideElement buttonTitle = $(".ui-dialog-buttonset");
    String language;

    public Elements(String language) {

        this.language = language;
    }


    public Elements open(){
        Selenide.open("/" + language + "/");
        return this;
    }

    public Elements getPopin(){
        openLoginPopinLink.click();
        recoverPasswordLink.click();
        return this;
    }

    public Elements checkElements(String PopinTitle, String EmailFieldPlaceholder, String Description, String ButtonTitle){
        popinTitle.shouldHave(Condition.text(PopinTitle));
        emailFieldlaceholder.shouldHave(attribute("placeholder",EmailFieldPlaceholder));
        description.shouldHave(Condition.text(Description));
        buttonTitle.shouldHave(Condition.text(ButtonTitle));
        return this;
    }

}