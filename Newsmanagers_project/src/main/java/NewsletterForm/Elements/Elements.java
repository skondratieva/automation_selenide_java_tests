package NewsletterForm.Elements;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    SelenideElement cookieBanerSubmitButton = $("button.agree-button");
    SelenideElement footerLink = $("a[data-drupal-link-system-path='node/96878']");
    SelenideElement title = $(".field--name-title");
    SelenideElement description = $(".field--name-lead");
    SelenideElement nomlField = $(".form-item-last-name");
    SelenideElement prenomField = $(".form-item-first-name");
    SelenideElement emailField = $(".form-item-email");
    SelenideElement functionField = $(".form-item-function-select");
    SelenideElement sociétéField = $(".form-item-company");
    SelenideElement secteurField = $(".form-item-sector-select");
    SelenideElement telField = $(".form-item-phone");
    SelenideElement adresseField = $(".form-item-adresse-address");
    SelenideElement villeField = $(".form-item-adresse-city");
    SelenideElement codePostalField = $(".form-item-adresse-postal-code");
    SelenideElement paysField = $(".form-item-adresse-country");
    SelenideElement checkbox = $("label.option");
    SelenideElement submitButon = $("input#edit-submit");
    String language;

    public Elements(String language) {

        this.language = language;
    }


    public Elements open(){
        Selenide.open("/" + language + "/");
        return this;
    }

    public Elements getForm(){
        cookieBanerSubmitButton.click();
        footerLink.click();
        return this;
    }

    public Elements checkElements(String Title, String NomField, String PrenomField, String EmailField, String FunctionField,
                                  String SociétéField, String SecteurField, String TelField, String AdresseField, String VilleField,
                                  String CodePostalField, String PaysField, String Checkbox){
        title.shouldHave(Condition.text(Title));
        nomlField.shouldHave(Condition.text(NomField));
        prenomField.shouldHave(Condition.text(PrenomField));
        emailField.shouldHave(Condition.text(EmailField));
        functionField.shouldHave(Condition.text(FunctionField));
        sociétéField.shouldHave(Condition.text(SociétéField));
        secteurField.shouldHave(Condition.text(SecteurField));
        telField.shouldHave(Condition.text(TelField));
        adresseField.shouldHave(Condition.text(AdresseField));
        villeField.shouldHave(Condition.text(VilleField));
        codePostalField.shouldHave(Condition.text(CodePostalField));
        paysField.shouldHave(Condition.text(PaysField));
        checkbox.shouldHave(Condition.text(Checkbox));

        return this;
    }

}
