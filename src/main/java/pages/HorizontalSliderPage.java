package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Die HorizontalSliderPage-Klasse repräsentiert eine Seite
 * mit einem horizontalen Schieberegler (Slider).
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Enthält Methoden, um den Slider zu bewegen und den aktuellen Wert abzurufen.
 */
public class HorizontalSliderPage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    // Locator für das Slider-Element (input-Element innerhalb einer Container-Klasse)
    private By slider = By.cssSelector(".sliderContainer input");

    // Locator für das Element, das den aktuellen Wert des Sliders anzeigt
    private By sliderValue = By.id("range");

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Bewegt den Slider so lange nach rechts, bis der gewünschte Zielwert erreicht ist.
     * Achtung: Es wird hier nur ARROW_RIGHT verwendet, d.h. es geht Schritt für Schritt nach rechts.
     *
     * @param value der Zielwert, den der Slider annehmen soll
     */
    public void setSliderValue(String value){
        // Solange der aktuelle Wert nicht dem Zielwert entspricht,
        // wird der Slider mit der rechten Pfeiltaste weiter bewegt
        while (!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    /**
     * Liest den aktuellen Wert des Sliders aus.
     *
     * @return der Wert des Sliders als String
     */
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
}
