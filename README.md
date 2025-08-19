
# Automated UI Tests for "The Internet"

## Beschreibung
Automatisiertes Testprojekt für die Website ["The Internet"](https://the-internet.herokuapp.com/) mit Selenium WebDriver und TestNG.  
Das Projekt überprüft verschiedene Webfunktionen, z. B.:  
- Login / Formularanmeldung  
- Dropdown-Auswahl  
- Alerts & Pop-ups  
- Horizontale Slider  
- Key Presses & Hover-Effekte  
- Passwort-Reset  

Ziel: Systematische Überprüfung der Weboberfläche und Beispiel für automatisierte UI-Tests.

## Technologien
- Java  
- Selenium WebDriver  
- TestNG  
- ChromeDriver  

## Projektstruktur
- `pages/` – Page Object Model Klassen für verschiedene Seiten  
- `base/` – Basisklassen für Setup & Teardown  
- `tests/` – Testklassen nach Funktionalität (Login, Dropdown, Alerts, Slider, etc.)

## Setup
1. Java & Maven installieren  
2. ChromeDriver installieren und in PATH einfügen  
3. Repository klonen:  
```bash
git clone <repository-url>
