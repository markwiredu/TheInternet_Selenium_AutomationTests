package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

/**
 * ForgotPasswordTests testet das "Passwort vergessen"-Formular auf der Seite.
 * Erbt von BaseTests, um WebDriver und HomePage automatisch zu nutzen.
 */
public class ForgotPasswordTests extends BaseTests {

    /**
     * Testet, ob eine E-Mail-Adresse korrekt in das "Passwort vergessen"-Formular eingegeben
     * und das Formular abgeschickt werden kann.
     */
    @Test
    public void forgotPasswordForm(){
        // Auf der Startseite zur "Forgot Password"-Seite navigieren
        var forgotpasswordPage = homePage.clickForgotPassword();

        // E-Mail-Adresse in das Eingabefeld eintragen
        forgotpasswordPage.enterMail("testemail@gmail.com");

        // Den Button zum Abschicken des Formulars klicken
        forgotpasswordPage.clickButton();
    }
}
