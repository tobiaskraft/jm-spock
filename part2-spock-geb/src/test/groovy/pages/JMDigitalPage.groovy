package pages

import geb.Page

class JMDigitalPage extends Page {

  static url = "http://jaxenter.de/java-magazin-digital"

  static at = { title == "Java Magazin Elektronische Versionen | JAXenter.de" }

  static content = {
    subMenu { module SubMenuModule }
  }
}
