package LoginForm.Errors;



import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Strings {
    private String requredEmailFieldErrorFR = "Le champ Adresse email est requis.";
    private String requredEmailFieldErrorEN = "Mail address field is required.";
    private String requredPasswordFiledErrorFR = "Le champ Mot de passe est requis.";
    private String requredPasswordFiledErrorEN = "Password field is required.";
    private String wrongCredentialsErrorFR = "Nom d'utilisateur ou mot de passe non reconnu.";
    private String wrongCredentialsErrorEN = "Unrecognized username or password. Forgot your password?";

    public String getRequredEmailFieldErrorFR() {
        return requredEmailFieldErrorFR;
    }

    public void setRequredEmailFieldErrorFR(String requredEmailFieldErrorFR) {
        this.requredEmailFieldErrorFR = requredEmailFieldErrorFR;
    }

    public String getRequredEmailFieldErrorEN() {
        return requredEmailFieldErrorEN;
    }

    public void setRequredEmailFieldErrorEN(String requredEmailFieldErrorEN) {
        this.requredEmailFieldErrorEN = requredEmailFieldErrorEN;
    }

    public String getRequredPasswordFiledErrorFR() {
        return requredPasswordFiledErrorFR;
    }

    public void setRequredPasswordFiledErrorFR(String requredPasswordFiledErrorFR) {
        this.requredPasswordFiledErrorFR = requredPasswordFiledErrorFR;
    }

    public String getRequredPasswordFiledErrorEN() {
        return requredPasswordFiledErrorEN;
    }

    public void setRequredPasswordFiledErrorEN(String requredPasswordFiledErrorEN) {
        this.requredPasswordFiledErrorEN = requredPasswordFiledErrorEN;
    }

    public String getWrongCredentialsErrorFR() {
        return wrongCredentialsErrorFR;
    }

    public void setWrongCredentialsErrorFR(String wrongCredentialsErrorFR) {
        this.wrongCredentialsErrorFR = wrongCredentialsErrorFR;
    }

    public String getWrongCredentialsErrorEN() {
        return wrongCredentialsErrorEN;
    }

    public void setWrongCredentialsErrorEN(String wrongCredentialsErrorEN) {
        this.wrongCredentialsErrorEN = wrongCredentialsErrorEN;
    }
}


