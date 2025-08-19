package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die KeyPressesPage-Klasse repräsentiert eine Seite,
 * auf der Tastatureingaben getestet werden können.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Enthält Methoden, um Texteingaben zu machen und die angezeigten Ergebnisse auszulesen.
 */
public class KeyPressesPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für das Eingabefeld, in das Tastenanschläge eingegeben werden
    private By inputField = By.id("target");

    // Locator für das Element, in dem das Ergebnis der Tastenanschläge angezeigt wird
    private By resultText = By.id("result");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Gibt Text (oder einzelne Tastenanschläge) in das Eingabefeld ein.
     *
     * @param text der einzugebende Text oder die Tasten
     */
    public void enterKeys(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    /**
     * Liest den Ergebnistext von der Seite aus.
     * Beispiel: "You entered: A"
     *
     * @return der angezeigte Ergebnistext
     */
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
