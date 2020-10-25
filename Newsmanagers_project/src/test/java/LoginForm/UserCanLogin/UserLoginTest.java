package LoginForm.UserCanLogin;

import Base.BaseTest;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest {


    @Test
    public void userCanLogin(){
        HomePage mainPage = new HomePage();
        User defaultUser = new User();


        mainPage
                .open()
                .loginUser(defaultUser.getUserEmail(), defaultUser.getUserPassword())
                .checkLoggedUserName(defaultUser.getUserName());
    }
}
