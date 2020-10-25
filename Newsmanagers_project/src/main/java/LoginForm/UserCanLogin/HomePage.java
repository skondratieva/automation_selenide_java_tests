package LoginForm.UserCanLogin;

import LoginForm.UserCanLogin.UserProfilePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {




    SelenideElement loginLink = $(By.xpath("/html/body/div[2]/div/header/div[1]/div[2]/div[2]/nav/ul/li/a"));
    SelenideElement EmailField  = $(By.name("name"));
    SelenideElement PasswordField  = $(By.name("pass"));
    SelenideElement LoginButton = $(".ui-dialog-buttonset");


    public HomePage open(){
        Selenide.open("/");
        return this;
    }


    public UserProfilePage loginUser(String UserMail, String UserPassword){
        loginLink.click();
        EmailField.setValue(UserMail);
        PasswordField.setValue(UserPassword);
        LoginButton.click();

        return new UserProfilePage();
    }

}

