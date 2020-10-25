package RecoverPasswordForm.Errors;

public class UserInfo {

    private String invalidEmail = "test";
    private String nonexistentEmail = "nonexistent@email.com";
    private String validEmail = "demo@skilld.fr";

    public String getInvalidFieldError() {

        return invalidEmail;
    }

    public void setInvalidFieldError(String invalidFieldError) {

        this.invalidEmail = invalidFieldError;
    }

    public String getNonexistentEmail() {

        return nonexistentEmail;
    }

    public String getValidEmail() {
        return validEmail;
    }

    public void setValidEmail(String validEmail) {
        this.validEmail = validEmail;
    }

    public void setNonexistentEmail(String nonexistentEmail) {

        this.nonexistentEmail = nonexistentEmail;
    }
}
