package pages

import geb.Page

class JMAbonnementPage extends Page {

  static url = "http://jaxenter.de/java-magazin-abo"

  static at = { title == "Java Magazin Abo | JAXenter.de" }

  static content = {
    subMenu { module SubMenuModule }
  }
}
