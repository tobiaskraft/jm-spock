package pages

import geb.Page

class JMDetailPage extends Page {

  static at = { title.startsWith("Java Magazin") }

  static content = {
    headline { $(".field-name-field-headline-title") }
    orderButton(to: JMOrderPage) { $('input', id: 'edit-submit') }

  }

  void orderMagazine() {
    orderButton.click()
  }

}
