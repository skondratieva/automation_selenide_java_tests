package NewsletterForm.UserCanSubmitForm;

import Base.BaseTest;
import NewsletterForm.UserCanSubmitForm.Form;
import NewsletterForm.UserCanSubmitForm.Homepage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SubmitNewsletterFormTest extends BaseTest {



    @Test

    public void userSubmitNewsletterFormFR() {
        Form form = new Form();
        Homepage homepage = new Homepage();
        UserInfo defaultUserInfo = new UserInfo();

        form.openFR();
        form.SubmitNewsletterFormFR(defaultUserInfo.getUserNome(),defaultUserInfo.getUserPrenom(),
                defaultUserInfo.getUserEmail(),defaultUserInfo.getUserSociété(),
                defaultUserInfo.getUserTéléphone(), defaultUserInfo.getUserAdresse(),
                defaultUserInfo.getUserVille(), defaultUserInfo.getUserCodePostal());
        homepage.checkConfirmMessageFR(defaultUserInfo.getConfirmationMessageFR());

    }


    @Test

    public void userSubmitNewsletterFormEN() {
        Form form = new Form();
        Homepage homepage = new Homepage();
        UserInfo defaultUserInfo = new UserInfo();

        form.openEN();
        form.SubmitNewsletterFormEN(defaultUserInfo.getUserNome(),defaultUserInfo.getUserPrenom(),
                defaultUserInfo.getUserEmail(),defaultUserInfo.getUserSociété(),
                defaultUserInfo.getUserTéléphone(), defaultUserInfo.getUserAdresse(),
                defaultUserInfo.getUserVille(), defaultUserInfo.getUserCodePostal());
        homepage.checkConfirmMessageEN(defaultUserInfo.getConfirmationMessageEN());

    }

}

