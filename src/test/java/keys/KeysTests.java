package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * KeysTests testet die Funktionalität von Tastatureingaben auf der Key Presses-Seite.
 * Erbt von BaseTests, damit WebDriver und HomePage bereitgestellt werden.
 */
public class KeysTests extends BaseTests {

    /**
     * Testet, ob die BACK_SPACE-Taste korrekt erkannt wird.
     */
    @Test
    public void testBackspace(){
        // Auf der Startseite zur Key Presses-Seite navigieren
        var keyPage = homePage.clickKeyPresses();

        // Einen Text eingeben und die BACK_SPACE-Taste simulieren
        keyPage.enterKeys("Mark" + Keys.BACK_SPACE);

        // Prüfen, ob die Seite die BACK_SPACE-Taste korrekt erkennt
        assertEquals(keyPage.getResultText(), "You entered: BACK_SPACE");
    }
}
