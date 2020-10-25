package NewsletterForm.Errors;

import Base.BaseTest;
import NewsletterForm.Errors.Errors;
import NewsletterForm.Errors.Errors;
import NewsletterForm.Errors.Strings;
import NewsletterForm.Errors.UserInfo;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ErrorsTest extends BaseTest {



//    @BeforeMethod
//    public void logOff(){
//        Selenide.clearBrowserCookies();
//        }


    @Test
    public void errorsFR(){
        //All fields are empty
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openFR()
                .submitForm()
                .requredFieldsFR(strings.getRequredNomFieldErrorFR(),strings.getRequredPrenomFieldErrorFR(),strings.getRequredEmailFieldErrorFR(),
                        strings.getRequredFunctionFieldErrorFR(), strings.getRequredSociétéFieldErrorFR(), strings.getRequredSecteurFieldErrorFR(),
                        strings.getRequredTelFieldErrorFR(),strings.getRequredRulesFieldErrorFR());

    }



    @Test
    public void wrongEmailErrorFR(){
        //invalid email and empty other fields
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openFR()
                .invalidEmailField(userInfo.getEmailField())
                .submitForm()
                .invalidEmailErrorFR(strings.getInvalidEmailErrorFR());


    }


    @Test
    public void errorsEN(){
        //All fields are empty
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openEN()
                .submitForm()
                .requredFieldsEN(strings.getRequredNomFieldErrorEN(),strings.getRequredPrenomFieldErrorEN(),strings.getRequredEmailFieldErrorEN(),
                        strings.getRequredFunctionFieldErrorEN(), strings.getRequredSociétéFieldErrorEN(), strings.getRequredSecteurFieldErrorEN(),
                        strings.getRequredTelFieldErrorEN(),strings.getRequredRulesFieldErrorEN());
    }

    @Test
    public void wrongEmailErrorEN(){
        //invalid email and empty other fields
        Errors errors = new Errors();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();
        errors
                .openEN()
                .invalidEmailField(userInfo.getEmailField())
                .submitForm()
                .invalidEmailErrorEN(strings.getInvalidEmailErrorEN());


    }


}
