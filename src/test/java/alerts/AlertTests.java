package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Die AlertTests-Klasse enthält automatisierte Tests
 * für JavaScript-Alerts auf der Webseite.
 *
 * -> Nutzt das Page Object Model:
 *    - Greift über die HomePage auf die AlertsPage zu
 *    - Führt dort Aktionen aus und überprüft die Ergebnisse
 *
 * -> Wird mit TestNG als Testframework ausgeführt.
 */
public class AlertTests extends BaseTests {

    /**
     * Testfall: Überprüft, ob ein einfacher Alert korrekt akzeptiert werden kann.
     * Ablauf:
     *  1. Navigiere zur "JavaScript Alerts"-Seite
     *  2. Löse den Alert aus
     *  3. Akzeptiere den Alert
     *  4. Überprüfe, ob das erwartete Ergebnis angezeigt wird
     */
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();  // zur Alerts-Seite navigieren
        alertsPage.triggerAlert();                          // einfachen Alert auslösen
        alertsPage.acceptAlert();                           // Alert bestätigen
        assertEquals(alertsPage.getResult(),
                "You successfully clicked an alert");       // Ergebnis überprüfen
    }

    /**
     * Testfall: Überprüft, ob der Text aus einem Confirm-Alert
     * korrekt ausgelesen werden kann.
     * Ablauf:
     *  1. Navigiere zur "JavaScript Alerts"-Seite
     *  2. Löse ein Confirm-Alert aus
     *  3. Lese den Text des Alerts aus
     *  4. Lehne den Alert ab (Cancel)
     *  5. Überprüfe, ob der Alert-Text dem erwarteten Wert entspricht
     */
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();  // zur Alerts-Seite navigieren
        alertsPage.triggerConfirm();                        // Confirm-Alert auslösen
        String text = alertsPage.alert_getText();           // Text aus Alert holen
        alertsPage.dismissAlert();                          // Alert abbrechen
        assertEquals(text,
                "I am a JS Confirm",
                "Alert text incorrect");                    // Text überprüfen
    }
}
