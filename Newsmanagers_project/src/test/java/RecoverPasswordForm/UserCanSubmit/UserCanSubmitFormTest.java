package RecoverPasswordForm.UserCanSubmit;

import Base.BaseTest;
import RecoverPasswordForm.Errors.Strings;
import RecoverPasswordForm.Errors.UserInfo;
import RecoverPasswordForm.UserCanSubmit.UserCanSubmitForm;
import org.testng.annotations.Test;




public class UserCanSubmitFormTest extends BaseTest {


    @Test
    public void userCanSubmitForm() {
        UserCanSubmitForm userCanSubmitForm = new UserCanSubmitForm();
        Strings strings = new Strings();
        UserInfo userInfo = new UserInfo();

        userCanSubmitForm
                .open()
                .openLoginPopin()
                .getPopin()
                .checkPopinOpened(strings.getPopinTitleFR())
                .submitForm(userInfo.getValidEmail());
    }
}


