package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Die HomePage-Klasse repräsentiert die Startseite der Webanwendung.
 *
 * -> Umsetzung nach dem Page Object Model (POM):
 *    - Sie enthält Methoden, um von der Startseite zu den verschiedenen
 *      Unterseiten zu navigieren.
 *    - Jede Methode klickt einen bestimmten Link an und gibt das entsprechende
 *      Page-Objekt zurück.
 */
public class HomePage {

    // WebDriver-Instanz, um Aktionen im Browser auszuführen
    private WebDriver driver;

    /**
     * Konstruktor: erhält den WebDriver, mit dem die Seite gesteuert wird
     */
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Klickt auf den Link "Form Authentication" und öffnet die LoginPage.
     * @return ein neues LoginPage-Objekt
     */
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    /**
     * Klickt auf den Link "Dropdown" und öffnet die DropdownPage.
     * @return ein neues DropdownPage-Objekt
     */
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    /**
     * Klickt auf den Link "Forgot Password" und öffnet die ForgotPasswordPage.
     * @return ein neues ForgotPasswordPage-Objekt
     */
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    /**
     * Klickt auf den Link "Hovers" und öffnet die HoversPage.
     * @return ein neues HoversPage-Objekt
     */
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    /**
     * Klickt auf den Link "Key Presses" und öffnet die KeyPressesPage.
     * @return ein neues KeyPressesPage-Objekt
     */
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    /**
     * Klickt auf den Link "Horizontal Slider" und öffnet die HorizontalSliderPage.
     * @return ein neues HorizontalSliderPage-Objekt
     */
    public HorizontalSliderPage clickHorizontalSlide(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    /**
     * Klickt auf den Link "JavaScript Alerts" und öffnet die AlertsPage.
     * @return ein neues AlertsPage-Objekt
     */
    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    /**
     * Private Hilfsmethode:
     * Klickt einen Link auf der Seite anhand seines sichtbaren Textes.
     * @param linktText der Text des Links
     */
    private void clickLink(String linktText){
        driver.findElement(By.linkText(linktText)).click();
    }
}
