package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Die DropdownPage-Klasse repräsentiert eine Seite,
 * die ein Dropdown-Menü enthält.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Alle Selektoren und Methoden, die mit dem Dropdown interagieren,
 *      sind hier gekapselt.
 */
public class DropdownPage {

   // WebDriver-Instanz, um Aktionen im Browser auszuführen
   private WebDriver driver;

   // Locator für das Dropdown-Element auf der Seite
   private By dropdown = By.id("dropdown");

   /**
    * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
    */
   public DropdownPage(WebDriver driver){
      this.driver = driver;
   }

   /**
    * Wählt eine Option im Dropdown-Menü anhand des sichtbaren Textes aus.
    * Beispiel: selectFromDropDown("Option 1");
    *
    * @param option der sichtbare Text der auszuwählenden Option
    */
   public void selectFromDropDown(String option){
      findDropDownElement().selectByVisibleText(option);
   }

   /**
    * Gibt alle aktuell ausgewählten Optionen im Dropdown zurück.
    *
    * @return Liste mit den sichtbaren Texten der ausgewählten Optionen
    */
   public List<String> getSelectedOption(){
      // Holt alle ausgewählten Elemente (kann bei Multi-Select mehrere sein)
      List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();

      // Wandelt die WebElements in eine Liste von Textwerten um
      return selectedElements.stream()
              .map(e -> e.getText())
              .collect(Collectors.toList());
   }

   /**
    * Hilfsmethode: Liefert ein Select-Objekt, das das Dropdown repräsentiert.
    * Über dieses Objekt lassen sich Optionen auswählen oder abfragen.
    */
   private Select findDropDownElement(){
      return new Select(driver.findElement(dropdown));
   }
}
