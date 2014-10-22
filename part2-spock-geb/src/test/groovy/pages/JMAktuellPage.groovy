package pages

import geb.Page

class JMAktuellPage extends Page {

  static url = "https://jaxenter.de/Java-Magazin/Java-Magazin-1114-176447"

  static at = {
    title.startsWith("Java Magazin") && title.endsWith("| JAXenter.de")
  }

  static content = {
    subMenu { module SubMenuModule }
  }
}
