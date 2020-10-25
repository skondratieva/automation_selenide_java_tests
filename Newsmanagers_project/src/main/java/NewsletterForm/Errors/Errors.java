package NewsletterForm.Errors;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.hadoop.yarn.webapp.hamlet2.Hamlet;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement cookieBanerSubmitButton = $("button.agree-button");
    SelenideElement submitButon = $("input#edit-submit");
    SelenideElement requredNomField = $(".messages__list li:nth-child(1)");
    SelenideElement requredPrenomField = $(".messages__list li:nth-child(2)");
    SelenideElement requredEmailField = $(".messages__list li:nth-child(3)");
    SelenideElement requredFunctionField = $(".messages__list li:nth-child(4)");
    SelenideElement requredSociétéField = $(".messages__list li:nth-child(5)");
    SelenideElement requredSecteurField = $(".messages__list li:nth-child(6)");
    SelenideElement requredTelField = $(".messages__list li:nth-child(7)");
    SelenideElement requredRulesField = $(".messages__list li:nth-child(8)");
    SelenideElement emailField = $(By.name("email"));





    public Errors openFR() {
        Selenide.open("/offre-decouverte");
        cookieBanerSubmitButton.click();
        return this;
    }

    public Errors submitForm(){
        submitButon.click();
        return this;
    }


    public Errors requredFieldsFR(String RequredNomFieldFR, String RequredPrenomFieldFR, String RequredEmailFieldFR, String RequredFunctionFieldFR, String RequredSociétéFieldFR,
                                  String RequredSecteurFieldFR, String RequredTelFieldFR, String RequredRulesFieldFR) {
        requredNomField.shouldHave(Condition.text(RequredNomFieldFR));
        requredPrenomField.shouldHave(Condition.text(RequredPrenomFieldFR));
        requredEmailField.shouldHave(Condition.text(RequredEmailFieldFR));
        requredFunctionField.shouldHave(Condition.text(RequredFunctionFieldFR));
        requredSociétéField.shouldHave(Condition.text(RequredSociétéFieldFR));
        requredSecteurField.shouldHave(Condition.text(RequredSecteurFieldFR));
        requredTelField.shouldHave(Condition.text(RequredTelFieldFR));
        requredRulesField.shouldHave(Condition.text(RequredRulesFieldFR));

        return this;
    }


    public Errors invalidEmailField(String InvalidEmailField) {
        emailField.setValue(InvalidEmailField);
        return this;
    }



    public Errors invalidEmailErrorFR(String InvalidEmailErrorFR){
        requredEmailField.shouldHave(Condition.text(InvalidEmailErrorFR));

        return this;

    }




    public Errors openEN() {
        Selenide.open("/en/introductory-offer");
        cookieBanerSubmitButton.click();
        return this;
    }



    public Errors requredFieldsEN(String RequredNomFieldEN, String RequredPrenomFieldEN, String RequredEmailFieldEN, String RequredFunctionFieldEN, String RequredSociétéFieldEN,
                                  String RequredSecteurFieldEN, String RequredTelFieldEN, String RequredRulesFieldEN) {
        requredNomField.shouldHave(Condition.text(RequredNomFieldEN));
        requredPrenomField.shouldHave(Condition.text(RequredPrenomFieldEN));
        requredEmailField.shouldHave(Condition.text(RequredEmailFieldEN));
        requredFunctionField.shouldHave(Condition.text(RequredFunctionFieldEN));
        requredSociétéField.shouldHave(Condition.text(RequredSociétéFieldEN));
        requredSecteurField.shouldHave(Condition.text(RequredSecteurFieldEN));
        requredTelField.shouldHave(Condition.text(RequredTelFieldEN));
        requredRulesField.shouldHave(Condition.text(RequredRulesFieldEN));

        return this;
    }


    public Errors invalidEmailErrorEN(String InvalidEmailErrorEN){
        requredEmailField.shouldHave(Condition.text(InvalidEmailErrorEN));

        return this;

    }

}



