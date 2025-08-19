package slide;

import base.BaseTests;
import org.testng.annotations.Test;

/**
 * SlideTests testet die Funktionalität des horizontalen Sliders.
 * Erbt von BaseTests, damit WebDriver und HomePage bereitgestellt werden.
 */
public class SlideTests extends BaseTests {

    /**
     * Testet das Verschieben des Sliders auf einen bestimmten Wert.
     */
    @Test
    public void moveSlider(){
        // Auf der Startseite zur Seite mit dem Horizontal Slider navigieren
        var sliderPage = homePage.clickHorizontalSlide();

        // Slider auf den Wert "4" setzen
        sliderPage.setSliderValue("4");

        // Den aktuellen Wert des Sliders abrufen (z.B. um ihn später zu prüfen)
        sliderPage.getSliderValue();

        // Optional könnte man hier noch eine Überprüfung einbauen:
        // assertEquals(sliderPage.getSliderValue(), "4", "Sliderwert ist nicht korrekt");
    }
}
