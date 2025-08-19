package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die AlertsPage-Klasse repräsentiert die "JavaScript Alerts"-Seite
 * einer Webanwendung. Sie kapselt die Elemente und Funktionen,
 * die zum Testen von JavaScript-Alerts, -Confirms und -Prompts benötigt werden.
 *
 * -> Sie folgt dem Page Object Model (POM):
 *    - Alle Selektoren und Methoden für diese Seite sind hier gebündelt.
 */
public class AlertsPage {

    // WebDriver-Instanz, die von außen übergeben wird, um Browseraktionen durchzuführen
    private WebDriver driver;

    // Lokatoren für die Buttons, die unterschiedliche Alerts auslösen
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");   // Button für einfachen Alert
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"); // Button für Confirm-Alert (OK/Cancel)
    private By triggerPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");  // Button für Prompt-Alert (Eingabe)

    // Locator für das Ergebnisfeld, in dem nach dem Alert die Rückmeldung angezeigt wird
    private By results = By.id("result");

    /**
     * Konstruktor: erhält einen WebDriver, der für alle Aktionen auf der Seite genutzt wird
     */
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Klickt den Button an, um einen einfachen JavaScript-Alert anzuzeigen.
     */
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    /**
     * Klickt den Button an, um ein JavaScript-Confirm-Fenster (OK/Cancel) anzuzeigen.
     */
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    /**
     * Klickt den Button an, um ein JavaScript-Prompt-Fenster (mit Eingabefeld) anzuzeigen.
     */
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    /**
     * Bestätigt (OK) den aktuell angezeigten Alert/Confirm/Prompt.
     */
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    /**
     * Bricht den aktuell angezeigten Alert/Confirm/Prompt ab (Cancel).
     */
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * Liest den Text aus dem aktuell angezeigten Alert/Confirm/Prompt aus.
     * @return der Text im Alert-Fenster
     */
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    /**
     * Gibt eine Eingabe in ein Prompt-Alert-Fenster ein.
     * @param text der einzugebende Text
     */
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    /**
     * Holt den Text aus dem Ergebnisbereich der Seite,
     * der nach einer Interaktion mit dem Alert angezeigt wird.
     * @return Ergebnis-Text von der Seite
     */
    public String getResult(){
        return driver.findElement(results).getText();
    }
}
