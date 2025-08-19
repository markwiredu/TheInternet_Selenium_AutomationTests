package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Die HoversPage-Klasse repräsentiert eine Seite,
 * auf der mehrere "Hover"-Elemente (z. B. Bilder oder Figuren) vorhanden sind.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Enthält Methoden, um mit diesen Elementen über "Mouse Hover" zu interagieren.
 */
public class HoversPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für die Boxen (z. B. Figuren oder Bilder), über die man hovern kann
    private By figureBox = By.className("figure");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Führt eine "Hover"-Aktion über einer bestimmten Figur aus.
     *
     * @param index gibt an, welche Figur ausgewählt werden soll
     *              (1-basiert: 1 = erste Figur, 2 = zweite Figur usw.)
     */
    public void hoverOverFigure(int index){
        // Holt die Figur aus der Liste aller "figure"-Elemente (Array beginnt bei 0 → deshalb -1)
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        // Erstellt ein Actions-Objekt und führt den Hover (Mouse Over) über der Figur aus
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
    }
}
