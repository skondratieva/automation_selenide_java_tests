package NewsletterForm.UserCanSubmitForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Form {

    SelenideElement cookieBanerSubmitButton = $("button.agree-button");
    SelenideElement nomField = $(By.name("last_name"));
    SelenideElement prenomField = $(By.name("first_name"));
    SelenideElement emailField = $(By.name("email"));
    SelenideElement functionFieldPart1 = $(".ui-selectmenu-button");
    SelenideElement functionFieldPart2FR = $$("#edit-function-select-menu li div").filter(Condition.text("Administrateur")).first();
    SelenideElement functionFieldPart2EN = $$("#edit-function-select-menu li div").filter(Condition.text("Administrator")).first();
    SelenideElement secteurFieldPart1 = $("#edit-sector-select-button");
    SelenideElement secteurFieldPart2FR = $$("#edit-sector-select-menu li div").filter(Condition.text("Audit")).first();
    SelenideElement secteurFieldPart2EN = $$("#edit-sector-select-menu li div").filter(Condition.text("Bank")).first();
    SelenideElement sociétéField = $("#edit-company");
    SelenideElement téléphoneField = $("#edit-phone");
    SelenideElement adresseField = $("#edit-adresse-address");
    SelenideElement villeField = $("#edit-adresse-city");
    SelenideElement codePostalFiled = $("#edit-adresse-postal-code");
    SelenideElement countryFieldPart1 = $("#edit-adresse-country-button");
    SelenideElement countryFieldPart2FR = $$("#edit-adresse-country-menu li div").filter(Condition.text("Albanie")).first();
    SelenideElement countryFieldPart2EN = $$("#edit-adresse-country-menu li div").filter(Condition.text("Algeria")).first();
    SelenideElement checkbox = $("label.option");
    SelenideElement submitButon = $("input#edit-submit");

    public Form openFR(){
        Selenide.open("/offre-decouverte");
        return this;
    }

    public Homepage SubmitNewsletterFormFR
            ( String Nom, String Prenom, String Email, String Société, String Téléphone,
              String Adresse, String Ville, String CodePostal) {

    cookieBanerSubmitButton.click();
    nomField.setValue(Nom);
    prenomField.setValue(Prenom);
    emailField.setValue(Email);
    functionFieldPart1.click();
    functionFieldPart2FR.click();
    sociétéField.setValue(Société);
    secteurFieldPart1.click();
    secteurFieldPart2FR.click();
    téléphoneField.setValue(Téléphone);
    adresseField.setValue(Adresse);
    villeField.setValue(Ville);
    codePostalFiled.setValue(CodePostal);
    countryFieldPart1.click();
    countryFieldPart2FR.click();
    checkbox.click();
    submitButon.click();

    return new Homepage();

    }

    public Form openEN(){
        Selenide.open("/en/introductory-offer");
        return this;
    }

    public Homepage SubmitNewsletterFormEN
            ( String Nom, String Prenom, String Email, String Société, String Téléphone,
              String Adresse, String Ville, String CodePostal) {

        cookieBanerSubmitButton.click();
        nomField.setValue(Nom);
        prenomField.setValue(Prenom);
        emailField.setValue(Email);
        functionFieldPart1.click();
        functionFieldPart2EN.click();
        sociétéField.setValue(Société);
        secteurFieldPart1.click();
        secteurFieldPart2EN.click();
        téléphoneField.setValue(Téléphone);
        adresseField.setValue(Adresse);
        villeField.setValue(Ville);
        codePostalFiled.setValue(CodePostal);
        countryFieldPart1.click();
        countryFieldPart2EN.click();
        checkbox.click();
        submitButon.click();

        return new Homepage();

    }

}
