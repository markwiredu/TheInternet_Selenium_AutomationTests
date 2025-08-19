package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * DropwdownTests testet die Dropdown-Funktionalität auf der Seite.
 * Verwendet BaseTests als Basisklasse, um den WebDriver und die HomePage
 * automatisch bereitzustellen.
 */
public class DropwdownTests extends BaseTests {

    /**
     * Testet, ob eine Option korrekt aus dem Dropdown ausgewählt werden kann.
     */
    @Test
    public void testSelectOption(){
        // Auf der Startseite das Dropdown aufrufen
        var dropDownPage = homePage.clickDropDown();

        // Die Option, die ausgewählt werden soll
        String option = "Option 1";

        // Option im Dropdown auswählen
        dropDownPage.selectFromDropDown(option);

        // Ausgewählte Optionen auslesen
        var selectedOptions = dropDownPage.getSelectedOption();

        // Prüfen, dass genau eine Option ausgewählt ist
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");

        // Prüfen, dass die richtige Option ausgewählt wurde
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
