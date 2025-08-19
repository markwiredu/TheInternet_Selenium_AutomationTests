package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die LoginPage-Klasse repräsentiert die Login-Seite der Webanwendung.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Enthält Methoden, um Benutzername und Passwort einzugeben
 *      und den Login-Button zu klicken.
 *    - Nach erfolgreichem Login wird die SecureAreaPage geöffnet.
 */
public class LoginPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für das Eingabefeld "Benutzername"
    private By usernameField = By.id("username");

    // Locator für das Eingabefeld "Passwort"
    private By passwordField = By.id("password");

    // Locator für den Login-Button
    private By loginButton = By.cssSelector("#login button");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Gibt den Benutzernamen in das Eingabefeld ein.
     *
     * @param username der einzugebende Benutzername
     */
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    /**
     * Gibt das Passwort in das Eingabefeld ein.
     *
     * @param password das einzugebende Passwort
     */
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    /**
     * Klickt den Login-Button, um die Anmeldung durchzuführen.
     *
     * @return ein neues SecureAreaPage-Objekt (Seite, die nach dem Login angezeigt wird)
     */
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
