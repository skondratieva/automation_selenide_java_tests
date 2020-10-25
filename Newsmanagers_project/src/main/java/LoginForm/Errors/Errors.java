package LoginForm.Errors;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Errors {

    SelenideElement openPopinLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement submitButton = $(".ui-dialog-buttonset");
    SelenideElement error1 = $(".messages__list li:nth-child(1)");
    SelenideElement error2 = $(".messages__list li:nth-child(2)");
    SelenideElement emailFiled = $(By.name("name"));
    SelenideElement passwordField = $(By.name("pass"));
    SelenideElement wrongCredentialsError = $(".messages div");

    public Errors openFR(){
        Selenide.open("/");
        return this;
    }

    public Errors openEN(){
        Selenide.open("/en");
        return this;
    }

    public Errors openPopin(){
        openPopinLink.click();
        return this;
    }

    public Errors clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public Errors userEmail(String userEmail){
        emailFiled.setValue(userEmail);
        return this;
    }

    public Errors userPassword(String userPassword){
        passwordField.setValue(userPassword);
        return this;
    }

    public Errors errorRequredEmailfield1FR(String RequredEmailFieldErrorFR){
        error1.shouldHave(text(RequredEmailFieldErrorFR));
        return this;

    }

    public Errors errorRequredEmailfield1EN(String RequredEmailFieldErrorEN){
        error1.shouldHave(text(RequredEmailFieldErrorEN));
        return this;

    }

    public Errors errorRequredPasswordfield1FR(String RequredPasswordFiledErrorFR){
        error2.shouldHave(text(RequredPasswordFiledErrorFR));
        return this;

    }

    public Errors errorRequredPasswordfield1EN(String RequredPasswordFiledErrorEN){
        error2.shouldHave(text(RequredPasswordFiledErrorEN));
        return this;

    }


    public Errors errorIncorrectEmailfieldFR(String WrongCredentialsErrorFR){
        error2.shouldHave(text(WrongCredentialsErrorFR));
        return this;
    }

    public Errors errorIncorrectEmailfieldEN(String wrongCredentialsEN){
        error2.shouldHave(text(wrongCredentialsEN));
        return this;
    }

    public Errors errorRequredPasswordfield2FR(String RequredPasswordFieldErrorFR){
        error1.shouldHave(text(RequredPasswordFieldErrorFR));
        return this;

    }


    public Errors errorRequredPasswordfield2EN(String RequredPasswordFiledErrorEN){
        error1.shouldHave(text(RequredPasswordFiledErrorEN));
        return this;

    }

    public Errors errorWrongCredentials1FR(String WrongCredentialsErrorsFR) {
        error2.shouldHave(text(WrongCredentialsErrorsFR));
        return this;
    }

    public Errors errorWrongCredentials1EN(String WrongCredentialsErrorsEN) {
        error2.shouldHave(text(WrongCredentialsErrorsEN));
        return this;
    }

    public Errors errorWrongCredentials2FR(String WrongCredentialsErrorsFR){
        wrongCredentialsError.shouldHave(text(WrongCredentialsErrorsFR));
        return this;

    }

    public Errors errorWrongCredentials2EN(String WrongCredentialsErrorsEN){
        wrongCredentialsError.shouldHave(text(WrongCredentialsErrorsEN));
        return this;

    }

    public Errors errorRequredEmailfield2FR(String RequredEmailFieldErrorFR){
        wrongCredentialsError.shouldHave(text(RequredEmailFieldErrorFR));
        return this;

    }

    public Errors errorRequredEmailfield2EN(String RequredEmailFieldErrorEN){
        wrongCredentialsError.shouldHave(text(RequredEmailFieldErrorEN));
        return this;

    }



}
