package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

/**
 * BaseTests ist die Basisklasse für alle Testklassen.
 * Sie kümmert sich um:
 *  - Initialisierung des WebDrivers
 *  - Öffnen der Startseite
 *  - Bereitstellung der HomePage für Page Object Navigation
 *  - Aufräumen nach den Tests
 */
public class BaseTests {

    private WebDriver driver;       // WebDriver für die Browsersteuerung

    protected HomePage homePage;   // HomePage-Objekt, für Navigation im Page Object Model

    /**
     * Wird einmal pro Testklasse vor allen Tests ausgeführt.
     * Initialisiert den ChromeDriver, öffnet die Startseite
     * und erstellt das HomePage-Objekt.
     */
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();                        // Chrome-Browser starten
        driver.get("https://the-internet.herokuapp.com/");  // Startseite öffnen
        homePage = new HomePage(driver);                    // HomePage-Objekt erstellen
    }

    /**
     * Wird vor jeder Testmethode ausgeführt.
     * Stellt sicher, dass der Browser immer auf der Startseite beginnt.
     */
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");  // Browser auf Startseite zurücksetzen
    }

    /**
     * Wird einmal pro Testklasse nach allen Tests ausgeführt.
     * Schließt den Browser und beendet die WebDriver-Sitzung.
     */
    @AfterClass
    public void tearDown() {
        driver.quit();  // Browser schließen
    }
}
