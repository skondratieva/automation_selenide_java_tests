package LoginForm.Errors;

import Base.BaseTest;
import LoginForm.Errors.*;
import org.testng.annotations.Test;
import lombok.*;

public class ErrorMessagesTest extends BaseTest {

    @Test
    public void EmptyFieldsTestFR() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
    //Both fields are empty
        errors.openFR()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1FR(expectedStrings.getRequredEmailFieldErrorFR())
                .errorRequredPasswordfield1FR(expectedStrings.getRequredPasswordFiledErrorFR());
    }

        @Test
        public void WrongUsernameFieldFR(){
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Wrong Username field, password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserIncorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledErrorFR())
                    .errorIncorrectEmailfieldFR(expectedStrings.getWrongCredentialsErrorFR());

        }


        @Test
        public void EmptyPasswordFieldFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Password field is empty
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserCorrectEmail())
                    .clickSubmitButton()
                    .errorRequredPasswordfield2FR(expectedStrings.getRequredPasswordFiledErrorFR())
                    .errorWrongCredentials1FR(expectedStrings.getWrongCredentialsErrorFR());

        }

        @Test
        public void WrongCredentialsFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Wrong credentials
            errors.openFR()
                    .openPopin()
                    .userEmail(userInfo.getUserCorrectEmail())
                    .userPassword(userInfo.getUserPassword())
                    .clickSubmitButton()
                    .errorWrongCredentials2FR(expectedStrings.getWrongCredentialsErrorFR());


        }


        @Test
        public void EmptyUsernameFieldFR() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Username is empty
            errors.openFR()
                    .openPopin()
                    .userPassword(userInfo.getUserPassword())
                    .clickSubmitButton()
                    .errorRequredEmailfield2FR(expectedStrings.getRequredEmailFieldErrorFR());

    }

        @Test
        public void EmptyFieldsTestEN() {
            Errors errors = new Errors();
            Strings expectedStrings = new Strings();
            UserInfo userInfo = new UserInfo();
        //Both fields are empty
        errors.openEN()
                .openPopin()
                .clickSubmitButton()
                .errorRequredEmailfield1EN(expectedStrings.getRequredEmailFieldErrorEN())
                .errorRequredPasswordfield1EN(expectedStrings.getRequredPasswordFiledErrorEN());
    }

    @Test
    public void WrongUsernameFieldEN(){
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Wrong Username field, password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserIncorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledErrorEN())
                .errorIncorrectEmailfieldEN(expectedStrings.getWrongCredentialsErrorEN());

    }


    @Test
    public void EmptyPasswordFieldEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Password field is empty
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserCorrectEmail())
                .clickSubmitButton()
                .errorRequredPasswordfield2EN(expectedStrings.getRequredPasswordFiledErrorEN())
                .errorWrongCredentials1EN(expectedStrings.getWrongCredentialsErrorEN());

    }

    @Test
    public void WrongCredentialsEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Wrong credentials
        errors.openEN()
                .openPopin()
                .userEmail(userInfo.getUserCorrectEmail())
                .userPassword(userInfo.getUserPassword())
                .clickSubmitButton()
                .errorWrongCredentials2EN(expectedStrings.getWrongCredentialsErrorEN());


    }


    @Test
    public void EmptyUsernameFieldEN() {
        Errors errors = new Errors();
        Strings expectedStrings = new Strings();
        UserInfo userInfo = new UserInfo();
        //Username is empty
        errors.openEN()
                .openPopin()
                .userPassword(userInfo.getUserPassword())
                .clickSubmitButton()
                .errorRequredEmailfield2EN(expectedStrings.getRequredEmailFieldErrorEN());

    }

}
