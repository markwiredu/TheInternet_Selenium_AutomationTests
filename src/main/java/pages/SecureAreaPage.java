package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die SecureAreaPage-Klasse repräsentiert die "geschützte Seite",
 * die nach einem erfolgreichen Login angezeigt wird.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Kapselt die Elemente und Aktionen der sicheren Seite.
 *    - Hauptsächlich dient sie hier dazu, Statusmeldungen (Alerts) auszulesen.
 */
public class SecureAreaPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für die Status-Meldung (z. B. Erfolgsmeldung nach Login)
    private By statusAlert = By.id("flash");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Liest den Text der Status-Meldung aus.
     * Beispiel: "You logged into a secure area!"
     *
     * @return der Text der Meldung als String
     */
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
