package pages

import geb.Page

class JMOrderPage extends Page {

  static at = { title == "Warenkorb | JAXenter.de" }

  static content = {
    headline { $(".field-name-field-headline-title") }
  }
}
