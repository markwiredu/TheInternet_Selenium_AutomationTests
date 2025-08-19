package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die ForgotPasswordPage-Klasse repräsentiert die "Passwort vergessen"-Seite
 * einer Webanwendung.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Alle Selektoren und Aktionen, die zu dieser Seite gehören,
 *      sind hier gebündelt.
 */
public class ForgotPasswordPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für das Eingabefeld, in das die E-Mail-Adresse eingetragen wird
    private By Email = By.id("email");

    // Locator für den Button, mit dem der "Passwort zurücksetzen"-Prozess gestartet wird
    private By Button = By.id("form_submit");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Gibt eine E-Mail-Adresse in das Eingabefeld ein.
     *
     * @param UserMail die E-Mail-Adresse, die in das Feld eingetragen werden soll
     */
    public void enterMail(String UserMail){
        driver.findElement(Email).sendKeys(UserMail);
    }

    /**
     * Klickt auf den Button, um das Formular abzusenden
     * (z. B. Anforderung für "Passwort zurücksetzen").
     */
    public void clickButton(){
        driver.findElement(Button).click();
    }

}
