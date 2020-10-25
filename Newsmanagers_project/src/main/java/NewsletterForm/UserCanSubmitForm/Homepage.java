package NewsletterForm.UserCanSubmitForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Homepage {

    SelenideElement confirmationMessage = $(".messages");

    public void checkConfirmMessageFR(String expMessage){
        confirmationMessage.shouldHave(Condition.text(expMessage));

    }

    public void checkConfirmMessageEN(String expMessage){
        confirmationMessage.shouldHave(Condition.text(expMessage));

    }
}
