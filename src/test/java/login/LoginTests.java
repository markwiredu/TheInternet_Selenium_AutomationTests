package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

/**
 * LoginTests testet die Funktionalität des Login-Prozesses.
 * Erbt von BaseTests, damit WebDriver und HomePage bereitgestellt werden.
 */
public class LoginTests extends BaseTests {

    /**
     * Testet, ob ein erfolgreicher Login mit gültigen Anmeldedaten funktioniert.
     */
    @Test
    public void testSuccesfulLogin(){
        // Auf der Startseite zur Login-Seite navigieren
        LoginPage loginPage = homePage.clickFormAuthentication();

        // Benutzername eingeben
        loginPage.setUsername("tomsmith");

        // Passwort eingeben
        loginPage.setPassword("SuperSecretPassword!");

        // Login-Button klicken und zur Secure Area-Seite wechseln
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        // Optional könnte man hier noch prüfen, ob der Login erfolgreich war,
        // z.B. über die Anzeige einer Bestätigungsmeldung:
        // assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area!");
    }
}
